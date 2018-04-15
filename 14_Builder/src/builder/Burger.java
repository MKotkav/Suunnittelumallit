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
public class Burger {
    private String bun;
    private String patty;
    private String cheese;
    private String sauce;

    public void setBun(String bun) {
        this.bun = bun;
    }

    public void setPatty(String patty) {
        this.patty = patty;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }
    
    @Override
    public String toString() {
        return "Bun: " + bun + "Patty: " + patty + "Cheese: " + cheese + "Sauce: " + sauce;
    }
    
}
