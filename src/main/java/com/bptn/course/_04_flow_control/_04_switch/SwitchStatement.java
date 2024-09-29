package com.bptn.course._04_flow_control._04_switch;

public class SwitchStatement {

	public static void main(String[] args) {
		
		/*
		 * WWrite a Java program that translates the day's number into the days's name 
		 * accordingly to:
		 * 1 -> Monday
		 * 2 -> Tuesday
		 * 3 -> Wednesday
		 * 4 -> Thursday
		 * 5 -> Friday
		 * 6 -> Saturday
		 * 7 -> Sunday
		 */
		
	int day = 3;
	
	switch(day) {
	
	case 1: System.out.println("Monday");
	        break;
	case 2: System.out.println("Tuesday");
	        break;
	case 3: System.out.println("Wednesday");
	        break;
	case 4: System.out.println("Thursday");
	        break;
	case 5: System.out.println("Friday");
	        break;
	case 6: System.out.println("Saturday");
	        break;
	case 7: System.out.println("Sunday");
	        break;
	        
	default:
		System.out.println("Invalid day");
	        
	}
	
	        // Simplified Switch: Java 14
	
			switch(day) {
			
			case 1 -> System.out.println("Monday");
			case 2 -> System.out.println("Tuesday");
			case 3 -> System.out.println("Wednesday");
			case 4 -> System.out.println("Thursday");
			case 5 -> System.out.println("Friday");
			case 6 -> System.out.println("Saturday");
			case 7 -> System.out.println("Sunday");
			
			default -> System.out.println("Invalid day");
			
			}

			// Simplified Switch: Java 14 - return
			String str = switch(day) {
			
			case 1 -> "Monday";
			case 2 -> "Tuesday";
			case 3 -> "Wednesday";
			case 4 -> "Thursday";
			case 5 -> "Friday";
			case 6 -> "Saturday";
			case 7 -> "Sunday";
			
			default -> "Invalid day";
			
			};
			
			System.out.println(str);

  }

}
