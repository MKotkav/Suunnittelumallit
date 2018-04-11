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
public class ProxyImage implements Image {
    private RealImage image= null;
    private String filename = null;
    
    public ProxyImage(String filename) {
        this.filename = filename;
    
    }

    @Override
    public void displayImage() {
        if(image == null) {
            image = new RealImage(filename);
        }
        image.displayImage();
    }

    @Override
    public void showData() {
        System.out.println(filename);
    }
    
}
