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
public class Director {
    private BurgerBuilder builder;
    
    public void setBurgerBuilder(BurgerBuilder builder) {
        this.builder = builder;
    }
    
    public Burger getActualBurger() {
        return builder.getActualBurger();
    }
    
    public void construcBurger() {
        builder.createNewBurger();
        builder.buildBun();
        builder.buildPatty();
        builder.buildCheese();
        builder.buildSauce();
    }
}
