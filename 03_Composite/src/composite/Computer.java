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
public class Computer {
    private final IF_ComputerFactory factory;
    private Component casing, motherboard, cpu, gpu, ram, nic;
    
    public Computer(IF_ComputerFactory factory) {
        this.factory = factory;
        assemble();
    }
    
    private void assemble() {
        casing = factory.createCase();
        motherboard = factory.createMotherboard();
        cpu = factory.createCpu();
        gpu = factory.createGpu();
        ram = factory.createRam();
        nic = factory.createNic();
        
        motherboard.add(cpu);
        motherboard.add(gpu);
        motherboard.add(ram);
        motherboard.add(nic);
        casing.add(motherboard);
    }
    
    public double getPrice() {
        return casing.getPrice();
    }
    
}
