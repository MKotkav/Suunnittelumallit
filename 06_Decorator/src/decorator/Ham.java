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
public class Ham extends Topping {
    
    private double price;
    
    public Ham(Pizza toppingToBeAdded) {
        super(toppingToBeAdded);
        price = 1.50;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " kinkku"; 
    }

    @Override
    public double getPrice() {
        return super.getPrice() + price; 
    }
    
    
}
