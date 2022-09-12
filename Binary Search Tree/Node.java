public class Node {
	Node parent;
	Node leftChild;
	Node rightChild;
	int value;
	
	/*
	 * Default constructor, sets all references to null
	 * Sets value to zero
	 */
	Node(){
		parent = null;
		leftChild = null;
		rightChild = null;
		value = 0;
	}
	/**
	 * Instantiates this node with the specified parent and value
	 * @param _parent the parent of this node
	 * @param _value the value/key this node should hold
	 */
	Node(Node _parent, int _value){
		parent = _parent;
		value = _value;
		leftChild = null;
		rightChild = null;
	}

	/**
	 * Getter
	 * @return the value/key of this node
	 */
	int getValue() {return value;}

	/**
	 * Setter
	 * @param _value the value/key this node should hold
	 */
	void setValue(int _value) {value = _value;}

	/**
	 * Getter
	 * @return the left child of this node
	 */
	Node getLeftChild() {return leftChild;}

	/**
	 * Setter
	 * @param _child the left child to give this node
	 */
	void setLeftChild(Node _child) {leftChild = _child;}

	/**
	 * Getter
	 * @return the right child of this node
	 */
	Node getRightChild() {return rightChild;}

	/**
	 * Setter
	 * @param _child the right child to give this node
	 */
	void setRightChild(Node _child) {rightChild = _child;}

	/**
	 * Getter
	 * @return the parent of this node
	 */
	Node getParent() {return parent;}

	/**
	 * Setter
	 * @param _parent the parent this node should be assigned as a child to
	 */
	void setParent(Node _parent) {parent = _parent;}

}
