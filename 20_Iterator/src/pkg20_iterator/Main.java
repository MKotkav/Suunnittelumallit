/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20_iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Mikael Kotkavuori
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            list.add(i);
        }
        
        System.out.println("Task A:");
        
        for(int i = 0; i < 2; i++) {
            TaskA taskA = new TaskA(list);
            taskA.run();
        }
        
        System.out.println("\n\nTask B:");
        
        Iterator<Integer> iterator = list.iterator();
        for(int j = 0; j < 2; j++) {
            TaskB taskB = new TaskB(iterator);
            taskB.run();
        }

        iterator = list.iterator();
        System.out.println("\n\nTask D:");
        for(int k = 0; k < 2; k++) {
            TaskD taskD = new TaskD(iterator, list);
            taskD.run();
        }
        
        System.out.println("\n\nTask C:");
        TaskC taskC = new TaskC(list);
        taskC.run();
        
        
        
    }
    
}
