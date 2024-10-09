package com.bptn.course.knowledge_check._03_week_practices;

import java.util.ArrayList;

public class ReverseArrayList {

	public static ArrayList<Integer> reverse(ArrayList<Integer> list) {

		// Changed int (primitive data type) to Integer (Wrapper class)
		ArrayList<Integer> reversed = new ArrayList<>();
		for (Integer element : list) {

			reversed.add(0, element); // Adds elements in the new reversed ArrayList
		}
		return reversed;
	}

	public static void main(String[] args) {
		// instantiate ArrayList and fill with Integers
		ArrayList<Integer> values = new ArrayList<Integer>();
		int[] nums = { 1, 5, 7, 9, -2, 3, 2 };
		for (int i = 0; i < nums.length; i++) {
			values.add(nums[i]);
		}
		ArrayList<Integer> result = reverse(values); // Reverses the new values list.
		System.out.println("Expected Result:\t [2, 3, -2, 9, 7, 5, 1]");
		System.out.println("Your Result:\t\t " + result);
	}
}