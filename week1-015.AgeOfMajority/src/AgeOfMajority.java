
import java.util.Scanner;

public class AgeOfMajority {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Type your program here
        int ageOfMajority;
        
        System.out.print("How old are you? ");
        ageOfMajority = Integer.parseInt(reader.nextLine());
        
        if (ageOfMajority >= 18) {
            System.out.println("You have reached the age of majority!");
        } else {
            System.out.println("You have not reached the age of majority yet!");
        }
    }
}
