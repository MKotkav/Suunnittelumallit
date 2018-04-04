/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author Mikael Kotkavuori
 */
public class Pepperoni extends Topping {
    
    private double price;
    
    public Pepperoni(Pizza toppingToBeAdded) {
        super(toppingToBeAdded);
        price = 1.99;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " pepperoni"; 
    }

    @Override
    public double getPrice() {
        return super.getPrice() + price; 
    }
    
    
}
