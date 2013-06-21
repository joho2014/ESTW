public class Zug
{
	private String name;
	private List weg;
	private Datenmodell dm;
	private Gleisstueck position;

	public Zug(int s, int z, String n,Datenmodell d)
	{
		dm = d;
		name = n;
		weg = wegErstellen(s, z);
		position = (Gleisstueck)weg.head();
	}

	public Gleisstueck getPosition()
	{
		return position;
	}

	public String getName()
	{
		return name;
	}

/*	public Boolean nextTrack(){   
		if(weg.tail().head() == null || !((Gleisstueck)weg.tail().head()).gesperrt()){
			if(position != null) position.entsperren(this);
			weg = weg.tail();
			if(weg.head() == null){
				position = null;
				return true;
			}
			position = (Gleisstueck)weg.head();
			position.sperren(this);
		}
		return false;
	}*/

	public Boolean nextTrack(){
		Gleisstueck next = (Gleisstueck)((Node)((Node)(weg.find(position))).next()).getDatum();
		if(next == null){
			position.verlassen(this);
			return true;
		}
		if(position != null){
			System.out.println(next.befahrbar(this));
			System.out.println(position.verbindung(next));
			System.out.println(position.verbindung(next).befahrbar(position, next, this));
			System.out.println(next.getSperrer());
		}
		if(next.befahrbar(this) && (position == null || position.verbindung(next).befahrbar(position, next, this))){
			next.befahren(this);
			if(position != null)position.verlassen(this);
			position = next;
		}
		return false;
	}
	
	public List wegErstellen(int s, int z){
		List nR = new List();
		switch(s){
			case 0: switch(z){
						case 1: int[] trs1 = {17, 18, 29, 19, 20, 24, 25, 26, 7, 6, 27, 5}; nR = buildTracks(trs1); break;
						case 2: int[] trs2 = {17, 18, 29, 19, 20, 21, 22, 4, 28, 2}; nR = buildTracks(trs2); break;
						case 3: int[] trs3 = {17, 18, 29, 23, 24, 25, 26, 12}; nR = buildTracks(trs3); break;
					} break;
			case 1: switch(z){
						case 0: int[] trs4 = {9, 27, 1, 28, 3, 16, 15, 14, 13}; nR = buildTracks(trs4); break;
						case 2: int[] trs5 = {9, 27, 1, 2}; nR = buildTracks(trs5); break;
						case 3: int[] trs6 = {9,10, 11, 26, 12}; nR = buildTracks(trs6); break;
					} break;
			case 2: switch(z){
						case 0: int[] trs7 = {2, 28, 3, 16, 15, 14, 13}; nR = buildTracks(trs7); break;
						case 1: int[] trs8 = {2, 28, 3, 22, 25, 26, 7, 6, 27, 5}; nR = buildTracks(trs8); break;
						case 3: int[] trs9 = {2, 28, 3, 22, 25, 26, 12}; nR = buildTracks(trs9); break;
					} break;
			case 3: switch(z){
						case 0: int[] trs10 = {8, 7, 6, 1, 28, 3, 16, 15, 14, 13}; nR = buildTracks(trs10); break;
						case 1: int[] trs11 = {8, 7, 27, 5}; nR = buildTracks(trs11); break;
						case 2: int[] trs12 = {8, 7, 6, 27, 1, 2}; nR = buildTracks(trs12); break;
					} break;
		}
		return nR;
	}

	public Gleisstueck g(int gleisstueck){
		return dm.getGleisstueck(gleisstueck);
	}

	public List buildTracks(int[] trs){
		List l = new List();
		l.add(null);
		for(int i = 0; i < trs.length; i++){
			l.append(g(trs[i]));
		}
		l.append(null);
		return l;
	}
	
	public String toString(){
		if(position != null) return name + ": " + position.toString();
		else return name + ": null";
	}

	public void wegFreimachen(){
		Node node = weg.getHead();
		Weiche last = null;
		while(node != null){
			if(node.getDatum() != null){
				Gleisstueck gleis = ((Gleisstueck)node.getDatum());
				gleis.entsperren(this);
				if(gleis.nextW(last) != null) gleis.nextW(last).entsperren(this);
				last = gleis.nextW(last);
			}
			node = node.next();
		}
	}

	public void reservieren(){
		Node node = weg.getHead();
		Weiche last = null;
		while(node != null){
			if(node.getDatum() != null){
				Gleisstueck gleis = ((Gleisstueck)node.getDatum());
				gleis.sperren(this);
				if(gleis.nextW(last) != null){
					gleis.nextW(last).sperren(this);
					gleis.nextW(last).stellen(gleis, (Gleisstueck)(node.next().getDatum()), this);
				}
				last = gleis.nextW(last);
			}
			node = node.next();
		}
	}
}