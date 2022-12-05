public class Frog{
	public double[] coffee;
	public Frog(){}
	public Frog(double[] _coffee){
		coffee = _coffee;
	}

	public static Frog add(Frog a, Frog b){
		Frog retval = new Frog();
		retval.coffee = a.coffee.clone();
		retval.add(b);
		return retval;
	}

	public void add(Frog other){
		for (int i = 0; i < coffee.length; ++i){
			coffee[i] += other.coffee[i];
		}
	}
}