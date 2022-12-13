public class Convolver{
	static int[] function = {1, 1, 1, 1, 1, 1, 1};
	static int[] kernel = {0, 0, 0, 0, 0, 0, 0};

	public static int[] convolve(){
		int[] out = new int[function.length];
		for (int i = 0; i < function.length; ++i){
			int sum = 0;
			for (int j = 0; j < function.length; ++j){
				if (j - i < kernel.length && j - i > 0) sum += function[j] * kernel[j-i];
			}
			out[i] = sum;
		}
		return out;
	}

	public static void main(String[] args){
		function = new int[] {3, 1, 4, 1, 5};
		kernel = new int[] {0, 1, 1, 0, 0};
		int[] out = convolve();
		for (int i = 0; i < out.length; ++i){
			System.out.print(out[i] + " ");
		}

	}
}