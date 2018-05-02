/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20_iterator;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/**
 *
 * @author Mikael Kotkavuori
 */
public class TaskD implements Runnable{
    private static Iterator<Integer> iterator;
    private ArrayList<Integer> list;
    
    public TaskD(Iterator<Integer> iterator, ArrayList<Integer> list) {
        this.iterator = iterator;
        this.list = list;
    }

    @Override
    public void run() {
        int index = 0;
        try {
            while(iterator.hasNext()) {
                if(index == 2) {
                    iterator.remove();
                }
                if(index == 8) {
                    list.add(10);
                }
                System.out.println(iterator.next());
                index++;
            }
        }
        catch(ConcurrentModificationException e) {
            System.out.println("Tried to modify a list while it was being iterated.");
        }
    }
    
}
