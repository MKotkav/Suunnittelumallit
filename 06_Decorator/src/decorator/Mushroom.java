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
public class Mushroom extends Topping {
    
    private double price;
    
    public Mushroom(Pizza toppingToBeAdded) {
        super(toppingToBeAdded);
        price = 0.60;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " herkkusieni";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + price; 
    }
    
    
    
}
