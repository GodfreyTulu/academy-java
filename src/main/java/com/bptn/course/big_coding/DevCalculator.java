package com.bptn.course.big_coding;

import java.util.Scanner;

public class DevCalculator {

	public static void main(String[] args) {
		
        Scanner key = new Scanner(System.in); 
        
        //Receiving values from the scanner

        System.out.println("/....Calculator Menu..../");
        System.out.println("Press 1 for addition");
        System.out.println("Press 2 for subtraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        System.out.println("Press 5 for finding Square");
        System.out.println("Press 6 for finding Square root");
        System.out.println("Press 7 for finding Reciprocal");     
        
        int press = key.nextInt(); // Reading the press value

        double add;
        double mul;
        double sub;
        double div;
        double squ;
        double sqr;
        double rec;
        double rem;


        if (press == 1){

            System.out.println("Enter the first number: ");
            double num1 = key.nextDouble();

            System.out.println("Enter the second number: ");
            double num2 = key.nextDouble();

            add = num1 + num2;
            System.out.println(add);

        }   

        else if (press==2){

            System.out.println("Enter the first number: ");
            double num1 = key.nextDouble();

            System.out.println("Enter the second number: ");
            double num2 = key.nextDouble();

            sub = num1 - num2;
            System.out.println(sub);

        }

        else if (press == 3) {

            System.out.println("Enter the first number: ");
            double num1 = key.nextDouble();

            System.out.println("Enter the second number: ");
            double num2 = key.nextDouble();

            mul = num1 * num2;
            System.out.println(mul);

        }

        else if (press == 4){

            System.out.println("Enter the first number: ");
            double num1 = key.nextDouble();

            System.out.println("Enter the second number: ");
            double num2 = key.nextDouble();

            div = num1/num2;
            rem = num1%num2;
            System.out.println(div);
            System.out.println(rem);
        }

        else if (press == 5) {

            System.out.println("Enter the number: ");
            double num = key.nextDouble();

            squ = num * num;
            System.out.println(squ);
        }

        else if (press == 6){
            
            System.out.println("Enter the number: ");
            double num = key.nextDouble();

            sqr = Math.sqrt(num);
            System.out.println(sqr);

        }

        else if (press == 7) {
            
        	System.out.println("Enter the number: ");
            double num = key.nextDouble();
  
            rec = 1/num;
            System.out.println(rec);
            
        } 
        
        else {
        	
        	System.out.println("Invalid choice! Please make a valid choice.");
        	
        }
	
	   key.close();
	   
   }

}