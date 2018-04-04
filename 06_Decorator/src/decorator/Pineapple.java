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
public class Pineapple extends Topping {
    
    private double price;
    
    public Pineapple(Pizza toppingToBeAdded) {
        super(toppingToBeAdded);
        price = 2.30;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " ananas"; 
    }

    @Override
    public double getPrice() {
        return super.getPrice() + price;
    }
    
    
}
