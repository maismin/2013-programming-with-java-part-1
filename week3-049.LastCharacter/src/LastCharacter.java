import java.util.Scanner;


public class LastCharacter {

    public static char lastCharacter(String text) {
        if (text.length() == 0) {
            return ' ';
        } else {
            return text.charAt(text.length()-1);
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        System.out.println("Last character: " + lastCharacter(name));
    }
}
