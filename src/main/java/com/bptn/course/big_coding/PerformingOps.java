package com.bptn.course.big_coding;

import java.util.Scanner;

public class PerformingOps {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("/....Calculator Menu..../");
        System.out.println("Press 1 for Palindrome Check");
        System.out.println("Press 2 to reverse a String");
        System.out.println("Press 3 co Concatenate two Strings");
        System.out.println("Press 4 for String Comparison");
        System.out.println("Press 5 to Calculate the length of String");
        
        int press = scan.nextInt();
        scan.nextLine(); // Removes Buffer input "Enter" happens when mixing nextInt and nextLine
        
        String palindrome = ""; // A String is palindrome if it can be read backwards eg. Madam.
        String reverseStr = "";
        String concatenateStrs = "";
        int lengthOfStr;
        


        if (press == 1){
        	
            System.out.println("Enter the String: ");            String str = scan.nextLine();

            for (int i = str.length()-1; i>=0; i-- ){

                palindrome += str.charAt(i);       
            }      
                if (str.toLowerCase().equals(palindrome.toLowerCase())){
                	
                	// Uses .toLowerCase to ignore capital letter.
                    System.out.println(str + " is a palindrome");
            } 
                else {
                	
                	System.out.println(str + " is not a palindrome");
                	               	                }
         }
        
         else if (press == 2) {
        	 
        	 System.out.println("Enter the String");
        	 String str = scan.nextLine();
        	 
        	 for (int i = str.length() - 1; i >= 0; i--) {
        		 
        		 reverseStr = reverseStr + str.charAt(i);
         	 }
        	 
        	 System.out.println("The reversed String is: " + reverseStr); 
        	         	 
         }
        
         else if (press == 3) {
        	 
        	 System.out.println("Enter First string: ");
        	 String str1 = scan.nextLine();
        	 
        	 System.out.println("Enter Second string: ");
        	 String str2 = scan.nextLine();
        	 
        	 concatenateStrs = str1 + str2;
        	 System.out.println(concatenateStrs);
        	 
         }
        
         else if (press == 4) {
        	 
        	 System.out.println("Enter First string: ");
        	 String str1 = scan.nextLine();
        	 
        	 System.out.println("Enter Second string: ");
        	 String str2 = scan.nextLine();
        	 
        	 if (str1.toLowerCase().equals(str2.toLowerCase())) {
        	 
        		 System.out.println("The entered strings are equal");
        	 }
        	 
        	 else {
        		 
        		 System.out.println("The entered strings are not equal");
        	 }
         }
        
         else if (press == 5) {
        	 
        	 System.out.println("Length of a string");
        	 
        	 System.out.println("Enter the String");
        	 String str = scan.nextLine();
        	 
        	 lengthOfStr = str.length();
        	 
        	 System.out.println("The length of the entered string is: " + lengthOfStr); 
        	 
         }
        
        scan.close();
    }
}

