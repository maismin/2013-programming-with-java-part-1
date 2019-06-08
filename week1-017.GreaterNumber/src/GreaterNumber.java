import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num1, num2;
        
        System.out.print("Type the first number: ");
        num1 = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type the second number: ");
        num2 = Integer.parseInt(reader.nextLine());
        
        if (num1 == num2) {
            System.out.println("The numbers are equal!");
        } else if (num1 > num2) {
            System.out.println("Greater number: " + num1 + "\n");
        } else {
            System.out.println("Greater number: " + num2 + "\n");
        }
    }
}
