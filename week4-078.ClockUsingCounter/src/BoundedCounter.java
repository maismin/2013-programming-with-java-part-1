/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Si
 */
public class BoundedCounter {
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
