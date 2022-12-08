import java.util.HashMap;
public class Fibonacci{
	public static void main(String[] args){
		for (int i = 0; i < 1500; ++i) System.out.println(fib(i));
	}

	static HashMap<Integer, Integer> fibs = new HashMap<Integer, Integer>();

	static int fib(int n){
		if (n < 2) return 1;
		if (fibs.containsKey(n)) return fibs.get(n);
		int nm1 = fib(n-1);
		int nm2 = fib(n-2);
		fibs.put(n, nm1 + nm2);
		return nm1 + nm2;
	}
}