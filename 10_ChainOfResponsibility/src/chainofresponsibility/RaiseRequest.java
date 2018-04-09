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
public class RaiseRequest {
    private double percent;
    
    public RaiseRequest(double percent) {
        this.percent = percent;
    }
    
    public double getAmount() {
        return percent;
    }
    
}
