package com.bptn.course.self_and_instructor_led._01_week_practices;

import java.util.Scanner;

public class IfIfElseElse {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("You are on an island surrounded by water. \nWhich way do you want to go (n,e,s,w)?");
        
        String command = scan.nextLine();
        if (command.equals("n")) {
            System.out.println("You enter the forest and hear some rustling. \nThere may be tigers here or maybe it's just monkeys.");
          
        }
        
        // Add else-ifs for s, e, w, and an else for any other input. Be creative!
        else if  (command.equals("s")) {
            System.out.println("You are now at the sea!");
        }
        else if  (command.equals("e")) {
        	System.out.println("You are now entering the beach shack!");
        }
        
        else  {        
        System.out.println("\n End of adventure!"); 
        }
        
        scan.close();
        
	}
}

