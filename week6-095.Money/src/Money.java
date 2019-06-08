
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }
    
    public Money plus(Money added) {
        int euros = euros() + added.euros();
        int cents = cents() + added.cents();
        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }
        return new Money(euros, cents);
    }
    
    public Money minus(Money decremented) {
        int euros = euros() - decremented.euros();
        int cents = cents() - decremented.cents();

        if (cents < 0)  {
            euros -= 1;
            cents += 100;
        }

        if (euros < 0) {
            euros = 0;
            cents = 0;
        }
        
        return new Money(euros, cents);
    }
    
    public boolean less(Money compared) {
        if (euros() < compared.euros()) {
            return true;
        }
        
        if (euros() == compared.euros()) {
            if (cents() < compared.cents()) {
                return true;
            }
        }
        
        return false;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
