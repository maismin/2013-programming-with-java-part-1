/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Si
 */
public class GradeDistribution {
    private ArrayList<Integer> points;

    public GradeDistribution() {
        points = new ArrayList<Integer>();
    }
    
    public void addPoint(int point) {
        if (point >= 0 && point <= 60) {
            points.add(point);
        }
    }
    
    public int convertPointToGrade(int point) {
        if (point >= 0 && point <= 29) {
            return 0;
        } else if (point >= 30 && point <= 34) {
            return 1;
        } else if (point >= 35 && point <= 39) {
            return 2;
        } else if (point >= 40 && point <= 44) {
            return 3;
        } else if (point >= 45 && point <= 49) {
            return 4;
        } else {
            return 5;
        }
    }
    
    public void printGradeDistribution() {
        StringBuilder tmp = new StringBuilder();
        int[] distribution = getGradeDistribution();
        
        System.out.println("Grade Distribution:");
        
        for (int i = distribution.length-1; i >= 0; --i) {          
            tmp.setLength(0);
            tmp.append(i).append(": ");
            
            for (int j = 0; j < distribution[i]; j++) {
                tmp.append("*");
            }
            
            System.out.println(tmp);
        }
        
        double acceptancePercentage = 100 * ((double)(points.size()-distribution[0])/points.size());
        System.out.printf("Acceptance percentage: %.2f%n", acceptancePercentage);
    }
    
    private int[] getGradeDistribution() {
        int[] distribution = new int[6];
        
        for (int i = 0; i < distribution.length; i++) {
            distribution[i] = 0;
        }
        
        for (int p : points) {
            int grade = convertPointToGrade(p);
            distribution[grade] += 1;
        }
        
        return distribution;
    }
}
