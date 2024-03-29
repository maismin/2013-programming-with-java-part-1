public class DecreasingCounter {
    private int value;  // instance variable that remembers the value of the counter
    private int initialValue;

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        initialValue = valueAtStart;
    }

    public void printValue() {
        // do not touch this!
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        // write here code to decrease counter value by one
        if (value > 0) {
            value -= 1;
        }
    }

    // and here the rest of the methods
    public void reset() {
        value = 0;
    }
    
    public void setInitial() {
        value = initialValue;
    }
}
