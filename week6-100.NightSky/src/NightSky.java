/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random;

/**
 *
 * @author Si
 */
public class NightSky {
    private double density;
    private int width, height;
    private int starsInLastPrint;
    
    public NightSky(double density) {
        this(density, 20, 10);
    }
    
    public NightSky(int width, int height) {
        this(0.1, width, height);
    }
    
    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
        starsInLastPrint = 0;
    }
    
    public int starsInLastPrint() {
        return starsInLastPrint;
    }
    
    public void printLine() {
        StringBuilder resultSB = new StringBuilder();
        Random starGenerator = new Random();
        double p;
        
        for (int i = 0; i < width; i++) {
            p = starGenerator.nextDouble();
            if (p < density) {
                resultSB.append("*");
                starsInLastPrint += 1;
            } else {
                resultSB.append(" ");
            }
        }
        
        String result = new String(resultSB);
        System.out.println(result);
    }
    
    public void print() {
        starsInLastPrint = 0;
        for (int i = 0; i < height; i++) {
            printLine();
        }
    }
}
