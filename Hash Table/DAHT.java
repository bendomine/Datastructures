import java.util.NoSuchElementException;

public class DAHT{
	Datum[] table;

	/**
	 * Default constructor
	 * Initializes hash table with a size of 1
	*/
	public DAHT (){
		table = new Datum[1];
	}

	/**
	 * Non-default constructor
	 * Initializes hash table using inputted size
	 * @param size the size (number of elements) of the hash table
	 */
	public DAHT (int size){
		table = new Datum[size];
	}

	/**
	 * Inserts the given element to the table
	 * @param key the key to insert to
	 * @param val the value to insert
	 */
	public void insert (int key, int val){
		if (key >= table.length) throw new ArrayIndexOutOfBoundsException("Key is larger than table length.");
		if (key < 0) throw new ArrayIndexOutOfBoundsException("Negative key values are unsupported.");
		Datum d = new Datum(key, val);
		table[key] = d;
	}

	/**
	 * Gets the value at the given key
	 * @param key the key to get the value from
	 * @return the value at that key
	 */
	public int get (int key){
		if (key >= table.length) throw new ArrayIndexOutOfBoundsException("Key is larger than table length.");
		if (key < 0) throw new ArrayIndexOutOfBoundsException("Negative key values are unsupported.");
		if (table[key] == null) throw new NoSuchElementException();
		return table[key].getVal();
	}

	/**
	 * Searches the table for the first instance of the given value and gets the key, if it exists
	 * @param val the value to search for
	 * @return the key if the value was found, otherwise returns -1
	 */
	public int search(int val){
		for (int i = 0; i < table.length; ++ i){
			if (table[i] != null && table[i].getVal() == val) return table[i].getKey();
		}
		return -1;
	}

	/**
	 * Deletes an element from the table
	 * @param key the key of the element to delete
	 */
	public void delete(int key){
		table[key] = null;
	}

	/**
	 * Gets the size of the table
	 * @return the size of the table
	 */
	public int getSize() { return table.length; }

	/**
	 * Adjusts the size of the table
	 * Note: also clears table
	 * @param _size the new size for the table
	 */
	public void setSize(int _size) { table = new Datum[_size]; }
}