public class Element {
	int value;
	Element previous;
	Element next;
	
	/**
	 * Default constructor, sets next and previous to null.
	 */
	Element(){
		previous = null;
		next = null;
	}

	/**
	 * Constructor, sets next and previous to null and sets value as provided
	 * @param _value the value to set this element to
	 */
	Element(int _value){
		value = _value;
		previous = null;
		next = null;
	}

	// Getters
	Element getNext() {return next;}
	Element getPrevious() {return previous;}
	int getValue() {return value;}

	// Setters
	void setNext(Element _next) {next = _next;}
	void setPrevious(Element _previous) {previous = _previous;}
	void setValue(int _value) {value = _value;}

}
