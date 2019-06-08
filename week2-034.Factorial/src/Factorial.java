import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int n = Integer.parseInt(reader.nextLine());
        int product = 1;
        int i = 1;
        while (i <= n) {
            product *= i;
            i += 1;
        }
        System.out.println("Factorial is " + product);
    }
}
