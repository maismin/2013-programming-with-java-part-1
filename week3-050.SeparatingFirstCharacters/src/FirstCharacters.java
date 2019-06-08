import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String name;
        
        System.out.print("Type your name: ");
        name = reader.nextLine();
        if (name.length() >= 3) {
            for (int i = 0; i < 3; i++) {
                System.out.printf("%d. character: %c%n", i+1, name.charAt(i));
            }
        }
    }
}
