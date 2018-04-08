/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Mikael Kotkavuori
 */
public class DiceGame extends Game {
    
    private boolean gameOver = false, gameOn = false;
    private Dice dice;
    private Map<Integer,Integer> scores;

    @Override
    void initializeGame() {
        dice = new Dice();
        scores = new HashMap();
    }

    @Override
    void makePlay(int player) {

        if(player == 0 && gameOn) {
            gameOver = true;
        }
            
        scores.put(player, dice.roll());
        gameOn = true;
    }

    @Override
    boolean endOfGame() {
        return gameOver;

    }

    @Override
    void printWinner() {
        int highestRoll = (Collections.max(scores.values()));
        System.out.println("Highest roll: " + String.valueOf(highestRoll));
        String winners = "Winners:";
        for(Map.Entry<Integer, Integer> player : scores.entrySet()){
            if(player.getValue() == highestRoll) {
                winners +=  "| Player " + String.valueOf(player.getKey() + 1) + " |";
            }
        }
        System.out.println(winners);
    }
    
}
