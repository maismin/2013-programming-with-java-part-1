import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4

        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.

        // The tests does not work if you do not create the objects in the correct order
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();
        
        int inputNumber;
        
        System.out.println("Type numbers");
        while (true) {
            inputNumber = Integer.parseInt(reader.nextLine());
            if (inputNumber == -1) {
                break;
            } 
            
            stats.addNumber(inputNumber);
                
            if (inputNumber % 2 == 0) {
                even.addNumber(inputNumber);
            } else {
                odd.addNumber(inputNumber);
            }
        }
        
        System.out.println("Sum: " + stats.sum());
        System.out.println("Sum of even: " + even.sum());
        System.out.println("Sum of odd: " + odd.sum());
    }
}
