/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

/**
 *
 * @author Mikael Kotkavuori
 */
public class PokemonContext implements PokemonState {
    private PokemonState state;
    private int stateIndex;
    
    public PokemonContext() {
        stateIndex = 0;
        state = Charmander.getInstance();
    }
    
    public void evolve() {
        switch(stateIndex) {
            case 0:
                state = Charmeleon.getInstance();
                stateIndex++;
                break;
            case 1:
                state = Charizard.getInstance();
                stateIndex++;
                break;
            case 2:
                System.out.println("Your pokeman cannot evolve any further.");
                break;
        }
    }
    
    public void devolve() {
        switch(stateIndex) {
            case 0:
                System.out.println("Your pokeman cannot devolve any further.");
                break;
            case 1:
                state = Charmander.getInstance();
                stateIndex--;
                break;
            case 2: 
                state = Charmeleon.getInstance();
                stateIndex--;
                break;
        }
    }
    
    @Override
    public void move() {
        state.move();
    }
    
    @Override
    public void fight() {
        state.fight();
    }
    
    @Override
    public void talk() {
        state.talk();
    }

    @Override
    public void accept(Visitor visitor) {
        state.accept(visitor);
    }
    
}
