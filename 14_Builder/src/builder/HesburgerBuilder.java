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
public class HesburgerBuilder extends BurgerBuilder<StringBuilder>{

    public HesburgerBuilder() {
        burgerStructure = new StringBuilder();
    }
    
    @Override
    public void buildBun() {
        BurgerBun bun = new BurgerBun("wheat ");
        burgerStructure.append(bun.getBun());
        burger.setBun(bun.getBun());
    }

    @Override
    public void buildPatty() {
        BurgerPatty patty = new BurgerPatty("mince meat ");
        burgerStructure.append(patty.getPatty());
        burger.setPatty(patty.getPatty());
    }

    @Override
    public void buildCheese() {
        BurgerCheese cheese = new BurgerCheese("emmental ");
        burgerStructure.append(cheese.getCheese());
        burger.setCheese(cheese.getCheese());
    }

    @Override
    public void buildSauce() {
        BurgerSauce sauce = new BurgerSauce("mayonnaise ");
        burgerStructure.append(sauce.getSauce());
        burger.setSauce(sauce.getSauce());
    }
    
}
