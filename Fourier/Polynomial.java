public class Polynomial{
	
	public static double[] synth_div(double[] num, double[] den){
		double[] retval = num.clone();
		double norm = den[0];
		for (int i = 0; i < num.length - den.length + 1; i++){
			retval[i] /= norm;
			double c = retval[i];
			if (c != 0){
				for (int j = 1; j < den.length; j++){
					retval[i + j] += -den[j] * c;
				}
			}
		}
		double separator = 1-den.length;
		double[] out = new double[retval.length + 1];
		for (int i = 0; i < retval.length; ++i){
			out[i] = retval[i];
		}
		out[out.length - 1] = separator;
		return out;
	}
}