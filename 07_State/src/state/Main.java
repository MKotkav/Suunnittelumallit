/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author Mikael Kotkavuori
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PokemonContext pokemon = new PokemonContext();
        for(int i = 0; i < 8; i++) {
            pokemon.talk();
            pokemon.move();
            pokemon.fight();
            if(i < 2) {
                pokemon.evolve();
            }
            else if(i < 5) {
                pokemon.devolve();
            }
            else pokemon.evolve();
        }
    }
    
}
