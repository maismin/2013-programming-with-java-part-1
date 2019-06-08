
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        
        // Write your code here
        String attemptedPassword = "";
        boolean correct = false;
        
        do {
            System.out.print("Type the password: ");
            attemptedPassword = reader.nextLine();
            correct = attemptedPassword.equals(password);
            
            if (correct) {
                System.out.println("Right!");
                System.out.println("The secret is jryy qbar!");
            } else {
                System.out.println("Wrong!");
            }
        } while (!correct);
        
    }
}
