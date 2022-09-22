public class Main {
	public static void main(String[] args) {
		int n = 20000; // Size of data structure
		int r = 100000; // Number of times to run
		int t;

		test(n, 100000);
		System.out.println();
		test(n, r*5);
		System.out.println();
		test(n, r*10);
		System.out.println();
		test(n, r*15);
		System.out.println();
		test(n, r*20);
		System.out.println();
		test(n, r*25);
	}
	static void test(int n, int r){
		
		LinkedList list = new LinkedList();
		for (int i = 0; i < n; ++i){
			list.insert(5);
		}
		Element el;
		long t1 = System.currentTimeMillis();
		for (int i = 0; i < r; ++i){
			el = list.insert(5);
			list.delete(el);
		}
		long t2 = System.currentTimeMillis();
		System.out.println("Time for Linked List: " + ((double) (t2-t1))/1000.0);

		BinarySearchTree tree = new BinarySearchTree();
		for (int i = 0; i < n; ++i){
			tree.insert(1);
		}
		Node node;
		t1 = System.currentTimeMillis();
		for (int i = 0; i < r; ++i){
			node = tree.insert(0);
			tree.delete(node);
		}
		t2 = System.currentTimeMillis();
		System.out.println("Time for Binary Search Tree: " + ((double) (t2-t1))/1000.0);
	}
}
