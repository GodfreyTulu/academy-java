package com.bptn.course.self_and_instructor_led._04_week_practices.sorting;

public class QuickSort {

    // Method to perform quick sort on an array
    public static void quickSort(int[] arr, int low, int high) {
    	
        if (low < high) { //Base case
        	
            // Partition the array and get the pivot index
            int pivotIndex = partition(arr, low, high);

            // Recursively apply quick sort to the left of the pivot
            quickSort(arr, low, pivotIndex - 1);

            // Recursively apply quick sort to the right of the pivot
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Method to partition the array
    public static int partition(int[] arr, int low, int high) {
        // Choose the last element as the pivot
        int pivot = arr[high];

        // Index to place elements smaller than the pivot
        int i = low - 1;

        // Loop through the array and rearrange elements
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;  // Increment the index of smaller elements
                swap(arr, i, j);  // Swap smaller element with the current element
            }
        }

        // Place the pivot in its correct position
        swap(arr, i + 1, high);

        // Return the index of the pivot
        return i + 1;
    }

    // Method to swap two elements in the array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Main method to test the quick sort
    public static void main(String[] args) {
        int[] arr = { 10, 80, 30, 90, 40, 50, 70 };
        
        System.out.println("Original array:");
        printArray(arr);

        // Call quick sort on the entire array
        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        printArray(arr);
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
