/*
 * It may be a nit-picky thing, but in Java the "this.xxx" notation is generally frowned upon
 * because it makes the code more difficult to read. In professional code it is what is called
 * a bad "Code Smell" and typically is refactored if it exists. From an analysis perspective I wish that
 * the variables were uniquely named so you don't have to call "this" in order to specify scope.
 * See comment below above Sort() constructor.
 */

public class Sort {
	
	private int[] array;

	/*
	 * You could name the array passed to the constructor something like "givenArray" or whatever
	 * so that in the body of this it would only require "array = givenArray" instead of "this.array"
	 */
	Sort(int[] array) { 
        this.array = array;
    }

    public SortData bubbleSort() {
    	int swaps = 0;
    	int lastSwaps = 1;
    	int holder;
    	int[] newArray = this.array; //** Don't need "this.array". "array" would be fine
    	int comparisons = 0;
    	while(lastSwaps != 0) {
	    	lastSwaps = 0;
	    	for(int i = 0; i < newArray.length; i++) {
	    		int j = i + 1;
	    		if(j < newArray.length) {
	    			if(newArray[i] > newArray[j]) {

	    				// swap elements
	    				holder = newArray[j];
	    				newArray[j] = newArray[i];
	    				newArray[i] = holder;

	    				lastSwaps++;
	    				swaps++;
		    		}
		    		comparisons++;
	    		}
	    	}
    	}

    	// return original array length, number of swaps, number of loops
    	return new SortData(newArray.length, swaps, comparisons, "O(n^2)", "O(n)");
    }

    /*
    To-Do:
    bubbleSortBetter
    insertionSort
    selectionSort
    heapSort
    mergeSort
    quickSort

    add:
    memoryUsage?
    time
    */
}