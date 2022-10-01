public class Datum {
	int key;
	int val;

	/**
	 * Default constructor
	 * Sets key and value pair each to 0
	 */
	public Datum (){
		key = 0;
		val = 0;
	}

	/**
	 * Constructor
	 * Sets key and value according to parameters
	 * @param _key the key of this datum
	 * @param _val the value of this datum
	 */
	public Datum (int _key, int _val){
		key = _key;
		val = _val;
	}

	/**
	 * Gets the key of this datum
	 * @return the key of this datum
	 */
	public int getKey(){ return key; }
	/**
	 * Gets the value of this datum
	 * @return the value of this datum
	 */
	public int getVal(){ return val; }
	/**
	 * Sets the key of this datum
	 * @param _key the new key for this datum
	 */
	public void setKey(int _key){ key = _key; }
	/**
	 * Sets the value of this datum
	 * @param _val the new value for this datum
	 */
	public void setVal(int _val){ val = _val; }
}
