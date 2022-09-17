public class Main{
	public static void main(String[] args){
		int pass = 0;
		int total = 0;

		// Testing Element getters + setters
		Element el = new Element();
		Element el1 = new Element();
		el.setNext(el1);
		if (el.getNext().equals(el1)) pass ++;
		total ++;
		el.setPrevious(el1);
		if (el.getPrevious().equals(el1)) pass ++;
		total ++;
		el.setValue(5);
		if (el.getValue() == 5) pass ++;
		total ++;

		// Testing Element constructor
		el = new Element(7);
		if (el.getValue() == 7) pass ++;
		total ++;

		// Testing LinkedList get/set head
		LinkedList list = new LinkedList();
		list.setHead(new Element(4));
		if (list.getHead().getValue() == 4) pass ++;
		total ++;

		// Testing LinkedList constructor
		list = new LinkedList(10);
		if (list.getHead().getValue() == 10) pass ++;
		total ++;

		
		System.out.println("\n\nTests passed: " + pass + "/" + total + ".\n\n");
	}
}