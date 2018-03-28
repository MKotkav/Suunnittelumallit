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
public class SingletonFactory {

    private static volatile SingletonFactory instance= null;
    
    private SingletonFactory() {}
    
    public static SingletonFactory getInstance() {
        if(instance == null) {
            synchronized(SingletonFactory.class) {
                if(instance == null) {
                    instance = new SingletonFactory();
                }
            }
        }
        return instance;
    }
    
    public AbstractProductA createAbstractProductA() {
        return new ConcreteProductA();
    }
    
    public AbstractProductB createAbstractProductB() {
        return new ConcreteProductB();
        
    }
}
