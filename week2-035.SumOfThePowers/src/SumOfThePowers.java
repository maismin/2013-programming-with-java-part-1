
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 0;
        int sum = 0;
        int n;
        
        System.out.print("Type a number: ");
        n = Integer.parseInt(reader.nextLine());
        while (i <= n) {
            sum += Math.pow(2, i);
            i += 1;
        }
        
        System.out.println("The result is: " + sum);
    }
}
