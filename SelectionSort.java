// This class implements the Selection Sort algorithm to sort an array of integers.
public class SelectionSort {
    
    // The main method is the entry point of the Java program.
    public static void main(String[] args) {
        // Define an unsorted integer array
        int[] array = {9, 2, 4, 6, 5, 1, 3, 7, 8, 10};
        
        // Call the selectionSort method to sort the array
        selectionSort(array);
        
        // Iterate through the sorted array and print each element
        for (int i : array) {
            System.out.print(i + " "); // Print numbers with a space for better readability
        }
    }

    /**
     * Sorts the input integer array using the Selection Sort algorithm.
     * 
     * Selection Sort works by repeatedly selecting the smallest element from the
     * unsorted portion of the array and swapping it with the first element of that portion.
     * 
     * @param array the input integer array to be sorted
     */
    private static void selectionSort(int[] array) {
        // Loop through the array, treating each element as a potential minimum
        for (int i = 0; i < array.length - 1; i++) {
            // Assume the current index (i) holds the smallest value in the unsorted part
            int minIndex = i;

            // Compare the current minimum value with the remaining unsorted elements
            for (int j = i + 1; j < array.length; j++) {
                // If a smaller value is found, update minIndex to the new smallest element's index
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            if (minIndex != i) { // Swap only if the minimum is not already in place
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }
}
