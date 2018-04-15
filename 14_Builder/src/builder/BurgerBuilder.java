/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author Mikael Kotkavuori
 */
public abstract class BurgerBuilder<T> {
    protected Burger burger;
    protected T burgerStructure;
    
    public T getBurger() {
        return burgerStructure;
    }
    
    public Burger getActualBurger() {
        return burger;
    }
    
    public void createNewBurger() {
        burger = new Burger();
    }
    
    public abstract void buildBun();
    public abstract void buildPatty();
    public abstract void buildCheese();
    public abstract void buildSauce();
    
    @Override
    public String toString() {
        return burger.toString();
    }
}
