package com.bptn.course.self_and_instructor_led._04_week_practices.loop_analysis;

public class Trace {
	
    public static void main(String[] args) {
    	
    	//Declare and Initiate variables
        int var1 = 3;
        int var2 = 2;
        
        System.out.println("var1: " + var1 + " var2: " + var2); //Trace results before the loop.

        while ((var2 != 0) && ((var1 / var2) >= 0)) {
        	
            var1 = var1 + 1;
            var2 = var2 - 1;
            
            System.out.println("var1: " + var1 + " var2: " + var2); //Trace results end of the loop.
        }
        
        System.out.println("var1: " + var1 + " var2: " + var2); //Trace results outside the loop.
    }
}

