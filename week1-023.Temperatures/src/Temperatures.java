
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        double value;
        String input;
        
        System.out.println("Enter a numeric value or type 'q' to quit: ");
        
        while (true) {
            System.out.print("Input: ");
            input = reader.nextLine();
            
            if (input.equals("q")) {
                break;
            } else {
                value = Double.parseDouble(input);
                if (value >= -30 && value <= 40) {
                    Graph.addNumber(value);
                }   
            }
        }
        // Graph is used as follows:
//        Graph.addNumber(7);
//        double value = 13.5;
//        Graph.addNumber(value);
//        value = 3;
//        Graph.addNumber(value);
        // Remove or comment out these lines above before trying to run the tests.
    }
}
