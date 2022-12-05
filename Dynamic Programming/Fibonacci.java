import java.util.HashMap;
public class Fibonacci{
	public static void main(String[] args){
		for (int i = 0; i < 50; ++i) System.out.println(fib(i));
	}

	static HashMap<Integer, Integer> fibs = new HashMap<Integer, Integer>();

	static int fib(int n){
		if (n < 2) return 1;

		int nm1 = fib(n-1);
		int nm2 = fib(n-2);
		
		return nm1 + nm2;
	}
}