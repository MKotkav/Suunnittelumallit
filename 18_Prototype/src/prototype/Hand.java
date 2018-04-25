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
public abstract class Hand implements Cloneable{   
    protected Hand successor;
    
    protected abstract int getHand();
    protected abstract void setHand(int hand);
    protected abstract void tickHand();
    protected abstract int getMax();
    
    public void setSuccessor(Hand successor) {
        this.successor = successor;
    }
    
    public void tick() {
        if(this.getHand() < getMax()) {
            this.tickHand();
        }
        else if (successor != null) {
            this.setHand(0);
            successor.tick();
        }
        else System.out.println("Kello on rikki.");
    }
    
    public String getTime() {
        if(successor != null) {
            return successor.getTime() + ":" + String.valueOf(this.getHand());
        }
        else return String.valueOf(this.getHand());
    }
    
    public Object clone() {
        try {
            return super.clone();
        }
        catch(CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
