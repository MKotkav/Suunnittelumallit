/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Mikael Kotkavuori
 */
public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static List<Image> album = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int selection = 0;
        
        String[] imageNames = {"Lunch_Instagram","Lunch_Facebook","Dinner_Twitter","That_One_Gym_Photo", "Selfie_Cool"};
        
        for(String name : imageNames) {
            album.add(new ProxyImage(name));
        }
        
        while(selection != 9) {
            System.out.println("1. Listaa sisältö");
            System.out.println("2. Selaa kuvia");
            System.out.println("9. Lopeta");
            
            selection = scanner.nextInt();
            
            switch(selection) {
                case 1:
                    showAlbumData();
                    break;
                case 2: 
                    browseImages();
                    break;
                case 9:
                    break;
            }
        }
    }
    
    public static void showAlbumData() {
        int count = 1;
        for(Image image : album) {
            System.out.print(String.valueOf(count) + ". ");
            image.showData();
            count++;
        }
        System.out.println("\n");
    }
    
    public static void browseImages() {
        int selection = 0, index = 0;
        
        while(selection != 9) {
            System.out.println("1. Edellinen kuva");
            System.out.println("2. Seuraava kuva");
            System.out.println("9. Palaa takaisin valikkoon");
            selection = scanner.nextInt();
        
            switch(selection) {
                case 1:
                    if(index == 0) {
                        index = album.size();
                    }
                    index--;
                    break;
                case 2: 
                    if(index == album.size() -1) {
                        index = -1;
                    }
                    index++;
                    break;
                case 9: 
                    break;
            }
            album.get(index).displayImage();
        }
    }
    
}
