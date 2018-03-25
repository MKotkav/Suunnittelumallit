/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import abstractfactory.factory.AbstractFactory;
import abstractfactory.factory.ConcreteFactoryAdidas;
import abstractfactory.factory.ConcreteFactoryBoss;

/**
 *
 * @author Mikael Kotkavuori
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jasper jasper = new Jasper();
        
        AbstractFactory[] factories = {new ConcreteFactoryAdidas(), new ConcreteFactoryBoss()};
        
        for(AbstractFactory factory : factories) {
            System.out.println("Jasper pukeutuu...");
            jasper.setJeans(factory.createJeans());
            jasper.setTshirt(factory.createTshirt());
            jasper.setCap(factory.createCap());
            jasper.setShoes(factory.createShoes());
        
            System.out.println("Jasperilla on yllään: " + 
                    jasper.getJeans().toString() + ", " + 
                    jasper.getTshirt().toString() + ", " +
                    jasper.getCap().toString() + " ja " +
                    jasper.getShoes().toString() + ".");
        }
    
    }
    
}
