public class Complex{
	private double _this; // Mr. Kuszmaul told me to; actually the real component
	private double imaginary;

	public Complex(double _real, double _imaginary){
		this._this = _real;
		imaginary = _imaginary;
	}

	public Complex add(Complex o){
		return new Complex(this._this + o.getReal(), imaginary+o.getImaginary());
	}

	public Complex multiply(Complex o){
		// (a + bi) (c + di) = ac-bd + (ad + bc)i
		return new Complex(this._this*o.getReal() - imaginary*o.getImaginary(), this._this*o.getImaginary() + imaginary*o.getReal());
	}

	public Complex subtract(Complex o){
		return new Complex(this._this - o.getReal(), imaginary - o.getImaginary());
	}

	public Complex divide(Complex o){
		return multiply(new Complex(1.0/o.getReal(), 1.0/o.getImaginary()));
	}

	

	public double getReal() {
		return this._this;
	}
	
	public double getImaginary(){
		return imaginary;
	}
}