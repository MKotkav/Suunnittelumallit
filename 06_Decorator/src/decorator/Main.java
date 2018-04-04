/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Mikael Kotkavuori
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pizza capricciosa = new Ham(new Mushroom(new PizzaBottom()));
        Pizza hawaii = new Ham(new Pineapple(new PizzaBottom()));
        Pizza fantasia = new Pepperoni(new Mushroom(new Pineapple(new PizzaBottom())));
        
        Map<String, Object> menu = new HashMap();
        
        menu.put("Cappriciosa", capricciosa);
        menu.put("Hawaii", hawaii);
        menu.put("Fantasia", fantasia);
        
        for(Map.Entry<String, Object> item : menu.entrySet()) {
            String name = item.getKey();
            Pizza pizza = (Pizza) item.getValue();
            
            System.out.println(name + ": " + pizza.getDescription() + " " + String.valueOf(pizza.getPrice()) + " euroa.");
        }
    
    }
    
}
