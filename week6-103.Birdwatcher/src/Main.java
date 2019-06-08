import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        Scanner scanner = new Scanner(System.in);
        ObservationDatabase birdDB = new ObservationDatabase();
        String cmd;
        
        while (true) {
            System.out.print("? ");
            cmd = scanner.nextLine();
            
            if (cmd.trim().toLowerCase().equals("add")) {
                String name, latinName;
                System.out.print("Name: ");
                name = scanner.nextLine();
                System.out.print("Latin Name: ");
                latinName = scanner.nextLine();
                birdDB.add(name, latinName);
            } else if (cmd.trim().toLowerCase().equals("observation")) {
                String name;
                System.out.print("What was observed:? ");
                name = scanner.nextLine();
                birdDB.observation(name);
            } else if (cmd.trim().toLowerCase().equals("statistics")) {
                birdDB.statistics();
            } else if (cmd.trim().toLowerCase().equals("show")) {
                String name;
                System.out.print("What? ");
                name = scanner.nextLine();
                birdDB.show(name);
            } else if (cmd.trim().toLowerCase().equals("quit")) {
                break;
            }
        }
            
    }

}
