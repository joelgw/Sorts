public class SortData {
	public int ogArrayLength;
	public int swaps;
	public int comparisons;
	public String worstCase;
	public String bestCase;
	public String avgCase;

	SortData(int ogArrayLength, int swaps, int comparisons, String worstCase, String bestCase) { 
        this.ogArrayLength = ogArrayLength;
        this.swaps = swaps;
        this.comparisons = comparisons;
    }
}