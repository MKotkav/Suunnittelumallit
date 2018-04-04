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
public class Charizard implements PokemonState {
    private static Charizard instance = null;
    
    
    
    public static PokemonState getInstance() {
    if(instance == null) {
            instance = new Charizard();
        }
        return instance;
    }

    @Override
    public void move() {
        System.out.println("moves fast");
    }

    @Override
    public void fight() {
        System.out.println("fights like a champ");
    }

    @Override
    public void talk() {
        System.out.println("charizard");
    }
    
}
