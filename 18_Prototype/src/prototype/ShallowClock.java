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
public class ShallowClock extends Clock implements Cloneable, Runnable{
    
    private Hand hour, minute, second;
    private boolean running = true;
    private String name;
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public void setTime(int h, int m, int s) {
        hour.setHand(h);
        minute.setHand(m);
        second.setHand(s);
    }

    @Override
    public void tick() {
        second.tick();
    }

    @Override
    public void tellTime() {
        System.out.println(name + ": " + second.getTime());
    }

    @Override
    public void assemble(Hand hour, Hand minute, Hand second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        
        second.setSuccessor(minute);
        minute.setSuccessor(hour);
    }

    @Override
    public void run() {
        while(running) {
            try{
                this.tellTime();
                tick();
                Thread.sleep(1000);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public void stop() {
        running = false;
    }
}
