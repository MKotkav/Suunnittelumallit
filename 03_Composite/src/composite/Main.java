/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import composite.component.Component;

/**
 *
 * @author Mikael Kotkavuori
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ComputerFactory factory = new ComputerFactory();
        Computer computer = new Computer(factory);
        
        System.out.println("Tietokoneen hinta on: " + Double.toString(computer.getPrice()));
    }
    
}
