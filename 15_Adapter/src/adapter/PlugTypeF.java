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
public class PlugTypeF {

    private String electricity = "Type F | grounded | 16 A | 220 – 240 V";
    
    public String getElectricity() {
        return electricity;
    }
    
    public void setElectricity(String electricity) {
        this.electricity = electricity;
    }
}
