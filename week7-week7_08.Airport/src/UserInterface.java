
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
public class UserInterface {
    
    private Scanner reader;
    private Airplane airplane;
    
    
    public UserInterface(Scanner reader, Airplane airplane) {
        this.reader = reader;
        this.airplane = airplane;
    }
    
    public void start() {
    System.out.println("Airport Panel");
    System.out.println("-------------------- \n");
    System.out.println("Choose operation: ");
    System.out.println("[1] Add airplane");
    System.out.println("[2] Add flight");
    System.out.println("[x] Exit");
    System.out.print("> ");
    handleAirportPanelInput();
    }
    
    private void handleAirportPanelInput() {
        String input;
        input = reader.nextLine();
        while(true)
            if(input.equals("1")) {
                addPlane();
            }
            else if(input.equals("2")) {
                addFlight();
            }
        }
    
    private void addPlane() {
        System.out.print("Give plane ID: ");
        String id = reader.nextLine();
        System.out.println("Give plane capacity: ");
        String capacity = reader.nextLine();
        airplane.add(id, capacity);
    }
    
    private void addFlight() {
        System.out.println("Give plane ID: ");
        String 
    }
        
        
}
