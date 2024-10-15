package com.bptn.course.knowledge_check._03_week_exercises;

import java.util.ArrayList;

public class MoveSmallestArrayList {

    public static void moveSmallest(ArrayList<Integer> list) {

        //Declares and stores smallest value.
        int smallest = list.get(0);

        // Iterate over the list to find the smallest value.
        
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < smallest) {
                smallest = list.get(i); // Update the smallest value
            }
        }
        
        // Move the smallest element to the front
        list.remove(Integer.valueOf(smallest)); // Remove the smallest element from its position
        list.add(0, smallest); 
    }

    public static void main(String[] args) {
        //instantiate ArrayList and fill with Integers
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = {3, 11, 54, 7, 1, 22};
        for (int i = 0; i < nums.length; i ++) {
            values.add(nums[i]);
        }
        moveSmallest(values);
        System.out.println("Expected Result:\t [1, 3, 11, 54, 7, 22]");
        System.out.println("Your Result:\t\t " + values);
    }
}