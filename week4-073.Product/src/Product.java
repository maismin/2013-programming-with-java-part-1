/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Si
 */
public class Product {
    private String name;
    private double price;
    private int amount;
    
    public Product(String nameAtStart, double priceAtStart, int amountAtStart) {
        name = nameAtStart;
        price = priceAtStart;
        amount = amountAtStart;
    }
    
    public void printProduct() {
        System.out.printf("%s, price %f, amount %d%n", name, price, amount);
    }
}
