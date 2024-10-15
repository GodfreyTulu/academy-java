package com.bptn.course.self_led._03_week_practices;

import java.util.HashSet;

public class HashSetManipulation {
	public static void main(String[] args) {
		// Create a HashSet and populate it with initial values

		HashSet<Character> set = new HashSet<>(); 
		//Adding values to the Set.
		set.add('A');
		set.add('B');
		set.add('C');		

		// Print the size of the set
		System.out.println("Set size: " + set.size());		

		// Use for loop to print the values in the set
		for(Character value : set){

			System.out.println("Value: " + value);
		}		

		// Use add() method to add a new value to the set
		System.out.println("Set after using add(): ");
		set.add('D');
		//Uses enhanced for loop again to print values
		for(Character value : set){

			System.out.println("Value: " + value);
		}
		
		// Use remove() method to remove a value from the set
		System.out.println("Set after using remove(): ");
		set.remove('A');
		//Uses enhanced for loor again to print values
		for(Character value : set){

			System.out.println("Value: " + value);
		}		

		// Use contains() method to check if the value "C" exists in the set
		if (set.contains('C')){
			System.out.println("Value 'C' exists in the set.");
		}
		else{
			System.out.println("Value 'C' does not exist in the set.");
		}
		
	}
}
