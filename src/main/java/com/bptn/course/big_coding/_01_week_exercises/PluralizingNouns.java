package com.bptn.course.big_coding._01_week_exercises;

import java.util.Scanner;

public class PluralizingNouns {

	public static void main(String[] args) {
		
		/*
        Scanner scan = new Scanner(System.in);

        System.out.print("# in: ");
        int amt = scan.nextInt();
        scan.nextLine(); // Removes buffer input "Enter"

        System.out.print("word: ");
        String word = scan.nextLine();

        //Builds a new String "pluralWord"
        StringBuilder pluralWord = new StringBuilder();

        System.out.println(amt + " " + pluralWord.append(word + "s"));
        
        scan.close();
        
        */
		
		//Initialize Scanner
        Scanner scan = new Scanner(System.in);

        System.out.print("# in: ");
        int amt = scan.nextInt();
        scan.nextLine(); // Removes buffer input "Enter"

        System.out.print("word: ");
        String word = scan.nextLine(); 

        //Function to build an object or new String pluralWord.
        StringBuilder pluralWord = new StringBuilder(); 

        if (word.endsWith("fe")) {
        pluralWord.append(word.substring(0, word.length() - 2)).append("ves");
        } 
         
        else if (word.endsWith("y") && !isVowel(word.charAt(word.length() - 2))) {
        pluralWord.append(word.substring(0, word.length() - 1)).append("ies");
        } 
        
        else if (word.endsWith("sh") || word.endsWith("ch")) {
        pluralWord.append(word).append("es");
        } 
        
        else if (word.endsWith("ay") || word.endsWith("oy") || word.endsWith("ey") || word.endsWith("uy")) {
        pluralWord.append(word).append("s");
        } 
        
        else if (word.endsWith("us")) {
        pluralWord.append(word.substring(0, word.length() - 2)).append("i");
        } 
        
        else {
        pluralWord.append(word).append("s");
        }

        // Printing the plural form with the amount
        System.out.println(amt + " " + pluralWord.toString());

        scan.close();
    }
    
	//Helper method to check if a character is a vowel
	private static boolean isVowel(char charAt) {
		
		return false;
	}

}