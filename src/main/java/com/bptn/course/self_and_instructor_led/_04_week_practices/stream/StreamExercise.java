package com.bptn.course.self_and_instructor_led._04_week_practices.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamExercise {

    public static void main(String[] args) {
        // Create a list of strings
        List<String> words = new ArrayList<>(Arrays.asList("apple","banana","cherry","date","elderberry"));

        // Count the number of elements in the list
        // Use the stream() method to convert the list to a stream of strings
        // Use the count() terminal operation on the stream of strings
        
        long count = words.stream().count(); 
        

        // Print the count
        System.out.println("Count numbers of words in the list " +  count);

        // Iterate over the list and print each word using a lambda expression
        
        words.forEach(word -> System.out.println(word)); // Using lambda expression for iteration

        // Using a method reference, transform words to uppercase
        // map() is an intermediate operation that transforms each word to uppercase
        // collect is a terminal operation that collects the results into a list
        
        List<String> newList = words.stream()
                                    .map(String::toUpperCase) // Method reference to convert each word to uppercase
                                    .toList(); // Collecting the results into a new list


        // Print the list of words in uppercase
        System.out.println("Words in upper case " + newList );
    }
}