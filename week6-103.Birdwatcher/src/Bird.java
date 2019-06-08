/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Si
 */
public class Bird {
    private final String name, latinName;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    @Override
    public String toString() {
        return String.format("%s (%s)", getName(), getLatinName());
    }
    
    
}
