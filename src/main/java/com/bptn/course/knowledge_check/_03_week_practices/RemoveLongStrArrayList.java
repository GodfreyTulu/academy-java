package com.bptn.course.knowledge_check._03_week_practices;

import java.util.ArrayList;

public class RemoveLongStrArrayList {

    public static void removeLongStrings(ArrayList<String> list) {
        
        String removeLongStrings = "";

        //Checking the length of the string in the list moving backward.
        for (int i = list.size() - 1; i >= 0 ; i--){

            //Checking if the string's length if is longer than 4.
            if (list.get(i).length() > 4){

                removeLongStrings = list.remove(i);
            }
        }

    }

    public static void main(String[] args) {
        //instantiate ArrayList and fill with Strings
        ArrayList<String> values = new ArrayList<String>();
        String[] words = {"bathtub", "fish", "computer", "cat", "foo"};
        for (int i = 0; i < words.length; i ++) {
            values.add(words[i]);
        }
        removeLongStrings(values);
        System.out.println("Expected Result:\t [fish, cat, foo]");
        System.out.println("Your Result:\t\t " + values);
    }
}