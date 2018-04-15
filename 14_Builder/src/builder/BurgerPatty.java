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
public class BurgerPatty {
    private String patty;
    
    public BurgerPatty(String patty) {
        this.patty = patty;
    }

    public String getPatty() {
        return patty;
    }

    public void setPatty(String patty) {
        this.patty = patty;
    }
    
}
