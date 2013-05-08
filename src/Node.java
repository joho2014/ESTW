class Node{
	private Node reference;
	private Object datum;

	public Node(Node ref, Object dat){
		reference = ref;
		datum = dat;
	}

	public String toString(){
		return datum.toString();
	}

	public Node next(){
		return reference;
	}

	public Object getDatum(){
		return datum;
	}

	public void setReference(Node n){
		reference = n;
	}

	public void append(Node n){
		if(reference == null){
			reference = n;
		}
		else reference.append(n);
	}
}