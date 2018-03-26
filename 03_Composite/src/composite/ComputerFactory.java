/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import composite.component.Case;
import composite.component.Component;
import composite.component.Cpu;
import composite.component.Gpu;
import composite.component.Motherboard;
import composite.component.Nic;
import composite.component.Ram;

/**
 *
 * @author Mikael Kotkavuori
 */
public class ComputerFactory implements IF_ComputerFactory {

    @Override
    public Component createCase() {
        return new Case(99.90);
    }

    @Override
    public Component createMotherboard() {
        return new Motherboard(129.99);
    }

    @Override
    public Component createCpu() {
        return new Cpu(299.90);
    }

    @Override
    public Component createGpu() {
        return new Gpu(499.90);
    }

    @Override
    public Component createRam() {
        return new Ram(79.90);
    }

    @Override
    public Component createNic() {
        return new Nic(59.99);
    }
    
}
