public class StackMain {
	public static void main (String[] args){
		int pass = 0;
		int fail = 0;
		int[] tests;
		Stack s = new Stack(5);

		s.push(5);
		if (s.pop() == 5) pass ++;
		else fail ++;

		s.push(1);
		s.push(2);
		if (s.pop() == 2) pass ++;
		else fail ++;

		s.push(6);
		s.push(7);
		if (s.pop() == 7) pass ++;
		else fail ++;
		if (s.pop() == 6) pass ++;
		else fail ++;
		if (s.pop() == 1) pass ++;
		else fail ++;
		
		tests = ExceptionTest(s);
		pass += tests[0];
		fail += tests[1];

		s.pop();


		System.out.println("\n+=============================+");
		System.out.println("Passed " + pass + "/" + (pass + fail) + " tests.");
		System.out.println("+=============================+\n");

		while (true){
			System.out.println(s.pop());
		}

	}
	static int[] ExceptionTest(Stack s) throws RuntimeException{
		int[] tests = new int[2];
		try{
			s.pop();

			tests[1] ++;
		}
		catch (RuntimeException e){
			if (e.getMessage().equals("StackUnderflow")) tests[0] ++;
			else tests[1] ++;
		}

		try{
			s.push(1);
			s.push(1);
			s.push(1);
			s.push(1);
			s.push(1);
			s.push(1);

			tests[1] ++;
		}
		catch (RuntimeException e){
			if (e.getMessage().equals("StackOverflow")) tests[0] ++;
			else tests[1] ++;
		}


		return tests;
	}
}
