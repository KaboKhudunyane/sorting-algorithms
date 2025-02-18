// This class demonstrates the Insertion Sort algorithm, which sorts an array by 
// repeatedly taking an element and inserting it into its correct position in the sorted part.
public class InsertionSort {

    // The main method serves as the entry point of the program.
    public static void main(String[] args) {
        // Initialize an unsorted array of integers.
        int[] array = {5, 6, 7, 9, 8, 2, 4, 10, 1, 3};

        // Call the sort method to sort the array using the Insertion Sort algorithm.
        sort(array);

        // Print the sorted array.
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    /**
     * Sorts an array using the Insertion Sort algorithm.
     *
     * The algorithm works by maintaining a sorted section of the array.
     * It picks one element at a time from the unsorted section and places it 
     * at the correct position in the sorted section.
     *
     * @param array The array to be sorted.
     */
    public static void sort(int[] array) {
        // Start from the second element (index 1), as the first element is already considered sorted.
        for (int i = 1; i < array.length; i++) {
            int key = array[i]; // The element to be inserted into the sorted section.
            int j = i - 1; // Start comparing with the previous element.

            // Shift elements in the sorted section that are greater than 'key' to the right.
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j]; // Move the larger element one position ahead.
                j--; // Move one step backward to continue comparisons.
            }

            // Insert the 'key' at the correct position in the sorted section.
            array[j + 1] = key;
        }
    }
}
