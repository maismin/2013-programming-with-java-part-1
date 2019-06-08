
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int points;
        String grade;
        
        System.out.print("Type the points [0-60]: ");
        points = Integer.parseInt(reader.nextLine());
        
        if (points >= 0 && points <= 29) {
            grade = "failed";
        } else if (points >= 30 && points <= 34) {
            grade = "1";
        } else if (points >= 35 && points <= 39) {
            grade = "2";
        } else if (points >= 40 && points <= 44) {
            grade = "3";
        } else if (points >= 45 && points <= 49) {
            grade = "4";
        } else {
            grade = "5";
        }
        
        System.out.println("\nGrade: " + grade + "\n");
    }
}
