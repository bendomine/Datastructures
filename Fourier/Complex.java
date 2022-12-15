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
		// don't worry about it, I'll fix this when I need to use it
		return multiply(new Complex(1.0/o.getReal(), 1.0/o.getImaginary()));
	}

	public Complex exp(){
		// Code yoinked from https://rosettacode.org/wiki/Fast_Fourier_transform but translated to Java by me
		Complex out = new Complex(0, 0);
		double expReal = Math.exp(_this);
		out.setReal(expReal * Math.cos(imaginary));
		out.setImaginary(expReal * Math.sin(imaginary));
		return out;
	}

	

	public double getReal() {
		return this._this;
	}
	
	public double getImaginary(){
		return imaginary;
	}
	public void setReal(double _real){
		this._this = _real;
	}
	public void setImaginary(double _imaginary){
		this.imaginary = _imaginary;
	}
}