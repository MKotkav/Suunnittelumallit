/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Mikael Kotkavuori
 */
public class ClockTimer extends Observable implements Runnable{
    private int hour = 0, minute = 0, second = 0;
    
    
    public int getHour() {
        return hour;
    }
    
    public int getMinute() {
        return minute;
    }
    
    public int getSecond() {
        return second;
    }
    
    private void tick() {
        if(second == 59) {
            if(minute == 59) {
                if(hour == 23) {
                    hour = 0;
                }
                else hour++;
                minute = 0;
            }
            else minute++;
            second = -1;
        }
        second++;
        notifyObservers();
    }
    
    

    @Override
    public void run() {
        while(true) {
            tick();
            setChanged();
            notifyObservers(this);
            try {
                Thread.sleep(1000);
            }
            catch (Exception e) {
                System.out.println(e);
            }
            
        }
    }
    
}
