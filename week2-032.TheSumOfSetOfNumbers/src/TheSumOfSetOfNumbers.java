
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int n;
        System.out.print("Until what? ");
        n = Integer.parseInt(reader.nextLine());
        
        int i = 1;
        while (i <= n) {
            sum += i;
            i += 1;
        }
        
        System.out.println("Sum is " + sum);
    }
}
