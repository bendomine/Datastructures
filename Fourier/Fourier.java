public class Fourier {
	// Code yoinked from https://rosettacode.org/wiki/Fast_Fourier_transform but translated into Java by me
	public static Complex[] FFT(int[] input){
		Complex[] out = new Complex[input.length];
		for (int i = 0; i < input.length; ++i){
			out[i] = new Complex(input[i], 0);
		}
		return FFT(out);
	}
	public static Complex[] FFT (Complex[] input){
		if (input.length <= 1) return input;
		Complex[] out = new Complex[input.length];
		Complex[] even = new Complex[input.length/2];
		Complex[] odd = new Complex[even.length];
		for (int i = 0; i < even.length; ++i){
			even[i] = new Complex(input[i * 2].getReal(), 0);
			odd[i] = new Complex(input[i * 2 + 1].getReal(), 0);
		}
		odd = FFT(odd);
		even = FFT(even);

		for (int i = 0; i < even.length; ++i){
			Complex t = new Complex(0, -2*Math.PI*i/input.length);
			t = t.exp().multiply(odd[i]);
			odd[i] = even[i].add(t);
			out[i] = even[i].add(t);
			even[i] = even[i].subtract(t);
			out[i + input.length/2] = even[i];
		}

		return out;
	}
}
