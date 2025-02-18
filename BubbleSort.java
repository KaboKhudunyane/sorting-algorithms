public class BubbleSort {
    public static void main(String[] args) {
        int numbersToSort[] = {5, 2, 9, 4, 6, 10, 8, 7, 3}; // Unsorted array
        sort(numbersToSort); // Call optimized Bubble Sort
        // Print sorted array
        for (int num : numbersToSort) {
            System.out.println(num);
        }
    }
    public static void sort(int[] arr) {
        int n = arr.length;
        boolean swapped; // Optimization: Track if swaps occur
        for (int i = 0; i < n - 1; i++) {
            swapped = false; // Reset swap flag at the beginning of each pass
            // Inner loop for comparisons and swaps
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) { // Swap if elements are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true; // Mark that a swap happened
                }
            }
            // If no swaps were made in this pass, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
}
