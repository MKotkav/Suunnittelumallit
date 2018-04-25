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
public abstract class Clock implements Cloneable, Runnable{
    public abstract void setName(String name);
    public abstract void setTime(int h, int m, int s);
    public abstract void tick();
    public abstract void tellTime();
    public abstract void assemble(Hand hour, Hand minute, Hand second);
    public abstract void run();
    
    public Object clone() {
     try {
            return super.clone();
        }
        catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
