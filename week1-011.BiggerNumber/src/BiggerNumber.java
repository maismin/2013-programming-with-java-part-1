
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        int a, b;
        System.out.println("Type a number: ");
        a = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        b = Integer.parseInt(reader.nextLine());
        System.out.printf("The bigger number of the two numbers given was: %d%n", java.lang.Math.max(a, b));
    }
}
