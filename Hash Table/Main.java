import java.util.NoSuchElementException;

public class Main{
	public static void main(String[] args){
		if (!testHTDefaultConstructor()) System.out.println("Hash Table default constructor failed.");
		if (!testHTConstructor()) System.out.println("Hash Table non-default constructor failed.");
		if (!testDatumDefaultConstructor()) System.out.println("Datum default constructor failed.");
		if (!testDatumConstructor()) System.out.println("Datum default non-constructor failed.");
		if (!testHTSetSize()) System.out.println("Hash Table setSize() failed.");
		if (!testDatumSetters()) System.out.println("Datum setters failed.");
		if (!testInsertOverflow()) System.out.println("Hash Table insert() overflow testing failed.");
		if (!testInsertUnderflow()) System.out.println("Hash Table insert() underflow testing failed.");
		if (!testGetOverflow()) System.out.println("Hash Table get() overflow testing failed.");
		if (!testGetUnderflow()) System.out.println("Hash Table get() underflow testing failed.");
		if (!testGetNull()) System.out.println("Hash Table get() null testing failed.");
		if (!testInsertGet()) System.out.println("Hash Table insert()/get() general testing failed.");
		if (!testSearchNotFound()) System.out.println("Hash Table search() not found testing failed.");
		if (!testSearch()) System.out.println("Hash Table search() general testing failed.");
		if (!testDelete()) System.out.println("Hash Table delete() general testing failed.");
		System.out.println("Testing complete. If there is no other console output, all tests were passed.");
		
	}
	public static boolean testHTDefaultConstructor(){
		DAHT ht = new DAHT();
		if (ht.getSize() == 1) return true;
		return false;
	}
	public static boolean testHTConstructor(){
		DAHT ht = new DAHT(7);
		if (ht.getSize() == 7) return true;
		return false;
	}
	public static boolean testDatumDefaultConstructor(){
		Datum d = new Datum();
		if (d.getVal() == 0 && d.getKey() == 0) return true;
		return false;
	}
	public static boolean testDatumConstructor(){
		Datum d = new Datum(10, 15);
		if (d.getKey() == 10 && d.getVal() == 15) return true;
		return false;
	}
	public static boolean testHTSetSize(){
		DAHT ht = new DAHT(5);
		ht.setSize(60);
		if (ht.getSize() == 60) return true;
		return false;
	}
	public static boolean testDatumSetters(){
		Datum d = new Datum();
		d.setKey(21);
		d.setVal(82);
		if (d.getVal() == 82 && d.getKey() == 21) return true;
		return false;
	}
	public static boolean testInsertOverflow(){
		DAHT ht = new DAHT(3);
		try{
			ht.insert(4, 2);
		}
		catch (Exception e){
			if (e.getMessage().equals("Key is larger than table length.")) return true;
		}
		return false;
	}
	public static boolean testInsertUnderflow(){
		DAHT ht = new DAHT(3);
		try{
			ht.insert(-1, 2);
		}
		catch (Exception e){
			if (e.getMessage().equals("Negative key values are unsupported.")) return true;
		}
		return false;
	}
	public static boolean testGetOverflow(){
		DAHT ht = new DAHT(3);
		try{
			ht.get(4);
		}
		catch (Exception e){
			if (e.getMessage().equals("Key is larger than table length.")) return true;
		}
		return false;
	}
	public static boolean testGetUnderflow(){
		DAHT ht = new DAHT(3);
		try{
			ht.get(-1);
		}
		catch (Exception e){
			if (e.getMessage().equals("Negative key values are unsupported.")) return true;
		}
		return false;
	}
	public static boolean testGetNull(){
		DAHT ht = new DAHT(3);
		try{
			ht.get(2);
		}
		catch (NoSuchElementException e){
			if (e != null) return true;
		}
		return false;
	}
	public static boolean testInsertGet(){
		DAHT ht = new DAHT(4);
		ht.insert(2, 301);
		if (ht.get(2) == 301) return true;
		return false;
	}
	public static boolean testSearchNotFound(){
		DAHT ht = new DAHT(4);
		if (ht.search(5) == -1) return true;
		return false;
	}
	public static boolean testSearch(){
		DAHT ht = new DAHT(3);
		ht.insert(0, 5);
		ht.insert(1, 9);
		ht.insert(2, 2);
		if (ht.search(5) == 0 && ht.search(9) == 1 && ht.search(2) == 2) return true;
		return false;
	}
	public static boolean testDelete(){
		DAHT ht = new DAHT(3);
		ht.insert(1, 10);
		ht.delete(1);
		try{
			ht.get(1);
		}
		catch (NoSuchElementException e){
			if (e != null) return true;
		}
		return false;
	}
}