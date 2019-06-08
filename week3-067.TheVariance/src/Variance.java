import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int total = 0;
        
        for (Integer num : list) {
            total += num;
        }
        
        return total;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        return (double) sum(list) / list.size();
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double yMean = average(list);
        double sampleVariance = 0;
        
        for (Integer num : list) {
            sampleVariance += Math.pow((num - yMean), 2);
        }
        
        sampleVariance /= (list.size() - 1);
        
        return sampleVariance;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
