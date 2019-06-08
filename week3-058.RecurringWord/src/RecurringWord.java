
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList 
        ArrayList<String> words = new ArrayList<String>();
        String wordInput;
        
        while (true) {
            System.out.print("Type a word: ");
            wordInput = reader.nextLine();
            if (!words.contains(wordInput)) {
                words.add(wordInput);
            } else {
                System.out.println("You gave the word " + wordInput + " twice");
                break;
            }
        }
    }
}
