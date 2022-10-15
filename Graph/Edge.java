public class Edge {
	private Node from;
	private Node to;

	/**
	 * Constructor, initializes this edge with the specified from and to nodes
	 * @param from the node this edge should start from
	 * @param to the node this edge should connect to
	 */
	public Edge(Node from, Node to){
		this.from = from;
		this.to = to;
	}

	/**
	 * toString method
	 * @return a string displaying the node this edge starts from and connects to
	 */
	public String toString(){
		return from + " -> " + to;
	}

	/**
	 * gets the starting node of this edge
	 * @return the starting node of this edge
	 */
	public Node getFrom() {return this.from;}

	/**
	 * gets the node this edge connects to
	 * @return the node this edge connects to
	 */
	public Node getTo() {return this.to;}
}
