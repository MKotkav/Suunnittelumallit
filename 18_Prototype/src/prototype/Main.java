/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author Mikael Kotkavuori
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread clockT, clockT2;
        Hand hour, minute, second;
        Clock clock1, clock2;

        hour = new HourHand();
        minute = new MinuteHand();
        second = new SecondHand();
        
        

//Deep copy
        clock1 = new DeepClock();
        clock1.assemble(hour, minute, second);
        clock1.setTime(1, 2, 3);
        clock2 = (Clock)clock1.clone();
        clock1.setName("deep clock 1");
        clock2.setName("deep clock 2");

//Shallow copy
//        clock1 = new ShallowClock();
//        clock1.assemble(hour, minute, second);
//        clock1.setTime(5, 5, 5);
//        clock2 = (Clock)clock1.clone();
//        clock1.setName("shallow clock 1");
//        clock2.setName("shallow clock 2");

//Threads start
        
        clockT = new Thread((Runnable)clock1);
        clockT2 = new Thread((Runnable)clock2);

        clockT.start();
        try {
            Thread.sleep(5000);
        }
        catch(Exception e) {
           e.printStackTrace();
        }
        
        clockT2.start();

        try {
            Thread.sleep(5000);
        }
        catch(Exception e) {
           e.printStackTrace();
        }
        System.out.println("adjusting time on the first clock");
        clock1.setTime(3, 2, 1);
try {
            Thread.sleep(5000);
        }
        catch(Exception e) {
           e.printStackTrace();
        }
        System.out.println("adjusting time on the second clock");
        clock2.setTime(9, 8, 7);
    }
    
}
