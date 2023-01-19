import java.util.HashMap;

public class TruthAssignment {
	private HashMap<String, Boolean> theRep;
	
	public TruthAssignment(){
		theRep = new HashMap<String, Boolean>();
	}

	public void add(String proC, boolean value){
		theRep.put(proC, value);
	}
	public boolean get(String value){
		return theRep.get(value);
	}
}
