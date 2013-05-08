class List{
	private Node head;

	public List(){
		head = null;
	}

	public List(Node n){
		head = n;
	}

	public Node getHead(){
		return head;
	}

	public void add(Object o){
		Node nHead = new Node(head, o);
		head = nHead;
	}

	public void append(Object o){
		if(head == null) this.add(o);
		else head.append(new Node(null, o));
	}

	public String toString(){
		String s = "(";
		Node next = head;
		while(next != null){
			if(next.next() == null) s = s + next.toString();
			else                  s = s + (next.toString() + ", ");
			next = next.next();
		}
		return (s + ")");
	}

	public List reverse(){
		List l = new List();
		Node next = head;
		while(next !=  null){
			l.add(next.getDatum());
			next = next.next();
		}
		return l;
	}

	public Object head(){
		if(head != null) return head.getDatum();
		else return null;
	}

	public List tail(){
		if(this.length() < 2) return new List();
		else return new List(head.next());
	}

	public Object last(){
		Node next = head;
		while(next != null){
			if(next.next() == null) return next.getDatum();
			next = next.next();
		}
		return null;
	}

	public List init(){
		return this.reverse().tail().reverse();
	}

	public Boolean nil(){
		if(head == null) return true;
		else return false;
	}

	public int length(){
		Node next = head;
		int i = 0;
		while(next != null){
			i++;
			next = next.next();
		}
		return i;
	}

	public void linkf(List l){
		if(l.getHead() != null){
			l.getHead().append(head);
			head = l.getHead();
		}
	}

	public void linkb(List l){
		getHead().append(l.getHead());
	}

	public Boolean inList(Object o){
		Node next = head;
		while(next != null){
			if(next.getDatum() == o) return true;
			next = next.next();
		}
		return false;
	}

	public void delete(Object o){
		if(head.getDatum() == o) head = head.next();
		if(length() > 0){
			Node next = head;
			while(next.next() != null){
				if(next.next().getDatum() == o){
					try{
						next.setReference(next.next().next());
					}
					catch (Exception e){
						next.setReference(null);
					}
				}
				next = next.next();
				if(next == null) break;
			}
		}
	}

}