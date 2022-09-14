public class BinarySearchTree {
	Node head;
	
	/*
	 * Default constructor
	 * Sets head/root to null
	 */
	BinarySearchTree(){
		head = null;
	}

	/**
	 * Constructor
	 * @param value The value the root/head node should take
	 */
	BinarySearchTree(int value){
		head = new Node(null, value);
	}

	/**
	 * Given a value, creates a new node and inserts it at the proper location in the search tree
	 * In this tree, a value less than or equal to its parent becomes the left child and a value greater than its parent
	 * 		becomes the right child (if possible).
	 * 
	 * The algorithm is as follows:
	 * 		
	 * 		Starting at the head node, if this node is less than or equal to the head node, try to place it on the left side.
	 * 		If this node is greater than the head node, try to place it on the right side.
	 * 		When attempting to place nodes:
	 * 			If this space is unoccupied:
	 * 				Create a new node with the specified value and set the parent appropriately
	 * 				Set the parent's appropriate child value to this node
	 * 				end
	 *			If the space is occupied:
	 *				Run this method with the node at the desired location as the head node (recursion)
	 * 
	 * @param value the value of the node to be added to the tree
	 * @param parent the head node of the tree or sub-tree the value should be inserted to
	 * @return the created node
	 */
	Node insert(int value, Node parent){
		Node _final;
		// Try to place new node as left child
		if (value <= parent.getValue()){
			if (parent.getLeftChild() == null){
				Node n = new Node(parent, value);
				parent.setLeftChild(n);
				return n;
			}
			else{
				_final = insert(value, parent.getLeftChild());
			}
		}
		else{
			if (parent.getRightChild() == null){
				Node n = new Node(parent, value);
				parent.setRightChild(n);
				return n;
			}
			else{
				_final = insert(value, parent.getRightChild());
			}
		}
		return _final;
	}

	/**
	 * Given a value, creates a new node and inserts it at the proper location in the search tree.
	 * If the head node does not exist, create one with this as the value and end.
	 * Note: this function is really acting as the entry point for a recursive function. See
	 * 		insert(int value, Node parent) for algorithm.
	 * This function just calls the above function with the tree's head node as the parent.
	 * 
	 * @param value the value to be added to the tree
	 * @return the created node
	 */
	Node insert(int value){
		if (head == null){
			head = new Node(null, value);
			return head;
		}
		return insert(value, head);
	}

	void output(){
		System.out.println(head.getValue());
		if (head.getLeftChild() != null) System.out.print(head.getLeftChild().getValue());
		else System.out.print("X");
		System.out.print("  ");
		if (head.getRightChild() != null) System.out.print(head.getRightChild().getValue());
		else System.out.print("X");

	}

	/**
	 * 
	 * @return this search tree's root node
	 */
	Node getHead() {return head;}
}