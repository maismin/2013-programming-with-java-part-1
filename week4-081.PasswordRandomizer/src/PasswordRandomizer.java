import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    Random random;
    String alphabet;
    int length;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        random = new Random();
        alphabet = "abcdefghijklmnopqrstuvwxyz";
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        StringBuilder pw = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            pw.append(alphabet.charAt(random.nextInt(26)));
        }
        String password = new String(pw);
        return password;
    }
}
