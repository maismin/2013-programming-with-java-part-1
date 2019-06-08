import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String word;
        do {
            System.out.print("Type a word: ");
            word = reader.nextLine();
            if (!word.equals("")) {
                words.add(word);
            }
        } while (!word.equals(""));
        
        System.out.println("You typed the following words:");
        for (String w : words) {
            System.out.println(w);
        }
        
    }
}
