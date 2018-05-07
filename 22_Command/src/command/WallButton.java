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
public class WallButton {
    private Command command;
    
    public WallButton(Command command) {
        this.command = command;
    }
    
    public void push() {
        command.execute();
    }
}
