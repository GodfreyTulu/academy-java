package com.bptn.course.big_coding._05_week_excercises;

//Import the required classes
import java.util.HashMap;  // HashMap is used to store key-value pairs
import java.util.Map;      // Map is an interface that HashMap implements

public class TwoSum {
 // Method that finds and returns the indices of two numbers that add up to the target value
 public int[] twoSum(int[] nums, int target) {
     // Create a HashMap to store the value of each number and its index
     Map<Integer, Integer> map = new HashMap<>();
     
     // Loop through each number in the nums array
     for (int i = 0; i < nums.length; i++) {
         // Calculate the complement, which is the value we need to reach the target
         int complement = target - nums[i];
         
         // Check if the complement is already in the map (i.e., we've seen it before)
         if (map.containsKey(complement)) {
             // If the complement is found, return the indices: one for the complement and one for the current number
             return new int[] { map.get(complement), i };
         }
         
         // If the complement is not found, add the current number and its index to the map
         map.put(nums[i], i);
     }
     
     // If no solution is found, throw an error message (this shouldn't happen given the problem constraints)
     throw new IllegalArgumentException("No two sum solution");
 }
 // Do not modify the code below:
	// Main method to test the twoSum method
	public static void main(String[] args) {
		// Example array of integers
		int[] nums = { 2, 7, 11, 15 };

		// Example target value
		int target = 9;

		// Create a TwoSum object
		TwoSum solution = new TwoSum();

		// Call the twoSum method to get the indices of the two elements that add up to
		// the target value
		int[] indices = solution.twoSum(nums, target);

		// Print the result
		System.out.println("The indices are: " + indices[0] + " and " + indices[1]);
	}
}
