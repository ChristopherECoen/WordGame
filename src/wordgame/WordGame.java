package wordgame;

import java.util.Scanner;

public class WordGame {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String word = "butter";
        String input;
        
        System.out.println("Guess the word >> ");
        input = kb.nextLine();
        
        if(input .equals(word)){
            System.out.println("Correct!");
        }else{
            System.out.println("Incorrect!");
        }
    }

}
