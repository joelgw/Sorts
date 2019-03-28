public class Arrays {
    
    //** I want you to modify this so you specify the amount of elements you want when you call the
    //** method instead of a set 10,000. It will help with the time complexity analysis.
	private static int[] generateArray() {
		int[] randomInts = new int[10000];
		for(int i = 0; i < 10000; i++){
		    // Why the -0 +0 at the end? This will just run Math.random*10001
		    // Don't make the math complex if it doesn't need to be.
			randomInts[i] = (int) (Math.random() * ((10000 - 0) + 1)) + 0;
		}
		return randomInts;
	}

	public static void main(String[] args) {
		int[] array = generateArray();
		Sort sort = new Sort(array);
		SortData data = sort.bubbleSort();

		/* 
		 * I want you to write a method that will print the values you want instead of calling print
		 * statements in Main. Main is typically reserved for just a driver calling your classes/methods
		 * to execute their functionality. Right now you are only focused on printing the values
		 * for bubblesort, but will have to make modifications if you want to add in other sorting
		 * algorithms. 
		*/
		
		// display performance data
		System.out.println("Original Array Length: " + data.ogArrayLength);
		System.out.println("Number of swaps: " + data.swaps);
		System.out.println("Number of comparisons: " + data.comparisons);
	}
}