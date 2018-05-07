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
public class LowerCommand implements Command {
    private Screen screen;

    public LowerCommand(Screen screen) {
        this.screen = screen;
    }
    
    @Override
    public void execute() {
        screen.lower();
    }
    
}
