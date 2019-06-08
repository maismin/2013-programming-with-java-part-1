
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Typr your name: ");
        String name = reader.nextLine();
        for (int i = 0; i < name.length(); i++) {
            System.out.printf("%d. character: %c%n", i+1, name.charAt(i));
        }
    }
}
