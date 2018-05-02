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
public class TaskA implements Runnable{
    private ArrayList<Integer> list;
    private Iterator<Integer> iterator;
    
    public TaskA(ArrayList<Integer> list) {
        this.list = list;
        iterator = list.iterator();
    }
    
    @Override
    public void run() {
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
    
}
