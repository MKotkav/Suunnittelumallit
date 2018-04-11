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
public class Charmander implements PokemonState {

    private static Charmander instance = null;
    
    private Charmander() {
    
    }
    
    public static PokemonState getInstance() {
        if(instance == null) {
            instance = new Charmander();
        }
        return instance;
    }
    

    @Override
    public void move() {
        System.out.println("moves slowly");
    }

    @Override
    public void fight() {
        System.out.println("fights weakly");
    }

    @Override
    public void talk() {
        System.out.println("charmander");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(instance);
    }
    
}
