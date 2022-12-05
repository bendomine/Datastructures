public class SyntheticDivisionTester {
	public static void main(String[] args){
		double[] numerator = new double[] {2.0, 0.0, 0.0};
		double[] denominator = new double[] {2.0, 0.0, 0.0};
		double[] result = Polynomial.synth_div(numerator, denominator);
		for (int i = 0; i < result[result.length - 1]; ++i){
			System.out.print(result[i] + " ");
		}
		System.out.println();
		for (int i = (int) result[result.length - 1]; i < result.length - 1; ++i){
			System.out.print(result[i] + " ");
		}
	}
}
