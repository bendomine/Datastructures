public class CalculateTheThing {
	public static void main(String[] args){
		System.out.println(Yeah(2.23));
	}
	public static double Yeah(double x){
		double thingy;
		double thing1 = (-1.0 + Math.sqrt(5.0))/2.0;
		double thing2 = (-1.0 - Math.sqrt(5.0))/2.0;
		thingy = Math.pow(thing1, x) - Math.pow(thing2, x);

		return (Math.pow((-1.0 + Math.sqrt(5.0))/2.0, x) - Math.pow((-1.0 - Math.sqrt(5.0))/2.0, x));
	}
}
