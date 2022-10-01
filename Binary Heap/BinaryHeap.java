public class BinaryHeap{
	int[] tree;
	
	BinaryHeap(){
		tree = new int[0];
	}
	BinaryHeap(int size){
		tree = new int[size];
	}

	int getSize(){ return tree.length; }
	int[] getTree(){ return tree; }
	
	void setTree(int[] _tree){ tree = _tree; }
}