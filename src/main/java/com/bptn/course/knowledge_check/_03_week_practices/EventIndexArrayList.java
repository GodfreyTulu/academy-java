package com.bptn.course.knowledge_check._03_week_practices;

import java.util.ArrayList;

public class EventIndexArrayList {

	public static void printEvenIndex(ArrayList<Integer> list) {

		// Sets the iteration from the beginning to the end.
		for (int i = 0; i < list.size(); i++) {

			// Changed i%2 == 0 since we need even indices.
			if (i % 2 == 0) {
				System.out.print(list.get(i) + ", ");
			}
		}
	}

	public static void main(String[] args) {
		// instantiate ArrayList and fill with Integers
		ArrayList<Integer> values = new ArrayList<Integer>();
		int[] nums = { 1, 5, 7, 9, -2, 3, 2 };
		for (int i = 0; i < nums.length; i++) {
			values.add(nums[i]);
		}
		System.out.println("Expected Result:\t 1, 7, -2, 2,");
		System.out.print("Your Result:\t\t ");
		printEvenIndex(values);
	}
}