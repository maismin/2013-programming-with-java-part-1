
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        String name1, name2;
        int age1, age2;
        
        System.out.println("Type your name: ");
        name1 = reader.nextLine();
        System.out.println("Type your age: ");
        age1 = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type your name: ");
        name2 = reader.nextLine();
        System.out.println("Type your age: ");
        age2 = Integer.parseInt(reader.nextLine());
        
        System.out.printf("%s and %s are %d years old in total.%n", name1, name2, age1 + age2);
    }
}
