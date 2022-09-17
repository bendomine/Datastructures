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

	/**
	 * Finds the minimum value in the specified subtree.
	 * This is done by starting at the node specified, and taking the left child of each node repeatedly until hitting null.
	 * The value of this node is the minimum.
	 * @param node the head of the subtree to find the minimum of
	 * @return the node with the least value in the subtree
	 */
	Node getMinimum(Node node){
		Node n = node;
		while (n.getLeftChild() != null){
			n = n.getLeftChild();
		}
		return n;
	}

	/**
	 * Finds the minimum value in the search tree.
	 * This just calls the getMinimum(Node) function with the tree's head node as the parameter.
	 * @return the minimum node in the search tree
	 */
	Node getMinimum(){
		return getMinimum(head);
	}

	/**
	 * Given a node, returns the node with the next highest value.
	 * The methodology is: if a node has a right subtree, the successor is the minimum of that subtree.
	 * Otherwise, the successor is the first ancestor of that node where that node is descended from the ancestor's left child.
	 * @param node the node to find the successor of
	 * @return the node with the next highest value
	 */
	Node getSuccessor(Node node){
		if (node.getRightChild() != null){
			return getMinimum(node.getRightChild());
		}
		else{
			Node n = node;
			while (n.getValue() > n.getParent().getValue()){
				n = n.getParent();
			}
			return n.getParent();
		}
	}

	/**
	 * Utility function for printing out the search tree
	 * Created by Dr. Kuszmaul
	 * @param node the node to start printing from
	 */
	void printWalk(Node node){
		if (node.getLeftChild() != null) printWalk(node.getLeftChild());
		System.out.println(" " + node.getValue());
		if (node.getRightChild() != null) printWalk(node.getRightChild());
	}

	/**
	 * Utility function for printing out the search tree
	 * Created by Dr. Kuszmaul
	 */
	void printWalk(){
		printWalk(head);
	}

	/**
	 * Removes a child (leaf) node by removing its parent's reference to it
	 * @param node the node to be scrubbed
	 */
	void scrub(Node node){
		if (node.getParent() != null){
			if (node.getValue() <= node.getParent().getValue()) node.getParent().setLeftChild(null);
			else node.getParent().setRightChild(null);
		}
		if (node.equals(head)) head = null;
	}

	/**
	 * Removes a node with only one child by assuming its child's value and children
	 * @param node the node to be spliced
	 */
	void splice(Node node){
		if (node.getLeftChild() != null){
			node.setValue(node.getLeftChild().getValue());
			node.setRightChild(node.getLeftChild().getRightChild());
			node.setLeftChild(node.getLeftChild().getLeftChild());
		}
		else if (node.getRightChild() != null){
			node.setValue(node.getRightChild().getValue());
			node.setLeftChild(node.getRightChild().getLeftChild());
			node.setRightChild(node.getRightChild().getRightChild());
		}
		if (node.getLeftChild() != null) node.getLeftChild().setParent(node);
		if (node.getRightChild() != null) node.getRightChild().setParent(node);
	}

	/**
	 * Deletes a node with two children by assuming the value of its successor and then deleting its successor.
	 * Successor is deleted by using scrub, as it can never have any children.
	 * @param node the node to be rotated out
	 */
	void rotate(Node node){
		Node n = getSuccessor(node);
		int nVal = n.getValue();
		scrub(n);
		node.setValue(nVal);
	}
	
	/**
	 * Deletes a node.
	 * Uses either scrub (no children), splice (one child), or rotate (two children).
	 * @param node the node to be deleted
	 */
	void delete(Node node){
		if (node.getLeftChild() == null && node.getRightChild() == null) scrub(node);
		else if (node.getLeftChild() == null || node.getRightChild() == null) splice(node);
		else{
			rotate(node);
		}
	}

	/**
	 * 
	 * @return this search tree's root node
	 */
	Node getHead() {return head;}
}