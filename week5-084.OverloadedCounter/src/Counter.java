/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Si
 */
public class Counter {
    private int count;
    private boolean check;
    
    public Counter(int startingValue, boolean check) {
        count = startingValue;
        this.check = check;
    }
    
    public Counter(int startingValue) {
        this(startingValue, false);
    }
    
    public Counter(boolean check) {
        this(0, true);
    }
    
    public Counter() {
        this(0, false);
    }
    
    public int value() {
        return count;
    }
    
    public void increase() {
        increase(1);
    }
    
    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
            count += increaseAmount;
        }
    }
    
    public void decrease() {
        decrease(1);
    }
    
    public void decrease(int decreaseAmount) {
        if (decreaseAmount > 0) {
            if (check) {
                if (count > 0) {
                    count -= decreaseAmount;
                    if (count < 0) {
                        count = 0;
                    }
                }
            } else {
                count -= decreaseAmount;
            }
        }
    }
}
