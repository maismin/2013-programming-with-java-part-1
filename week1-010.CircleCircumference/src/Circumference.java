
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Program your solution here 
        int radius;
        System.out.println("Type the radius: ");
        radius = Integer.parseInt(reader.nextLine());
        System.out.printf("Circumference of the circle: %f%n", 2 * java.lang.Math.PI * radius);
    }
}
