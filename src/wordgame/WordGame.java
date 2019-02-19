package wordgame;

import java.util.Scanner;

public class WordGame {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String input;
        int gamble = ((int) ((Math.random() * 100) % 5 + 1));
        Words word = new Words(gamble);
        int verdict = word.getVerdict();

        String answer = word.getWord();
        System.out.println(gamble);
        System.out.println(verdict);

        do {
            System.out.print("Enter Password: ");

            input = kb.nextLine();

            if (input.equals(answer)) {
                System.out.println("Correct!");
                break;
            } else {
                System.out.println("Wrong");
                System.out.println("Please try a different password!");
            }
        } while (!input.equals(word));
    }

}
