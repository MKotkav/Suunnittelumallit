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
public abstract class Topping implements Pizza {
    
    protected Pizza toppingToBeAdded;

    public Topping(Pizza toppingToBeAdded) {
        this.toppingToBeAdded = toppingToBeAdded;
    }
    
    @Override
    public double getPrice() {
        return toppingToBeAdded.getPrice();
    }

    @Override
    public String getDescription() {
        return toppingToBeAdded.getDescription();
    }
    
}
