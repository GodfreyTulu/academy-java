package com.bptn.course._05_arrays;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		// We have 2 ways of declaring arrays.
		
		 /*
		  * Uses array to represent same data type in large quantity.
		  */
		
		  int i0 = 4;
		  int i1 = 5;
		  int i2 = 7;
		  int i3 = 2;
		  int i4 = 19;
		  int i5 = 14;
		  int i6 = 35;
		  int i7 = 46;
		  int i8 = 71;
		  int i9 = 28;
		  
		// 1. Declare and initialize the array (hard-coded values)
		
		int [] nums = {4, 5, 7, 2, 19, 14, 35, 46, 71, 28};
		
		nums [9] = 100;
		
		// 2. Declare and allocate memory for the array
		
		int [] nums2 = new int [10000000]; // uses new and data type to allocate memory for data/value
		
		
		     System.out.println(nums [9]);		// prints specific value.
		     System.out.println(Arrays.toString(nums)); // prints all the whole array

	    // Traditional for loop / C for-loop
		  for (int i = 0; i < nums.length; i++) {
		     System.out.println( nums[i] );
		     
		  } 
	
		// For-each / Enhanced for-loop / As of Java 5
		  for (int num : nums) {
		     System.out.println( num );
		  }
		  
		     String[] strs = {"Hello", "I", "love", "Java" };
		     System.out.println( Arrays.toString(strs) );
		  
		  for (String str : strs) {
		     System.out.println(str);
		  }

	}

}
