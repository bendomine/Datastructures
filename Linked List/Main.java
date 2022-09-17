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

		// Testing getLast
		list = new LinkedList(8);
		if (list.getLast().getValue() == 8) pass ++;
		el = new Element(5);
		list.getHead().setNext(el);
		if (list.getLast().equals(el)) pass ++;
		el1 = new Element(6);
		el.setNext(el1);
		if (list.getLast().equals(el1)) pass ++;
		total += 3;

		// Testing insert
		list = new LinkedList();
		list.insert(3);
		if (list.getHead().getValue() == 3) pass ++;
		list.insert(1);
		if (list.getHead().getNext().getValue() == 1) pass ++;
		if (list.getHead().getNext().getPrevious().getValue() == 3) pass ++;
		list.insert(4);
		if (list.getHead().getNext().getNext().getValue() == 4) pass ++;
		if (list.getHead().getNext().getNext().getPrevious().getValue() == 1) pass ++;
		total += 5;

		// Testing search
		list = new LinkedList();
		list.insert(3);
		list.insert(1);
		list.insert(4);
		list.insert(1);
		if (list.search(3).getValue() == 3) pass ++;
		if (list.search(3).equals(list.getHead())) pass ++;
		if (list.search(1).getValue() == 1) pass ++;
		if (list.search(1).equals(list.getHead().getNext())) pass ++;
		if (list.search(4).getValue() == 4) pass ++;
		if (list.search(4).equals(list.getHead().getNext().getNext())) pass ++;
		total += 6;

		// Testing delete
		list = new LinkedList();
		list.insert(3);
		list.insert(1);
		list.insert(4);
		list.insert(1);
		list.delete(list.getHead());
		if (list.getHead().getValue() == 1) pass ++;
		if (list.getHead().getPrevious() == null) pass ++;
		if (list.getHead().getNext().getValue() == 4) pass ++;
		total += 3;
		list.delete(list.getLast());
		if (list.getLast().getValue() == 4) pass ++;
		total ++;
		list.insert(3);
		list.delete(list.getHead().getNext());
		if (list.getHead().getValue() == 1) pass ++;
		if (list.getHead().getNext().getValue() == 3) pass ++;
		if (list.getLast().getPrevious().getValue() == 1) pass ++;
		total += 3;


		
		System.out.println("\n\nTests passed: " + pass + "/" + total + ".\n\n");
	}
}