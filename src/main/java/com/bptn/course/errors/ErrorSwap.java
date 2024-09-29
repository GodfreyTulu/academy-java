package com.bptn.course.errors;

public class ErrorSwap {
	
	   public static void main(String[] args) {
	     int h = 3;
	     int w = 5;
	     
	     System.out.println(h);  //3
	     System.out.println(w);  //5
	     
	     h = w;
	     w = h;
	     
	     System.out.println(h);  //expected 5
	     System.out.println(w);  //expected 3
	     
	     /*
	      * Program does not swap the value because right after 
	      * changing the value of h=w of which h is now going to be 5, 
	      * the next line we changed the value of w=h so that means 
	      * the value of w is going to be that of the current h and not the old one.
	      * Solution will be to create a temporary variable to store one of the
	      * value during the swap.
	      */
	   }

	}

