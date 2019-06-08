
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        String name, studentNumber;
        
        while (true) {
            System.out.print("name: ");
            name = reader.nextLine();
            if (name.equals("")) {
                break;
            }
            System.out.print("studentnumber: ");
            studentNumber = reader.nextLine();
            
            list.add(new Student(name, studentNumber));
        }
        
        System.out.println("");
        
        for (Student s : list) {
            System.out.println(s);
        }
        
        System.out.println("");
        
        System.out.print("Given search term: ");
        String search = reader.nextLine();
        System.out.println("Result:");
        for (Student s : list) {
            if (s.getName().contains(search)) {
                System.out.println(s);
            }
        }
        
    }
}
