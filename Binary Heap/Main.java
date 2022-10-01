public class Main {
	public static void main(String[] args){
		int pass = 0;
		int total = 0;

		// Testing getters and setters
		BinaryHeap heap = new BinaryHeap();
		int[] testArr = new int[2];
		heap.setTree(testArr);
		if (heap.getTree().equals(testArr)) pass ++;
		total ++;
	}
}
