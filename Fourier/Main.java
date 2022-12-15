public class Main {
	public static void main(String[] args) {
		int[] input = {1,1,1,1,0,0,0,0};
		Complex[] out = Fourier.FFT(input);

		for (int i = 0; i < out.length; ++i){
			System.out.print(out[i].getImaginary() + " ");
		}
	}
}
