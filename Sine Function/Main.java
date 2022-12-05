public class Main{
	static double sine(double n){
		if (n <= 0.00001) return n;
		return 2.0 * sine(n/2.0) * Math.sqrt(1-Math.pow(sine(n/2.0), 2));
	}
	public static void main(String[] args){
		int pass = 0;
		int total = 0;

		if (sine(0) == 0) pass ++;
		total ++;

		System.out.println(Math.abs(Math.sin(Math.PI/6.0)-sine(Math.PI/6.0)));
	}
}