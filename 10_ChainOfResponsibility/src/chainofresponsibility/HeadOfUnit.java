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
public class HeadOfUnit extends Handler{

    @Override
    protected double getAllowable() {
        return BASE * 0.05;
    }

    @Override
    protected String getRole() {
        return "Yksikön päällikkö";
    }
    
    public void avoidResponsibility() {
        System.out.println("I'll make sure the right people are made aware of your issue.");
    }
}
