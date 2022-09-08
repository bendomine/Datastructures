public class Stack{
	private int[] ar;
	private int index;
	Stack(int size){
		ar = new int[size];
		index = 0;
	}
	void push(int in){
		if (index >= ar.length) throw(new RuntimeException("StackOverflow"));
		ar[index] = in;
		index ++;
	}
	int pop(){
		if (index <= 0){
			throw (new RuntimeException("StackUnderflow"));
		}
		return ar[--index];
	}
}