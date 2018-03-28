/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Mikael Kotkavuori
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        SingletonFactory factoryInstance = SingletonFactory.getInstance();
        
        AbstractProductA productA = factoryInstance.createAbstractProductA();
        AbstractProductB productB = factoryInstance.createAbstractProductB();
        
        System.out.println("Singleton tehdas tuottaa: " + productA.toString() + " ja " + productB.toString());
    }
    
}
