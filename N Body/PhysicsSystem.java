public class PhysicsSystem {
	public static void main(String[] args){
		Particle me = new Particle(1, -5, 0, 1);
		
		while (me.isFine()){
			me.updateMovement();
			me.updateEmotionalStatus();
			System.out.println(me);
		}
		System.out.println("\n The particle is no longer fine.");
	}
}
