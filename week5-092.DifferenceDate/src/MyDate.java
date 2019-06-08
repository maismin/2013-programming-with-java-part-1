public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }
    
    public int differenceInYears(MyDate comparedDate) {
        if (year == comparedDate.year) {
            return 0;
        }
        
        int monthDays[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int totalDays = 0;
        MyDate startDate, endDate;
        
        if (earlier(comparedDate)) {
            startDate = this;
            endDate = comparedDate;
        } else {
            startDate = comparedDate;
            endDate = this;
        }
        
        totalDays += monthDays[startDate.month-1] - startDate.day;
        
        for (int i = startDate.month+1; i <= 12; i++) {
            totalDays += monthDays[i-1];
        }
        
        totalDays += endDate.day;
        
        for (int j = 1; j <= endDate.month-1; j++) {
            totalDays += monthDays[j-1];
        }
        
        for (int k = startDate.year+1; k <= endDate.year-1; k++) {
            totalDays += 365;
        }
        
        int result = totalDays / 365;
        return result;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

}
