public class Node{
	private int id;

	/**
	 * Constructor, initializes this node with the specified identifier
	 * @param id the identifier for this node
	 */
	public Node(int id){
		this.id = id;
	}

	/**
	 * toString method
	 * @return a string containing the identifier of this node
	 */
	public String toString(){
		return ((Integer) this.id).toString();
	}

	/**
	 * Gets the id of the node
	 * @return the id of the node
	 */
	public int getId() {return this.id;}
}