/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author Mikael Kotkavuori
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        Screen screen = new Screen();
        Command raise = new RaiseCommand(screen);
        Command lower = new LowerCommand(screen);
        WallButton upButton = new WallButton(raise);
        WallButton downButton = new WallButton(lower);
        
        downButton.push();
        upButton.push();
    }
    
}
