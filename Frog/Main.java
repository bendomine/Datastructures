public class Main {
	public static void main(String[] args){
		Frog a = new Frog(new double[] {1, 2, 3, 4});
		Frog b = new Frog(new double[] {4, 3, 2, 1});

		int pass = 0;
		int total = 0;
		if (a.coffee.equals(new double[]{1, 2, 3, 4})) pass ++;
		if (b.coffee.equals(new double[]{4, 3, 2, 1})) pass ++;
		total += 2;
		Frog c = Frog.add(a, b);
		if (c.coffee.equals(new double[]{5, 5, 5, 5})) pass ++;
		total ++;
		a.add(b);
		if (a.coffee.equals(new double[]{5, 5, 5, 5})) pass ++;
		total ++;
		b.add(a);
		if (b.coffee.equals(new double[]{9, 8, 7, 6})) pass ++;
		total ++;

		System.out.println("Passed " + pass + "/" + total + " tests.");
	}
}
