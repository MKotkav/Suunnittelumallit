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
public class BonusVisitor implements Visitor{

    @Override
    public void visit(Charizard instance) {
        System.out.println("Gets the biggest bonus");
    }

    @Override
    public void visit(Charmander instance) {
        System.out.println("Gets a little bonus");
    }

    @Override
    public void visit(Charmeleon instance) {
        System.out.println("Gets a medium bonus");
    }
    
}
