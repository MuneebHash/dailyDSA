package Arrays;

import java.util.Arrays;

public class QuickSort {

    // Partition method
    private static int partition(int[] array, int low, int high) {
        int pivot = array[high]; // Choose the last element as the pivot
        int i = low - 1;         // Index for smaller elements

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap the pivot element with the element at i+1
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1; // Return the pivot index
    }

    // Quicksort method
    public static void quicksort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high); // Partition the array

            // Recursively sort the two subarrays
            quicksort(array, low, pivotIndex - 1);   // Left subarray
            quicksort(array, pivotIndex + 1, high); // Right subarray
        }
    }

    public static void main(String[] args) {
        int[] myArray = {64, 34, 25, 12, 22, 11, 90, 5};

        // Call quicksort on the entire array
        quicksort(myArray, 0, myArray.length - 1);

        // Print the sorted array
        System.out.print("Sorted array: ");
        for (int num : myArray) {
            System.out.print(num + " ");
        }
    }
}

