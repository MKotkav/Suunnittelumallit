/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

/**
 *
 * @author Mikael Kotkavuori
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Riddler riddler = new Riddler();
        
        for(int i = 0; i < 5; i++) {
            Guesser player = new Guesser(riddler);
            player.run();
        }
    }
    
}
