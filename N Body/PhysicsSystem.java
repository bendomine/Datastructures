public class PhysicsSystem {
	public static void main(String[] args){
		Particle p1 = new Particle(1, 0, 0, 0, "p1");
		Particle p2 = new Particle(1, 10, 0, 0, "p2");
		Particle p3 = new Particle(1, 20, 0, 0, "p3");
		double dt = 0.1;
		
		while (p1.isFine){
			p1.force = computeForce(p1, p2);
			p1.force += computeForce(p1, p3);
			p2.force = computeForce(p2, p1);
			p2.force += computeForce(p2, p3);
			p3.force = computeForce(p3, p1);
			p3.force += computeForce(p3, p2);

			p1.update(dt);
			p2.update(dt);
			p3.update(dt);

			System.out.println(p1);
			System.out.println(p2);
			System.out.println(p3);
		}
		System.out.println("\n The particle is no longer fine.");
	}

	// For this particular system, the force exerted on particle p1 by particle p2 is equal to the distance between them.
	// In other words, they get pulled towards each other.
	public static double computeForce(Particle p1, Particle p2){
		return p2.position - p1.position;
	}
}
