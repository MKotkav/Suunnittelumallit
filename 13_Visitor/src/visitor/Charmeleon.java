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
public class Charmeleon implements PokemonState {

    private static Charmeleon instance = null;
    
    private Charmeleon() {
    
    }
    
    public static PokemonState getInstance() {
        if(instance == null) {
            instance = new Charmeleon();
        }
        return instance;
    }

    @Override
    public void move() {
        System.out.println("moves averagely");
    }

    @Override
    public void fight() {
        System.out.println("fights mediocrely");
    }

    @Override
    public void talk() {
        System.out.println("charmeleon");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(instance);
    }
    
}
