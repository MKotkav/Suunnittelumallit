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
public interface PokemonState {
    
    public abstract void move();
    public abstract void fight();
    public abstract void talk();
    
}
