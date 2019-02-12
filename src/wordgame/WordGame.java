package wordgame;

import java.util.Scanner;

public class WordGame {

    public static void main(String[] args) {
        //Scanner, base word, input 
        Scanner kb = new Scanner(System.in);
        String word = "BUTTER";
        String input;

        //Guess word, convert word to uppercase
        System.out.println("Guess the word >> ");
        input = kb.nextLine();
        input = input.toUpperCase();

        //if input is the same as word, correct. Else, incorrect.
        if (input.equals(word)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect!");
        }
    }

}
