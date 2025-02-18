// This class implements the Bubble Sort algorithm to sort an array of integers.
public class BubbleSort {

    // The main method serves as the entry point of the Java program.
    public static void main(String[] args) {
        // Initialize an unsorted array of integers.
        int numbersToSort[] = {5, 2, 9, 4, 6, 10, 8, 7, 3}; 
        
        // Call the optimized Bubble Sort method to sort the array.
        sort(numbersToSort);

        // Print the sorted array.
        for (int num : numbersToSort) {
            System.out.println(num);
        }
    }

    /**
     * Sorts the input integer array using the optimized Bubble Sort algorithm.
     * 
     * Bubble Sort works by repeatedly swapping adjacent elements if they are in 
     * the wrong order. The largest unsorted element "bubbles up" to its correct 
     * position in each iteration.
     * 
     * The optimization includes a swapped flag to detect if the array is already sorted.
     * If no swaps occur during a full pass, the function terminates early.
     * 
     * @param arr The integer array to be sorted.
     */
    public static void sort(int[] arr) {
        int n = arr.length; // Get the length of the array
        boolean swapped; // Flag to track if any swaps occur in an iteration

        // Outer loop controls the number of passes (n-1 in total)
        for (int i = 0; i < n - 1; i++) {
            swapped = false; // Reset swap flag at the beginning of each pass

            // Inner loop for comparing and swapping adjacent elements
            // The last i elements are already sorted, so we exclude them
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) { // Swap if elements are in the wrong order
                    int temp = arr[j];    // Temporary variable for swapping
                    arr[j] = arr[j + 1];  // Move the smaller element forward
                    arr[j + 1] = temp;    // Move the larger element backward
                    swapped = true;       // Mark that a swap happened in this pass
                }
            }

            // If no swaps were made in this pass, the array is already sorted
            if (!swapped) {
                break; // Terminate the sorting early
            }
        }
    }
}
