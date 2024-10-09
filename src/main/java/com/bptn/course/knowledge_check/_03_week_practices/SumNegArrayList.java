package com.bptn.course.knowledge_check._03_week_practices;

import java.util.ArrayList;

public class SumNegArrayList {

    public static int sumNegValues(ArrayList<Integer> list) {

        int sumNegValues = 0;  // Declares and initializes the value of sumNegValues as zero

        //Loop through all the elements.
        for (int i = 0; i < list.size(); i++) {
            
            //Tracking all negative elements 
            if (list.get(i) < 0){

            sumNegValues += list.get(i); //Sum of the -ve elements.

            }
        }
        return sumNegValues; //returns the sum of the negative elements.
    }

    public static void main(String[] args) {
        //instantiate ArrayList and fill with Integers
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = {-2, 34, -11, 9, -6, 3};
        for (int i = 0; i < nums.length; i ++) {
            values.add(nums[i]);
        }
        System.out.println("Expected Result:\t -19");
        System.out.print("Your Result:\t\t ");
        System.out.println(sumNegValues(values));
    }
}