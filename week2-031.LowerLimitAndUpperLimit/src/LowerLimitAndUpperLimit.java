
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        int lowerLimit, upperLimit;
        
        System.out.print("First: ");
        lowerLimit = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        upperLimit = Integer.parseInt(reader.nextLine());
        
        if (lowerLimit <= upperLimit) {
            while (lowerLimit <= upperLimit) {
                System.out.println(lowerLimit);
                lowerLimit += 1;
            }
        }
    }
}
