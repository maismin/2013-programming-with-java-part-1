import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        int numberLength = 7;
        int range = 39;
        int nextNum;
        Random random = new Random();       
        
        for (int i = 0; i < numberLength; i++) {
            do {
                nextNum = random.nextInt(range) + 1;
            } while (containsNumber(nextNum));
            numbers.add(nextNum);
        }       
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        return numbers.contains(number);
    }
}
