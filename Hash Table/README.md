All code written by Ben Domine.
Acknowledging Mr. Kuszmaul for teaching hash tables.

Classes
	Datum is a basic data type including only a value and key, solely for use by the main hash table class.
	DAHT is the main hash table class. It includes basic hash table functionality.
Methods
	Datum:
		Default constructor: initializes key and value to 0.
		Non-default constructor: initializes key and value to given parameters.
		getKey: gets the key.
		getVal: gets the value.
		setKey: sets the key.
		setVal: sets the value.
	DAHT:
		Default constructor: initializes table with size 1.
		Non-default constructor: initializes table with inputted size.
		insert: inserts the given value at the given key.
		get: gets the value at the given key.
		search: gets the key of the first instance of the given value, or returns -1 if such a value does not exist.
		delete: deletes the element at the given key.
		getSize: gets the size of the table.
		setSize: sets the size of the table (also clears it).
		