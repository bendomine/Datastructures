public class BinarySearchTree {
	Node head;
	
	BinarySearchTree(){
		head = null;
	}
	BinarySearchTree(int value){
		head = new Node(null, value);
	}

	void insert(int value){
		if (head == null) head = new Node(null, value);
		else{

			Node n = head;
			while (true){
				if (value <= n.value){
					if (n.leftChild != null) n = n.leftChild;
					else{
						Node a = new Node(n, value);
						n.setLeftChild(a);
						break;
					}
				}
				else{
					if (n.rightChild != null) n = n.rightChild;
					else{
						Node a = new Node(n, value);
						n.setRightChild(a);
						break;
					}
				}
			}

		}
	}
	/**
	 * 
	 * @return this search tree's root node
	 */
	Node getHead() {return head;}
}