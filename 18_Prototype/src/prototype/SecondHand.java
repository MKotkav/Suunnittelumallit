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
public class SecondHand extends Hand {

    private int hand = 0;
    
    @Override
    protected int getHand() {
        return hand;
    }

    @Override
    protected void setHand(int hand) {
        this.hand = hand;
    }

    @Override
    protected void tickHand() {
        hand++;
    }

    @Override
    protected int getMax() {
        return 59;
    }
    
}
