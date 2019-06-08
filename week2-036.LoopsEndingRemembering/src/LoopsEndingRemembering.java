import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        int num;
        int sum = 0;
        int counter = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;
        
        System.out.println("Type numbers: ");
        do {
            num = Integer.parseInt(reader.nextLine());
            if (num != -1) {
                sum += num;
                counter += 1;
                if (num % 2 == 0) {
                    evenNumbers += 1;
                } else {
                    oddNumbers += 1;
                }
            }
        } while (num != -1);
        
        double average = (double) sum / counter;
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + counter);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);
    }
}
