package com.bptn.course.teachbacks;

public class ArrayForLoop {

	public static void main(String[] args) {
		
		    /*
		    // 01. Traditional for loop / C for-loop
		
		    // Declare and Initialize an Array of numbers
		    int[] numbers = {10, 20, 30, 40, 50};

		    // Initialize sum variable
		    int totalSum = 0;
		    
		    // Traditional for loop to iterate through the array
		    for (int i = numbers.length -1; i >= 0; i--) {
		        System.out.println("Current number: " + numbers[i]);
		        totalSum += numbers[i];  // Add the current number to totalSum
		    }

		    // Print the total sum after the loop
		    System.out.println("Total sum: " + totalSum);
		    
		    */
		
		       // 02. For-each / Enhanced for-loop / As of Java 5
		     
		       // Array of numbers
               int[] numbers = {10, 20, 30, 40, 50};

               // Initialize sum variable
               int totalSum = 0;

               // For loop to iterate through the array
               for (int number : numbers) {
                   System.out.println("Current number: " + number);
                   totalSum += number;  // Add the current number to totalSum
               }

               // Print the total sum after the loop
                   System.out.println("Total sum: " + totalSum);
		     
		}

}

