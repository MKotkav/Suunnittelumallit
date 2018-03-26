/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite.component;

/**
 *
 * @author Mikael Kotkavuori
 */
public interface Component {
    
    public abstract double getPrice();
    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract Component getChild(int index);
}
