package com.bptn.course._03_scanner;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		
		// Use Scanner Class
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter an Interger:");   //Asks the user to enter a value
		int num = scan.nextInt(); //Receives/Scans input from the Console/Display
		
		scan.nextLine(); // Clean Buffer. Removes <enter> from the previous scan
		
		System.out.println("Please enter a String:");   //Asks the user to enter a word
		String str = scan.nextLine(); //Receives/Scans input from the Console/Display

        
		System.out.println("The Value is: " + num);
		System.out.println("The Words Shared are: " + str);
		
		
		scan.close();
		
	}

}
