public class Datum {
	public int key;
	public boolean deleted;
	public Datum(int _key){
		key = _key;
		deleted = false;
	}
	public Datum(boolean _deleted){
		deleted = _deleted;
	}
}
