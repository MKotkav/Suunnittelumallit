/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mikael Kotkavuori
 */
public class Composition {
    private List<String> list;
    private ListConverter strategy;
    
    public Composition(ListConverter strategy) {
        this.strategy = strategy;
        list = new ArrayList();
    }
    
    public void addToList(String item) {
        list.add(item);
    }
    
    public void setList(List<String> list) {
        this.list = list;
    }
    
    public void setStrategy(ListConverter strategy) {
        this.strategy = strategy;
    }
    
    @Override
    public String toString() {
        return strategy.listToString(list);
    }
}
