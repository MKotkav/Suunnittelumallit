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
public class FtoBAdapter extends PlugTypeB {
    private PlugTypeF plug;
    
    public FtoBAdapter(PlugTypeF plug) {
        this.plug = plug;
    }

    @Override
    public String getElectricity() {
        return "FtoBAdapter: " + plug.getElectricity(); 
    }

   
}
