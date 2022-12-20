public class Particle {
	public double position;
	public double velocity;
	public double acceleration;
	public double force;
	public double mass;
	public boolean isFine;
	public String name;

	// Constructors, pretty self explanatory, not very exciting.
	public Particle(){
		mass = 1;
		position = 0;
		velocity = 0;
		force = 0;
		isFine = true;
		name = "";
	}
	public Particle(double mass, double position, double velocity, double force, String name){
		this.mass = mass;
		this.position = position;
		this.velocity = velocity;
		this.force = force;
		isFine = true;
		this.name = name;
	}

	// Updates emotional status based on an arbitrary condition, whether or not the object is beyond 100 position.
	// Emotional status currently determines whether or not the loop should continue.
	public void updateEmotionalStatus(){
		if (position > 100) isFine = false;
		else isFine = true;
	}
	// Increases position by velocity, multiplied by timescale
	public void updatePosition(double dt){
		position += velocity * dt;
	}
	// Increases velocity by acceleration, multiplied by timescale
	public void updateVelocity(double dt){
		velocity += dt * acceleration;
	}
	// Sets acceleration to force/mass, because Newton's second law. Not multiplied by timescale
	public void updateAcceleration(){
		acceleration = force/mass;
	}
	// Combines all previous methods to minimize annoyance
	public void update(double dt){
		updateAcceleration();
		updateVelocity(dt);
		updatePosition(dt);
		updateEmotionalStatus();
	}

	// Printing
	public String toString(){
		if (isFine) return "Name: " + name + " | Status: Fine | Position: " + position;
		return "Name: " + name + " | Status: NOT FINE :(";
	}

}
