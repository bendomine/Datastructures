public class Complex{
	private double _this; // Mr. Kuszmaul told me to
	private double imaginary;

	public Complex(double _real, double _imaginary){
		this._this = _real;
		imaginary = _imaginary;
	}

	public Complex add(Complex o){
		return new Complex(this._this + o.get_this(), imaginary+o.getImaginary());
	}

	public Complex multiply(Complex o){
		// (a + bi) (c + di) = ac-bd + (ad + bc)i
		return new Complex(this._this*o.getImaginary() - imaginary*o.get_this(), this._this*o.getImaginary() + imaginary*o.get_this());
	}

	

	public double get_this() {
		return this._this;
	}
	
	public double getImaginary(){
		return imaginary;
	}
}