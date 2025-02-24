public class HeapSort {
    public static void main(String[] args) {
        // Initialize an unsorted array
        int[] array = {7, 3, 1, 5, 9, 8, 10, 2, 6, 4};
        // Call the sort method to sort the array
        sort(array);
        // Print the sorted array
        for (int i : array) System.out.print(i + " ");
    }
    // Method to perform Heap Sort
    public static void sort(int[] array) {
        int n = array.length; // Get the length of the array
        // Step 1: Build a max heap
        // Start from the last non-leaf node and heapify each node
        for (int i = n / 2 - 1; i >= 0; i--) {
            buildHeap(array, n, i);
        }
        // Step 2: Extract elements from the heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Swap the root (maximum element) with the last element
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            // Heapify the reduced heap (excluding the sorted elements)
            buildHeap(array, i, 0);
        }
    }
    // Method to heapify a subtree rooted at index i
    public static void buildHeap(int[] array, int n, int i) {
        int largest = i; // Initialize the largest as the root
        int left = 2 * i + 1; // Index of the left child
        int right = 2 * i + 2; // Index of the right child

        // If the left child is larger than the root
        if (left < n && array[left] > array[largest]) largest = left;

        // If the right child is larger than the largest so far
        if (right < n && array[right] > array[largest]) largest = right;

        // If the largest is not the root, swap and heapify the affected subtree
        if (largest != i) {
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;
            // Recursively heapify the affected subtree
            buildHeap(array, n, largest);
        }
    }
}
