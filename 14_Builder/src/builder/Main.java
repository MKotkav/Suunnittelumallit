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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BurgerBuilder mcDonalds = new McDonaldsBuilder();
        BurgerBuilder hesburger = new HesburgerBuilder();
        Director chef = new Director();
        
        chef.setBurgerBuilder(mcDonalds);
        chef.construcBurger();
        Burger mickeyDee = chef.getActualBurger();
        List mcStructure = (ArrayList) mcDonalds.getBurger();
        
        chef.setBurgerBuilder(hesburger);
        chef.construcBurger();
        Burger hese = chef.getActualBurger();
        StringBuilder heseStructure = (StringBuilder) hesburger.getBurger();
        
        System.out.println("McDonalds: ");
        System.out.println(mickeyDee.toString());
        System.out.println(mcStructure.toString());
        
        System.out.println("Hesburger: ");
        System.out.println(hese.toString());
        System.out.println(heseStructure.toString());
    }
    
//        BurgerBun mcBun = (BurgerBun) mcStructure.get(0);
//        BurgerPatty mcPatty = (BurgerPatty) mcStructure.get(1);
//        BurgerCheese mcCheese = (BurgerCheese) mcStructure.get(2);
//        BurgerSauce mcSauce = (BurgerSauce) mcStructure.get(3);
//        
//        System.out.println(mcBun.getBun() + mcPatty.getPatty() + mcCheese.getCheese() + mcSauce.getSauce());
}
