
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();
        String input;
        
        while (true) {
            System.out.print("Type a word: ");
            input = reader.nextLine();
            if (!input.equals("")) {
                words.add(input);
            } else {
                Collections.sort(words);
                break;
            }
        }
        
        System.out.println("You typed the following words:");
        
        for (String word : words) {
            System.out.println(word);
        }
    }
}
