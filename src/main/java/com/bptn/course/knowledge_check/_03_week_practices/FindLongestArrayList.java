package com.bptn.course.knowledge_check._03_week_practices;

import java.util.ArrayList;

public class FindLongestArrayList {

    public static String findLongest(ArrayList<String> list) {
        
        // Initialize the longest string to the first element of the list
        String longest = list.get(0);

        // Iterate through the list to find the longest string
        for (String str : list) {
            
            if (str.length() > longest.length()) {
                longest = str; // Update the longest string when a longer one is found
            }
        }

        return longest; // Return the longest string found
    }

    public static void main(String[] args) {
        //instantiate ArrayList and fill with Strings
        ArrayList<String> values = new ArrayList<String>();
        String[] words = {"singapore", "cattle", "metropolitan", "turnstile"};
        for (int i = 0; i < words.length; i ++) {
            values.add(words[i]);
        }
        System.out.println("Expected Result:\t metropolitan");
        System.out.print("Your Result:\t\t ");
        System.out.println(findLongest(values));
    }
}