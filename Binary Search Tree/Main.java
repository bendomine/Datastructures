public class Main {
	public static void main(String[] args){
				
		// Test Code
		int pass = 0;
		int total = 0;

		/*
		 * +==================+
		 * |      Test 1      |
		 * |    Node class    |
		 * +==================+
		 */
		Node n = new Node();
		// set/get value;
		n.setValue(5);
		if (n.getValue() == 5) pass ++;
		total ++;
		// constructor
		n = new Node(null, 3);
		if (n.getValue() == 3) pass ++;
		total ++;
		// get parent
		n = new Node(new Node(null, 6), 2);
		if (n.getParent().getValue() == 6) pass ++;
		total ++;
		// default constructor
		n = new Node();
		if (n.getValue() == 0) pass ++;
		if (n.getLeftChild() == null) pass ++;
		if (n.getRightChild() == null) pass ++;
		if (n.getParent() == null) pass ++;
		total += 4;

		/*
		 * +==================+
		 * |      Test 2      |
		 * |  BST Constructor |
		 * +==================+
		 */
		BinarySearchTree bst = new BinarySearchTree();
		// get head + default constructor
		if (bst.getHead() == null) pass ++;
		total ++;
		// constructor
		bst = new BinarySearchTree(10);
		if (bst.getHead() != null) pass ++;
		if (bst.getHead().getValue() == 10) pass ++;
		if (bst.getHead().getParent() == null) pass ++;
		total += 3;


		/*
		 * +==================+
		 * |      Test 3      |
		 * |      Insert      |
		 * +==================+
		 */
		// test by making an example tree
		bst = new BinarySearchTree(3);
		bst.insert(2);
		if (bst.getHead().getLeftChild().getValue() == 2) pass ++;
		bst.insert(4);
		if (bst.getHead().getRightChild().getValue() == 4) pass ++;
		bst.insert(1);
		if (bst.getHead().getLeftChild().getLeftChild().getValue() == 1) pass ++;
		bst.insert(2);
		if (bst.getHead().getLeftChild().getLeftChild().getRightChild().getValue() == 2) pass ++;
		bst.insert(3);
		if (bst.getHead().getLeftChild().getRightChild().getValue() == 3) pass ++;
		bst.insert(5);
		if (bst.getHead().getRightChild().getRightChild().getValue() == 5) pass ++;
		bst.insert(3);
		if (bst.getHead().getLeftChild().getRightChild().getLeftChild().getValue() == 3) pass ++;
		bst.insert(4);
		if (bst.getHead().getRightChild().getLeftChild().getValue() == 4) pass ++;
		total += 8;
		// test with no head node
		bst = new BinarySearchTree();
		bst.insert(5);
		if (bst.getHead().getValue() == 5) pass ++;
		total ++;

		/*
		 * +==================+
		 * |      Test 4      |
		 * |      Minimum     |
		 * +==================+
		 */
		bst = new BinarySearchTree();
		bst.insert(3);
		bst.insert(2);
		bst.insert(4);
		bst.insert(1);
		bst.insert(5);
		bst.insert(9);
		if(bst.getMinimum().getValue() == 1) pass ++;
		total ++;
		if (bst.getMinimum(bst.getHead().getRightChild()).getValue() == 4) pass ++;
		total ++;

		/*
		 * +==================+
		 * |      Test 5      |
		 * |     Successor    |
		 * +==================+
		 */
		bst = new BinarySearchTree();
		bst.insert(3);
		bst.insert(1);
		bst.insert(4);
		bst.insert(1);
		bst.insert(5);
		bst.insert(9);
		bst.insert(2);
		bst.insert(7);
		Node sTest = bst.getMinimum();
		if (sTest.getValue() == 1) pass ++;
		sTest = bst.getSuccessor(sTest);
		if (sTest.getValue() == 1) pass ++;
		sTest = bst.getSuccessor(sTest);
		if (sTest.getValue() == 2) pass ++;
		sTest = bst.getSuccessor(sTest);
		if (sTest.getValue() == 3) pass ++;
		sTest = bst.getSuccessor(sTest);
		if (sTest.getValue() == 4) pass ++;
		sTest = bst.getSuccessor(sTest);
		if (sTest.getValue() == 5) pass ++;
		sTest = bst.getSuccessor(sTest);
		if (sTest.getValue() == 7) pass ++;
		sTest = bst.getSuccessor(sTest);
		if (sTest.getValue() == 9) pass ++;
		total += 8;



		System.out.println("\n");
		System.out.println("+============================+");
		System.out.println("|                            |");
		System.out.println("|        Test Results        |");
		System.out.println("|        Passed " + pass + "/" + total +"        |");
		System.out.println("|        Failed 0" + (total-pass) + "/" + total + "        |");
		System.out.println("|                            |");
		System.out.println("+============================+");
		System.out.println("\n");
	}
}
