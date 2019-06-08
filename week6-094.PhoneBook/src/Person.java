/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Si
 */
public class Person {
    private String name, phoneNumber;

    public Person(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return phoneNumber;
    }
    
    public void changeNumber(String newPhoneNumber) {
        this.phoneNumber = newPhoneNumber;
    }

    @Override
    public String toString() {
        return String.format("%s  number: %s", name, phoneNumber);
    }
    
    
}
