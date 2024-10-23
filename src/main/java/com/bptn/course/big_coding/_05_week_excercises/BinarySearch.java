package com.bptn.course.big_coding._05_week_excercises;

//Import Arrays class for using array-related methods like sorting
import java.util.Arrays;

public class BinarySearch {

 // Method to perform binary search on an unsorted array to find the key
 public static int binarySearch(int[] arr, int key) {
     // First, sort the array in ascending order to apply binary search correctly
     Arrays.sort(arr);
     
     // Initialize two pointers: 
     // 'low' starts at the first element (index 0), 
     // 'high' starts at the last element (index arr.length - 1)
     int low = 0;
     int high = arr.length - 1;

     // Keep checking while the 'low' pointer is less than or equal to the 'high' pointer
     while (low <= high) {
         // Find the middle index between 'low' and 'high'
         int mid = (low + high) / 2;
         
         // Check if the middle element is the key we're looking for
         if (arr[mid] == key) {
             // If found, return the index of the key
             return mid;
         }
         // If the middle element is smaller than the key, move 'low' to the right (mid + 1)
         else if (arr[mid] < key) {
             low = mid + 1;
         }
         // If the middle element is larger than the key, move 'high' to the left (mid - 1)
         else {
             high = mid - 1;
         }
     }
     // If the key is not found in the array, return -1
     return -1;
 }

 // Do not modify the code below
 public static void main(String[] args) {

     // Create an array of integers
     int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
     // The key element we want to find in the array
     int key = 22;

     // Call the binarySearch method to find the index of the key
     int result = binarySearch(arr, key);

     // Print whether the key was found or not
     if (result == -1) {
         // If result is -1, it means the element was not found
         System.out.println("Element not found in the array");
     } else {
         // If result is not -1, print the index where the element was found
         System.out.println("Element found at index " + result);
     }
 }
}
