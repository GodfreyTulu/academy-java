package com.bptn.course.big_coding._01_week_exercises;

import java.util.Scanner;

public class WordEncryption {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word to encrypt: ");
        String word = input.nextLine();

        //Initialize String builder method to build a new string. 
        StringBuilder encryptWord = new StringBuilder();

        for (int i = 0; i<word.length(); i++){

            char currentChar = word.charAt(i);
            
            //ASCII conditioned for each scenario.

            if (currentChar >= 'A' && currentChar <= 'Z'){

                char shiftedChar = (char)(currentChar + 1); //(char) is for Casting, which keeps the value within brackets as characters.

                if (shiftedChar > 'Z'){
                    shiftedChar = 'A';
                }
                
                //Append method used to add/concatenate strings/characters.
                encryptWord.append(shiftedChar);
            }

            else if (currentChar >= 'a' && currentChar <= 'z'){

                char shiftedChar = (char)(currentChar + 1);

                if (shiftedChar > 'z'){
                    shiftedChar = 'a';
                }

                encryptWord.append(shiftedChar);

            }
            else {
            	encryptWord.append(currentChar);
            }

        }
        
        System.out.println("Encrypted word: " + encryptWord.toString());

        input.close();

    }
}
