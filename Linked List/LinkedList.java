public class LinkedList {
	Element head;

	LinkedList(){
		head = null;
	}

	LinkedList(int val){
		head = new Element(val);
	}
	
	// Head getter/setter
	Element getHead() {return head;}
	void setHead(Element _head) {head = _head;}

}
