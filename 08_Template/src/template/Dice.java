/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Mikael Kotkavuori
 */
public class Dice {
    
    public Dice() {
    
    }
    public int roll() {
        return ThreadLocalRandom.current().nextInt(1, 6 + 1);
    }
}
