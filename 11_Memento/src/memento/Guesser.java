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
public class Guesser implements Runnable{
    private boolean guessedRight = false;
    private Riddler game;
    private Caretaker caretaker;
    
    public Guesser(Riddler game) {
        this.game = game;
        caretaker = new Caretaker(this);
    }

    @Override
    public void run() {
        game.joinGame(this);
        while(!guessedRight) {
            try {
                int guess = ThreadLocalRandom.current().nextInt(0, 101);
                guessedRight = game.guess(this, guess);
                if(guessedRight) {
                    System.out.println("Pelaaja arvasi oikein! Luku oli " + String.valueOf(guess));
                } 
                // else System.out.println("Pelaaja arvasi väärin, luku ei ollut " + String.valueOf(guess));
                Thread.sleep(10);
            
            }
            catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public Memento saveCorrectNumber(int correctNum) {
        return new Memento(correctNum);
    }
    
    public int getCorrectNumber() {
        Memento memento = (Memento) caretaker.getMemento();
        return memento.getCorrectNum();
    }
    
    public void setMemento(Object obj) {
        caretaker.saveMemento(obj);
    }
    
    
    private static class Memento {
    
        private final int correctNum;
        
        public Memento(int correctNum) {
            this.correctNum = correctNum;
        }
        
        private int getCorrectNum() {
            return this.correctNum;
        }
    }
}
