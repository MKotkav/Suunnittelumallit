/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author Mikael Kotkavuori
 */
public class PlugTypeB {

    private String electricity = "Type B | grounded | 15 A | almost always 100 – 127 V";
    
    public String getElectricity() {
        return electricity;
    }
    
    public void setElectricity(String electricity) {
        this.electricity = electricity;
    }
}
