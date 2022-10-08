public class LPHT{
	public Datum[] table;
	
	public LPHT(int l){
		table = new Datum[l];
	}

	int theBestAuxiliaryHashFunctionEverWritten(int k){
		return k % table.length;
	}

	int linearProbingHashFunctionAppropriateForNonIrishPeople(int k, int i){
		return (theBestAuxiliaryHashFunctionEverWritten(k) + i) % table.length;
	}

	int insert(int key){
		int j;
		for (int i = 0; i < table.length; ++i){
			j = linearProbingHashFunctionAppropriateForNonIrishPeople(key, i);
			if (table[j] == null || table[j].deleted == true){
				table[j] = new Datum(key);
				return j;
			}
		}
		throw new RuntimeException("Hash table overflow");
	}

	int search(int key){
		int j;
		for (int i = 0; i < table.length && table[i] != null; ++i){
			j = linearProbingHashFunctionAppropriateForNonIrishPeople(key, i);
			if (table[j].key == key) return j;
		}
		return -1;
	}

	void delete(int key){
		int j = search(key);
		if (j < 0) throw new RuntimeException("Key not found");
		table[j] = new Datum(true);
	}
}