public class Zug
{
    private String name;
    private List weg;
    private Datenmodell dm;
    private Gleisstueck position;
    
    /**
     * Konstruktor für Züge
     * 
     * @param   s        Legt den Startbahnhof fest
     *          z        Legt den Zielbahnhof fest
     *          n        Legt den Namen des Zuges fest
     *          d        Erstellt ein Datenmodel
     */
    public Zug(int s, int z, String n,Datenmodell d)
    {
        dm = d;
        name = n;
        weg = wegErstellen(s, z);
        position = (Gleisstueck)weg.head();
    }

    /**
     * Gibt Position zurück
     * 
     * @return     Position des Zuges
     */
    public Gleisstueck getPosition()
    {
        return position;
    }

    /**
     * Gibt Name zurück
     *
     * @return     Name des Zuges
     */
    public String getName()
    {
        return name;
    }

    /**
     * Bewegt Zug auf nächstes Gleisstueck des Weges
     * 
     * @return     Wahrheitswert, ob Bewegung des Zugs erfolgreich war
     */
    public boolean nextTrack(){
        Gleisstueck next = (Gleisstueck)((Node)((Node)(weg.find(position))).next()).getDatum();
        if(next == null){
            position.verlassen(this);
            return true;
        }
        if(null != null){
            System.out.println("++++++++++++++++++++++++++++++++");
            System.out.println(weg);
            System.out.println(next);
            System.out.println(position);
            System.out.println(position.verbindung(next));
            System.out.println(position.verbindung(next).befahrbar(position, next, this));
            System.out.println(next.getSperrer());
            System.out.println("--------------------------------");
        }
        if(next.befahrbar(this) && (position == null || position.verbindung(next).befahrbar(position, next, this))){
            next.befahren(this);
            if(position != null)position.verlassen(this);
            position = next;
        }
        return false;
    }
    
    /**
     * Erstellt einen Weg
     * 
     * @param   s      Legt den Startbahnhof fest
     *          z      Legt den Zielbahnhof fest
     * @return     Eine Wegliste, die aus den zu befahrenden Gleisstuecken besteht
     */

public List wegErstellen(int s, int z){
        switch(s){
            case 0: s = 17; break;
            case 1: s = 9;  break;
            case 2: s = 2;  break;
            case 3: s = 8;  break;
        }
        switch(z){
            case 0: z = 13; break;
            case 1: z = 5;  break;
            case 2: z = 2;  break;
            case 3: z = 12; break;
        }
        return weg(s, z);
    }

public List weg(int s, int z){
    Gleisstueck ziel = g(z);
    Gleisstueck start = g(s);
    if(start.getAnfang() != null){
        for (int i = 0; i <= 1; i++) {
            if(start.getAnfang().optionen(start)[i] != null){
                List nW = new List();
                nW.append(start);
                nW.append(start.getAnfang().optionen(start)[i]);
                List weg = wegSuche(ziel, nW);
                if(!weg.nil()) return weg; 
            }
        }
    }
    if(start.getEnde() != null){
        for (int i = 0; i <= 1; i++) {
            if(start.getEnde().optionen(start)[i] != null){
                List nW = new List();
                nW.append(start);
                nW.append(start.getEnde().optionen(start)[i]);
                List weg = wegSuche(ziel, nW);
                if(!weg.nil()) return weg; 
            }
        }
    }
    return new List();
}

public List wegSuche(Gleisstueck z, List l){
    if(l.last() == z) return l;
    if(l.last() == null) return new List();
    if(l.length() < 2) return new List();
    if(l.init().inList(l.last())) return new List();
    Gleisstueck g = (Gleisstueck)(l.last());
    Gleisstueck gminus1 = (Gleisstueck)(l.init().last());
    Weiche nWeiche = g.nextW(g.verbindung(gminus1));
    Gleisstueck alt0 = nWeiche.optionen(g)[0];
    Gleisstueck alt1 = nWeiche.optionen(g)[1];
    List a0 = l.cp();
    a0.append(alt0);
    List a1 = l.cp();
    a1.append(alt1);
    if(wegSuche(z, a0).nil()){
        if(wegSuche(z, a1).nil()) return new List();
        else return wegSuche(z, a1);
    }
    else return wegSuche(z, a0);
}

    /**
     * Verkürzung der getGleisstueck Methode, um Code kürzer zu machen
     * 
     * @param   gleisstueck     Gleisstueck, dass aus Datenmodell geholt werden soll
     * @return     Gleisstueck
     */
    public Gleisstueck g(int gleisstueck){
        return dm.getGleisstueck(--gleisstueck);
    }

    /**
     * Hilfsmethode für wegErstellen
     * 
     * @param   trs     int Array der Nummer der Gleisstuecke enthält
     * @return     Eine Liste aus ints
     */
    public List buildTracks(int[] trs){
        List l = new List();
        l.add(null);
        for(int i = 0; i < trs.length; i++){
            l.append(g(trs[i]));
        }
        l.append(null);
        return l;
    }
    
    /**
     * toString Methode
     *
     * @return     String
     */
    public String toString(){
        if(position != null) return name + ": " + position.toString();
        else return name + ": null";
    }

    /**
     * Entsperrt Gleis
     * 
     */
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

    /**
     * Sperrt ein zu befahrendes Gleisstueck
     * 
     */
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