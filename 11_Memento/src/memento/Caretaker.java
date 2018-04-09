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
public class Caretaker {
    private Guesser guesser;
    private Object obj;
    
    public Caretaker(Guesser guesser) {
        this.guesser = guesser;
    }
    
    public void saveMemento(Object obj) {
        this.obj = obj;
    }
    
    public Object getMemento() {
        return obj;
    }
    
}
