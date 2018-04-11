/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

/**
 *
 * @author Mikael Kotkavuori
 */
public class RealImage implements Image{
    private String filename;
    
    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }
    
    private void loadImageFromDisk() {
        System.out.println("Loading " + filename);
    }

    @Override
    public void displayImage() {
        System.out.println("Displaying " + filename);
    }

    @Override
    public void showData() {
        System.out.println(filename);
    }
    
    
}
