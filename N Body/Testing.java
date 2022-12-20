public class Testing {
	public static void main(String[] args){
		int pass = 0;
		int total = 0;

		// Testing updateEmotionalStatus
		Particle p1 = new Particle(1, 2, 3, 4, "p1");
		p1.updateEmotionalStatus();
		if (p1.isFine) pass ++;
		p1.position = 200;
		p1.updateEmotionalStatus();
		if (!p1.isFine) pass ++;
		total += 2;

		// Testing updateAcceleration
		Particle p2 = new Particle(5, 0, 0, 10, "p2");
		p2.updateAcceleration();
		if (p2.acceleration == 2) pass ++;
		p2.mass = 20;
		p2.updateAcceleration();
		if (p2.acceleration == 0.5) pass ++;
		total += 2;

		// Testing updateVelocity
		Particle p3 = new Particle(1, 0, 0, 1, "p3");
		p3.updateAcceleration();
		p3.updateVelocity(1);
		if (p3.velocity == 1) pass ++;
		p3.force = 2;
		p3.updateAcceleration();
		p3.updateVelocity(1);
		if (p3.velocity == 3) pass ++;
		total += 2;

		// Testing updatePosition
		Particle p4 = new Particle(1, 0, 1, 0, "p4");
		p4.updatePosition(1);
		if (p4.position == 1) pass ++;
		p4.velocity = 2;
		p4.updatePosition(2);
		if (p4.position == 5) pass ++;
		total += 2;

		// Testing System.out.println
		System.out.println("Passed " + pass + "/" + total + " tests.");
	}
}
