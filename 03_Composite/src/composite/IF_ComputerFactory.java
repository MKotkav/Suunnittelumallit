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
public interface IF_ComputerFactory {
    public abstract Component createCase();
    public abstract Component createMotherboard();
    public abstract Component createCpu();
    public abstract Component createGpu();
    public abstract Component createRam();
    public abstract Component createNic();
    
}
