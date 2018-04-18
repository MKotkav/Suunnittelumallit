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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PlugTypeF plugF = new PlugTypeF();
        SocketTypeB socketB = new SocketTypeB();
        FtoBAdapter fbAdapter = new FtoBAdapter(plugF);
        socketB.plugIn(fbAdapter);
        
        PlugTypeB plugB = new PlugTypeB();
        SocketTypeF socketF = new SocketTypeF();
        BtoFAdapter bfAdapter = new BtoFAdapter(plugB);
        bfAdapter.useOnSocket(socketF);
        
    }
    
}
