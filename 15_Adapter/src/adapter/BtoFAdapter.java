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
public class BtoFAdapter {
    private PlugTypeB plug;
    private PlugTypeF plugF;
    
    public BtoFAdapter(PlugTypeB plug) {
        this.plug = plug;
        plugF = new PlugTypeF();
        plugF.setElectricity(this.getElectricity());
    }

    public String getElectricity() {
        return "BtoFAdapter: " + plug.getElectricity(); 
    }
    
    public void useOnSocket(SocketTypeF socket) {
        socket.plugIn(plugF);
    }
    
    
}
