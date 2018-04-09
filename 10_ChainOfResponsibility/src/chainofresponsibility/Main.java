/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

/**
 *
 * @author Mikael Kotkavuori
 */
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    private final static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        double percent = 0.0;
        
        ImmediateSupervisor supervisor = new ImmediateSupervisor();
        HeadOfUnit unitHead = new HeadOfUnit();
        ChiefExecutiveOfficer ceo = new ChiefExecutiveOfficer();
        
        supervisor.setSuccessor(unitHead);
        unitHead.setSuccessor(ceo);
        
        
        while(percent >= 0.0) {
            System.out.print("Syötä toivottu palkkakorotus prosentteina: ");
            percent = scanner.nextDouble();
            supervisor.processRequest(new RaiseRequest(percent));
            System.out.println("Negatiivinen luku kesteyttää.");
        }
        
    }
    
}
