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
public class ChiefExecutiveOfficer extends Handler{

    @Override
    protected double getAllowable() {
        return BASE * 1.0;
    }

    @Override
    protected String getRole() {
        return "Toimitusjohtaja";
    }
    
    public void playGolf() {
        System.out.println("All day every day!");
    }
}
