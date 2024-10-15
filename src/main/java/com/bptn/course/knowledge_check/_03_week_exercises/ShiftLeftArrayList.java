package com.bptn.course.knowledge_check._03_week_exercises;

import java.util.ArrayList;

public class ShiftLeftArrayList {

    public static void shiftLeftOne(ArrayList<Integer> list) {
        
        // Store the first element
        int firstElement = list.get(0);
        
        // Shift elements to the left
        for (int i = 1; i < list.size(); i++) {
            list.set(i - 1, list.get(i)); // Shift element at index i to index i-1
        }

        // Set the last element to the first element
        list.set(list.size() - 1, firstElement);

    }

    public static void main(String[] args) {
        //instantiate ArrayList and fill with Integers
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = {1, 2, 3, 4, 5};
        for (int i = 0; i < nums.length; i ++) {
            values.add(nums[i]);
        }
        shiftLeftOne(values);
        System.out.println("Expected Result:\t [2, 3, 4, 5, 1]");
        System.out.println("Your Result:\t\t " + values);
    }
}