public class vNode extends Node{
	private Object val;

	/**
	 * Constructor, initializes this vNode with the given value and sets its identifier to the hashcode of the given value
	 * @param val the value this node should take
	 */
	public vNode(Object val){
		super(val.hashCode());
		this.val = val;
	}

	/**
	 * toString method
	 * @return the string form of the value of this node
	 */
	public String toString(){
		return this.val.toString();
	}

	/**
	 * Gets this node's value 
	 * @return this node's value
	 */
	public Object getVal() {return this.val;}
}
