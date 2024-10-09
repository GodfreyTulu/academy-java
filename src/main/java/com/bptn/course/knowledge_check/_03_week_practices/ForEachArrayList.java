package com.bptn.course.knowledge_check._03_week_practices;

import java.util.ArrayList;

public class ForEachArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> values = new ArrayList<Integer>();

		int[] nums = { 1, 44, 7, 9, -16, 3 };

		// Creates element variable to store the values of nums in each iteration
		for (int element : nums) {

			values.add(element); // Adds elements into an ArrayList

		}

		System.out.println("Expected Result:\t [1, 44, 7, 9, -16, 3]");
		System.out.println("Your Result:\t\t " + values);
	}
}