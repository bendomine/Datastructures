public class Particle {
	private double position;
	private double velocity;
	private double acceleration;
	private double force;
	private double mass;
	private boolean isFine;

	// Constructors, pretty self explanatory, not very exciting
	public Particle(){
		mass = 1;
		position = 0;
		velocity = 0;
		force = 0;
		isFine = true;
	}
	public Particle(double mass){
		this.mass = mass;
		position = 0;
		velocity = 0;
		force = 0;
		isFine = true;
	}
	public Particle(double mass, double position){
		this.mass = mass;
		this.position = position;
		velocity = 0;
		force = 0;
		isFine = true;
	}
	public Particle(double mass, double position, double velocity){
		this.mass = mass;
		this.position = position;
		this.velocity = velocity;
		force = 0;
		isFine = true;
	}
	public Particle(double mass, double position, double velocity, double force){
		this.mass = mass;
		this.position = position;
		this.velocity = velocity;
		this.force = force;
		isFine = true;
	}

	// Updates emotional status based on an arbitrary condition, whether or not the object is beyond 10 position.
	public void updateEmotionalStatus(){
		if (position > 10) isFine = false;
		else isFine = true;
	}
	// Increases position by velocity 
	public void updatePosition(){
		position += velocity;
	}
	// Increases velocity by acceleration
	public void updateVelocity(){
		velocity += acceleration;
	}
	// Sets acceleration to force/mass, because Newton's second law
	public void updateAcceleration(){
		acceleration = force/mass;
	}
	// Because it makes the code look cleaner
	public void updateMovement(){
		updateAcceleration();
		updateVelocity();
		updatePosition();
	}

	// Printing!!
	public String toString(){
		if (isFine) return "Status: Fine | Position: " + position;
		return "Status: NOT FINE :(";
	}

	// This is the only variable the user is allowed to have.
	public boolean isFine() { return isFine; }
}
