public class Sorter{
	public static int[] quickSort(int[] input){
		if (input.length < 2) return input;
		int pivot = input.length - 1;
		int[] lesser = new int[input.length];
		int[] greater = new int[input.length]; // Or equal to
		int lIndex = 0;
		int gIndex = 0;
		for (int i = 0; i < input.length; ++i){
			if (input[i] < input[pivot] && i != pivot){
				lesser[lIndex] = input[i];
				lIndex ++;
			}
			else if (i != pivot){
				greater[gIndex] = input[i];
				gIndex ++;
			}
		}
		lesser = Sorter.subArray(lesser, lIndex);
		greater = Sorter.subArray(greater, gIndex);
		lesser = Sorter.quickSort(lesser);
		greater = Sorter.quickSort(greater);

		int[] sorry = {input[pivot]};

		return Sorter.concatArray(Sorter.concatArray(lesser, sorry), greater);
	}

	public static int[] radixCountingSort(int[] input, int digit){ // Just for radix sort 
		int[] counts = new int[10];
		int[] out = new int[input.length];
		for (int i = 0; i < input.length; ++i){
			counts[getDigit(input[i], digit)] ++;
		}
		for (int i = 1; i < counts.length; ++i){
			counts[i] += counts[i-1];
		}
		for (int i = input.length - 1; i >= 0; i--){
			out[--counts[getDigit(input[i], digit)]] = input[i];
		}
		return out;
	}

	public static int[] radixSort(int[] input){
		int maxDigits = input[0];
		for (int i = 0; i < input.length; ++i){
			if (input[i] > maxDigits) maxDigits = input[i];
		}
		maxDigits = (int) Math.log10(maxDigits);
		for (int i = 0; i <= maxDigits; ++i){
			input = Sorter.radixCountingSort(input, i);
		}

		return input;
	}

	public static int[] heapSort(int[] input){
		int[] out = new int[input.length];
		int min = input[0];
		for (int i = 1; i < input.length; ++i){
			if (input[i] < min) min = input[i];
		}

		input = Sorter.heapify(input);
		for (int i = out.length - 1; i >= 0; i--){
			out[i] = input[0];
			input[0] = input[input.length - 1];
			input[input.length - 1] = min - 1;
			input = Sorter.swap(input, 0);
		}
		return out;
	}
	// The fun recursive one! Divide the input in half, merge sort each side, and merge both arrays by iterating through
	public int[] mergeSort(int[] input){
		return input;
	}

	public static int[] heapify(int[] input){ // Converts the data into a max-heap
		for (int i = input.length / 2 - 1; i >= 0; i--){
			input = Sorter.swap(input, i);
		}
		return input;
	}

	public static int[] swap(int[] input, int index){
		// If the greatest of the parent and its children is the right child
		if (input.length > index * 2 + 2 && Math.max(input[index * 2 + 1], Math.max(input[index * 2 + 2], input[index])) == input[index * 2 + 2]){
			int temp = input[index];
			input[index] = input[index * 2 + 2];
			input[index * 2 + 2] = temp;
			return Sorter.swap(input, index * 2 + 2);
		}
		else if (input.length > index * 2 + 1 && Math.max(input[index], input[index * 2 + 1]) == input[index * 2 + 1]){
			int temp = input[index];
			input[index] = input[index * 2 + 1];
			input[index * 2 + 1] = temp;
			return Sorter.swap(input, index * 2 + 1);
		}
		else return input;
	}

	public static int getDigit(int input, int digit){
		return input/(int) Math.pow(10, digit) % 10;
	}

	public static int[] subArray(int[] input, int endIndex){
		if (endIndex > input.length) return input;
		int[] out = new int[endIndex];
		for (int i = 0; i < endIndex; ++i){
			out[i] = input[i];
		}
		return out;
	}

	public static void printArray(int[] input){
		if (input.length < 1) return;
		for (int i = 0; i < input.length - 1; ++i){
			System.out.print(input[i] + ", ");
		}
		System.out.println(input[input.length - 1]);
	}

	public static int[] concatArray(int[] input1, int[] input2){
		int[] out = new int[input1.length + input2.length];
		for (int i = 0; i < out.length; ++i){
			if (i < input1.length) out[i] = input1[i];
			else out[i] = input2[i - input1.length];
		}
		return out;
	}
}
