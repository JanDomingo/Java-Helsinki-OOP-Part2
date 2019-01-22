
import java.util.HashMap;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jandomingo
 */
public class AirportPanel {
    private HashMap<String, Integer> airportPanel;
    
    
    public AirportPanel() {
        airportPanel = new HashMap<String, Integer>();
    }
    
    public void start() {
        System.out.println("Airport Panel");
        System.out.println("-------------------- \n");
        System.out.println("Choose operation: ");
        System.out.println("[1] Add airplane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit");
        System.out.print("> ");
    }
    
    
}
