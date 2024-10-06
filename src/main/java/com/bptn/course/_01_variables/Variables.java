package com.bptn.course._01_variables;

class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Hello
		
		/*
		  Hello1
		  Hello2
		  Hello3
		 */

       /* There are two variable types.
        *
        * 1. Primitives.
        * 2. Class Variables / non-primitives. (also known as Wrapper Classes)
        */
	
        /*
         * Integer Variables.
         */
		
		int num1 = 2_147_483_647;
		long num2 = 2_147_483_648L;
		
		byte finalScoreToronto = 127;
		short d = 32767; 

        /*
         * Decimal Variables.
         */
		
		double e = 10.47463;
		float f = 10.47463F;
		
        /*	       
           Text Variables.
         */
		
		char chr1 = 'A';
		
	    /*
          Boolean Variables.
         */	
		
		boolean h = false;
		
		
		System.out.println( num1 );
		
		
		String str1 = new String("Coffee");
		String str2 = new String("Coffee");
		String str3 = str2;
		
		if ( str1.equals(str2) ) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Different");			
		}
		
		
		char[] str4 = { 'H', 'e', 'l', 'l', 'o' };
		
		String str5 = new String(str4);
		
		System.out.println(str5);
		
		
		
		
	}

}
