
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int counter = 1;
        int upperBound;
        
        // Write your code here
        System.out.print("Up to what number? ");
        upperBound = Integer.parseInt(reader.nextLine());
        while (counter <= upperBound) {
            System.out.println(counter);
            counter += 1;
        }
    }
}
