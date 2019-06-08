
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int lowerLimit, upperLimit;
        
        System.out.print("First: ");
        lowerLimit = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        upperLimit = Integer.parseInt(reader.nextLine());
        
        int sum = 0;
        while (lowerLimit <= upperLimit) {
            sum += lowerLimit;
            lowerLimit += 1;
        }
        
        System.out.println("Sum is " + sum);
    }
}
