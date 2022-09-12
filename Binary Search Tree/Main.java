public class Main {
	public static void main(String[] args){
				
		// Test Code
		int pass = 0;
		int total = 0;

		// Testing Node
		Node n = new Node();
		// set/get value;
		n.setValue(5);
		if (n.getValue() == 5) pass ++;
		total ++;
		// constructor
		n = new Node(null, 3);
		if (n.getValue() == 3) pass ++;
		total ++;
		// get parent
		n = new Node(new Node(null, 6), 2);
		if (n.getParent().getValue() == 6) pass ++;
		total ++;





		System.out.println("\n");
		System.out.println("+============================+");
		System.out.println("|                            |");
		System.out.println("|        Test Results        |");
		System.out.println("|        Passed 0" + pass + "/0" + total +"        |");
		System.out.println("|        Failed 0" + (total-pass) + "/0" + total + "        |");
		System.out.println("|                            |");
		System.out.println("+============================+");
		System.out.println("\n");
	}
}
