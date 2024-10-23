package com.bptn.course.big_coding._05_week_excercises;

public class InsertionSort {
    // This method sorts an array in ascending order using insertion sort algorithm
    public static void insertionSort(int[] arr) {
        
        // Check if the array is null or has less than 1 element
        if (arr == null || arr.length < 1) {
            return; // Return if the array is null or has less than 1 element
        }
        
        // Loop through the array starting from index 1 to the length of the array
        for (int i = 1; i < arr.length; i++) {
            // Store the current element
            int current = arr[i]; // Save the current element for comparison
            // Initialize j with i - 1
            int j = i - 1; // Start comparing with the previous element
            
            // Inner loop to compare current element with elements before it in the array
            while (j >= 0 && current < arr[j]) {
                // Shift the element to the right
                arr[j + 1] = arr[j]; // Move the larger element one position to the right
                // Decrement j to compare with next element
                j--; // Move to the left in the array
            }
            // Insert the current element at its correct position
            arr[j + 1] = current; // Place the current element in the correct position
        }
    }
  
    // Do not modify below code
    public static void main(String[] args) {
        // Initialize the array
        int[] arr = {3, 4, 1, -2, 4, 8}; // Sample array with unsorted integers
        // Call the sort method to sort the array
        insertionSort(arr); // Sort the array using the insertion sort method
        // Print the sorted array
        System.out.print("Sorted array: "); // Message before printing the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // Print each number in the sorted array
        }
    }
}
