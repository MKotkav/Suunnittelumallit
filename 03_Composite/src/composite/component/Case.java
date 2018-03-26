/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite.component;

import java.util.ArrayList;

/**
 *
 * @author Mikael Kotkavuori
 */
public class Case implements Component{

    private ArrayList<Component> components;
    private double price;
    
    public Case(double price) {
        this.price = price;
        components = new ArrayList();
    }
    
    @Override
    public double getPrice() {
        double sum = price;
        for(Component component : components) {
            sum += component.getPrice();
        }
        return sum;
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        components.remove(components.indexOf(component));
    }

    @Override
    public Component getChild(int index) {
        return components.get(index);
    }
    
}
