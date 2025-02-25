// Class to implement the QuickSort algorithm
public class QuickSort {
    public static void main(String[] args) {
        // Define an unsorted array
        int[] array = {6, 3, 1, 7, 8, 9, 10, 2, 4, 5};
        // Call the QuickSort function to sort the array
        sort(array, 0, array.length - 1);
        // Print the sorted array
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
    /**
     * Recursive QuickSort function
     * @param array The array to be sorted
     * @param start The starting index of the current partition
     * @param end The ending index of the current partition
     */
    public static void sort(int[] array, int start, int end) {
        if (start < end) { // Base condition: stop when start >= end
            // Find the pivot index after partitioning
            int pi = partition(array, start, end);
            // Recursively apply QuickSort to the left and right subarrays
            sort(array, start, pi - 1); // Sort elements before pivot
            sort(array, pi + 1, end);   // Sort elements after pivot
        }
    }
    /**
     * Partition function that selects a pivot and rearranges elements
     * @param array The array to partition
     * @param low The starting index
     * @param high The ending index (pivot)
     * @return The final position of the pivot
     */
    public static int partition(int[] array, int low, int high) {
        int pivot = array[high]; // Choosing the last element as the pivot
        int i = low - 1; // Pointer for elements smaller than the pivot
        // Iterate through the array and rearrange elements
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) { // If current element is smaller than pivot
                i++; // Move the boundary for smaller elements
                swap(array, i, j); // Swap the elements to maintain order
            }
        }
        // Move pivot to its correct position
        swap(array, i + 1, high);
        return i + 1; // Return the pivot's index
    }
    /**
     * Swap function to exchange two elements in the array
     * @param array The array containing elements to swap
     * @param i First element index
     * @param j Second element index
     */
    public static void swap(int[] array, int i, int j) {
        int temp = array[i]; // Temporary variable to hold one value
        array[i] = array[j]; // Swap values
        array[j] = temp; // Place temporary value in the other index
    }
}
