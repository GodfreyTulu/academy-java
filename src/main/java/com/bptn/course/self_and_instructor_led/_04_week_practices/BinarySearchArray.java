package com.bptn.course.self_and_instructor_led._04_week_practices;

import java.util.Arrays;

public class BinarySearchArray {

    public void Start() {
    	
        int[] array = {3, 6, 1, 4, 2, 9, 7, 8, 5, 0};
        int key = 1;

        Arrays.sort(array); // Sort the array

        // Perform binary search
        int result = binarySearch(array, key);

        // Print the index of the found value or -1 if not found
        System.out.println(result);
    }

    int binarySearch(int arr[], int key) {
        int low = 0; // Starting index
        int high = arr.length - 1; // Ending index

        while (low <= high) {
            int mid = (low + high) / 2; // Calculate the middle index

            // Check if the key is present at mid
            if (arr[mid] == key) {
                return mid; // Key found, return the index
            }
            
            // If key is greater, ignore the left half
            if (arr[mid] < key) {
                low = mid + 1;
            } 
            // If key is smaller, ignore the right half
            else {
                high = mid - 1;
            }
        }

        return -1; // Key not found, return -1
    }

    public static void main(String[] args) {
        BinarySearchArray main = new BinarySearchArray();
        main.Start();
    }
}
