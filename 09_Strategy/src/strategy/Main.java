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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        List<String> list = new ArrayList();
        ListConverter strategy1 = new Strategy1();
        Composition context = new Composition(strategy1);
        String testString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur condimentum quis arcu a aliquam.";
        
        for(String snippet : testString.split(" ")) {
            list.add(snippet);
        }
        
        context.setList(list);
        
        System.out.println(context.toString());
        
        context.setStrategy(new Strategy2());
        System.out.println("\n" + context.toString());
        
        context.setStrategy(new Strategy3());
        System.out.println("\n" + context.toString());
    }
    
}
