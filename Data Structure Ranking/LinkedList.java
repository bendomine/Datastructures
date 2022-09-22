public class LinkedList {
	Element head;

	LinkedList(){
		head = null;
	}

	LinkedList(int val){
		head = new Element(val);
	}

	/**
	 * Gets the final element in the linked list by starting with the head and getting the next element until it is null.
	 * @return the final element in the list
	 */
	Element getLast(){
		if (head == null) return null;
		Element el = head;
		while (el.getNext() != null) el = el.getNext();
		return el;
	}

	/**
	 * Inserts an element by creating a new element then setting its previous value to the final element and the final element's
	 * next value to the new element.
	 * @param val the value to be inserted
	 * @return the inserted element
	 */
	Element insert(int val){
		Element el = getLast();
		Element el1 = new Element(val);
		if (head != null) el.setNext(el1);
		el1.setPrevious(el);
		el1.setValue(val);
		if (head == null) head = el1;
		return el1;
	}

	/**
	 * Returns the first element in the list with the value inputted
	 * @param val the value to search for
	 * @return the first element in the list with this value
	 */
	Element search(int val){
		if (head == null) return null;
		Element el = head;
		while (el.getValue() != val){
			if (el.getNext() == null) return null;
			el = el.getNext();
		}
		return el;
	}

	void delete(Element el){
		if (el.getPrevious() != null && el.getNext() != null){
			el.getNext().setPrevious(el.getPrevious());
			el.getPrevious().setNext(el.getNext());
		}
		else if (el.getNext() == null){
			el.getPrevious().setNext(null);
		}
		else{
			head = el.getNext();
			head.setPrevious(null);
		}

		el.setNext(null);
		el.setPrevious(null);
	}
	
	// Head getter/setter
	Element getHead() {return head;}
	void setHead(Element _head) {head = _head;}

}
