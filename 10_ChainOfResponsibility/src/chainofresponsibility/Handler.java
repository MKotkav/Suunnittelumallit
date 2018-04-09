/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

/**
 *
 * @author Mikael Kotkavuori
 */
public abstract class Handler {
    protected final static double BASE = 100.0; 
    protected Handler successor;
    
    protected abstract double getAllowable();
    protected abstract String getRole();
    
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
    
    public void processRequest(RaiseRequest request) {
        if(request.getAmount() < this.getAllowable()) {
            System.out.println(this.getRole() + " käsittelee palkankorotuspyynnön.");
        }
        else if(successor != null) {
            successor.processRequest(request);
        }
        else System.out.println("Pyyntöä ei voi käsitellä.");
    }
}
