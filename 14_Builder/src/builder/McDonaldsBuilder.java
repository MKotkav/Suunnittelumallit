/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mikael Kotkavuori
 */
public class McDonaldsBuilder extends BurgerBuilder<List>{
    
    public McDonaldsBuilder() {
        burgerStructure = new ArrayList();
    }

    @Override
    public void buildBun() {
        BurgerBun bun = new BurgerBun("brioche ");
        burgerStructure.add(bun);
        burger.setBun(bun.getBun());
    }

    @Override
    public void buildPatty() {
        BurgerPatty patty = new BurgerPatty("ground beef ");
        burgerStructure.add(patty);
        burger.setPatty(patty.getPatty());
        
    }

    @Override
    public void buildCheese() {
        BurgerCheese cheese = new BurgerCheese("cheddar ");
        burgerStructure.add(cheese);
        burger.setCheese(cheese.getCheese());
    }

    @Override
    public void buildSauce() {
        BurgerSauce sauce = new BurgerSauce("ketchup ");
        burgerStructure.add(sauce);
        burger.setSauce(sauce.getSauce());
    }
    
}
