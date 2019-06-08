
public class BoundedCounter {
    // copy here the class BoundedCounter from last weeks assignment 78 
    private int value;
    private int upperLimit;
    
    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
        value = 0;
    }
    
    public void next() {
        value = (value + 1) % (upperLimit + 1);
    }
    
    public int getValue() {
        return value;
    }
    
    public void setValue(int value) {
        if (value >= 0 && value <= upperLimit) {
            this.value = value;
        }
    }
    
    @Override
    public String toString() {
        if (value < 10) {
            return "0" + value;
        } else {
            return "" + value;
        }
    }
}
