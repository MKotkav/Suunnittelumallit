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
public class TaskC implements Runnable{
    private ArrayList<Integer> list;
    private Iterator<Integer> iterator;
    
    public TaskC(ArrayList<Integer> list) {
        this.list = list;
        iterator = list.iterator();
    }
    
    @Override
    public void run() {
        int index = 0;
        try {
            while(iterator.hasNext()) {
                if(index == 2) {
                    list.add(10);
                }
                else if (index == 5) {
                    list.remove(7);
                }
                System.out.println(iterator.next());
                index++;
            }
        }
        catch(ConcurrentModificationException e) {
            System.out.println("Tried to modify a list while it was being iterated");
        }
    }
    
}
