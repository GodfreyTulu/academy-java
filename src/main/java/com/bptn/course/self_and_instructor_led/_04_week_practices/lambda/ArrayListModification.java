package com.bptn.course.self_and_instructor_led._04_week_practices.lambda;

import java.util.ArrayList;

public class ArrayListModification {
	
    public static void main(String[] args) {
        // Create an ArrayList

        ArrayList<String> language = new ArrayList<>();
         
        // Add elements to the ArrayList

        language.add("java");
        language.add("javascript");
        language.add("swift");
        language.add("python");        
        
        System.out.println("Original ArrayList:");
        // Print the original ArrayList using forEach and a lambda

        language.forEach( str -> System.out.println(str) );
        

        // Modify all elements to uppercase using replaceAll()
        language.replaceAll( str -> str.toUpperCase() );      

        
        System.out.println("\nUpdated ArrayList:");
        
        // Print the updated ArrayList using forEach and a lambda.
        language.forEach( str -> System.out.println(str) );
        
    }
}
