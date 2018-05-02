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
public class TaskB implements Runnable{
    private static Iterator<Integer> iterator;
    
    public TaskB(Iterator<Integer> iterator) {
        this.iterator = iterator;
    }

    @Override
    public void run() {
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    
}
