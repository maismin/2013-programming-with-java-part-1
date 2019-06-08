
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String firstWord, secondWord;
        
        System.out.print("Type the first word: ");
        firstWord = reader.nextLine();
        System.out.print("Type the second word: ");
        secondWord = reader.nextLine();
        
        if (firstWord.indexOf(secondWord) < 0) {
            System.out.printf("The word '%s' is not found in the word '%s'.%n", secondWord, firstWord);
        } else {
            System.out.printf("The word '%s' is found in the word '%s'.%n", secondWord, firstWord);
        }
    }
}
