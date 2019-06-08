
public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
        amountOfNumbers = 0;
        sum = 0;
    }

    public void addNumber(int number) {
        // code here
        sum += number;
        amountOfNumbers += 1;
    }

    public int amountOfNumbers() {
        // code here
        return amountOfNumbers;
    }
    
    public int sum() {
        // code here
        return sum;
    }

    public double average() {
        // code here
        if (amountOfNumbers == 0) {
            return 0;
        } else {
            return (double) sum / amountOfNumbers;
        }
    }
}
