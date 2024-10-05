package com.bptn.course.big_coding._01_week_exercises;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("targetNumber: " + 23);

        System.out.print("guess: ");
        int num = scan.nextInt();

        if (num > 23){

            System.out.println("Too high! Try again.");
        }

        else if (num == 23){

            System.out.println("Congratulations! You guessed the number correctly!");
        }

        else {

            System.out.println("Too low! Try again.");
        }

        scan.close();

    }
}
