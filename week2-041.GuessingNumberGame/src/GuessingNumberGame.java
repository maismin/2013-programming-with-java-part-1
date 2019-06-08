
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        int numGuesses = 0;
        int guess = -1;
        
        while (guess != numberDrawn) {
            System.out.print("Guess a number: ");
            guess = Integer.parseInt(reader.nextLine());
            numGuesses += 1;
            
            if (guess == numberDrawn) {
                System.out.println("Congratulations, your guess is correct!");
                break;
            } else {
                if (guess > numberDrawn) {
                    System.out.println("The number is lesser, guess made: " + numGuesses);
                } else {
                    System.out.println("The number is greater, guess made: " + numGuesses);
                }
            }
        }
        
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
