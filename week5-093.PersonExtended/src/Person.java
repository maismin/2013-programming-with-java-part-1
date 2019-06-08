import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    
    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    
    public Person(String name) {
        this(name, new MyDate(Calendar.getInstance().get(Calendar.DATE), 
                              Calendar.getInstance().get(Calendar.MONTH) + 1, 
                              Calendar.getInstance().get(Calendar.YEAR)));
    }
    
    public int age() {
        // calculate the age based on the birthday and the current day
        // you get the current day as follows: 
        // Calendar.getInstance().get(Calendar.DATE);
        // Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        // Calendar.getInstance().get(Calendar.YEAR);
        int calDay = Calendar.getInstance().get(Calendar.DATE);
        int calMonth = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int calYear = Calendar.getInstance().get(Calendar.YEAR);
        
        MyDate today = new MyDate(calDay, calMonth, calYear);
        return birthday.differneceInYears(today);
    }
    
    public boolean olderThan(Person compared) {
        // compare the ages based on birthdays
        return birthday.earlier(compared.birthday);
    }
    
    public String getName() {
        return this.name;
    }
    
    @Override
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
