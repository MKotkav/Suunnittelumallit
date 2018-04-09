/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Mikael Kotkavuori
 */
public class Riddler {
    
    public boolean guess(Guesser player, int guess) {
        if( player.getCorrectNumber() == guess) {
            return true;
        }
        else return false;
    
    }
    
    public static void joinGame(Guesser player) {
        int numberToGuess = ThreadLocalRandom.current().nextInt(0, 101);
        player.setMemento(player.saveCorrectNumber(numberToGuess));
        
    }
    
}
