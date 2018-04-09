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
public class ImmediateSupervisor extends Handler{

    @Override
    protected double getAllowable() {
        return BASE * 0.02;
    }

    @Override
    protected String getRole() {
        return "Lähiesimies";
    }
    
    public void fillOutExcel() {
        System.out.println("Your coffee break was two minutes too long!");
    }
    
}
