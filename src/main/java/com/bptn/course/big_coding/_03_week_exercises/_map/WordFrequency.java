package com.bptn.course.big_coding._03_week_exercises._map;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {
        String sentence = "This is a test sentence with no repeating words";

        // Split the sentence into words using split() method

        String [] words = sentence.split(" ");
        

        // Create a Map to store the frequency of each word
        Map<String, Integer> wordFrequency = new HashMap<>();

        /* 
         * Iterate through each word in the sentence
         * Use enhanced for loop and declare a new string.
         */

        for (String word : words) { 
            // If the word is already in the map, increment its frequency 
            if (wordFrequency.containsKey(word)) {

                wordFrequency.replace(word, wordFrequency.get(word)+ 1); // Replace same unique word with a different frequency value.
                
            }
            // If the word is not in the map, add it with a frequency of 1
            else {
               wordFrequency.put(word, 1); //Add new word and its frequency.
            }
        }

        // Print the frequency of each word
        System.out.println("Word frequency: " + wordFrequency);
    }
}

