
import java.util.Scanner;
import java.util.HashMap;

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
    private HashMap<String, Airplane> planes;
    private HashMap<String, Flight> flights;
    
    
    public UserInterface(Scanner reader) {
        this.planes = new HashMap<String, Airplane>();
        this.flights = new HashMap<String, Flight>();
        this.reader = reader;
    }
    
    public void start() {
    System.out.println("Airport Panel");
    System.out.println("-------------------- \n");
    
    while (true) {
        System.out.println("Choose operation: ");
        System.out.println("[1] Add airplane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit");
        System.out.print("> ");

        String input = reader.nextLine();

            if(input.equals("1")) {
                addPlane();
            }
            else if(input.equals("2")) {
                addFlight();
            }
            else if (input.equals("x")) {
                System.out.println("");
                flightService();
            }
        }
    }
        

    private void flightService() {
        System.out.println("Flight service");
        System.out.println("------------\n");
        
        while (true) {
        System.out.println("Choose operation: ");
        System.out.println("[1] Print planes");
        System.out.println("[2] Print flights");
        System.out.println("[3] Print plane info");
        System.out.println("[x] Exit");
        System.out.print(" > ");
        
        String input = reader.nextLine();

            if (input.equals("x")) {
                break;
            }
            else if(input.equals("1")) {
                printPLanes();
            }
            else if(input.equals("2")) {
                printFlights();
            }
            else if (input.equals("3")) {
                planeInfo();
            }
        }
    }
    
    //-------------------HELPER FUNCTIONS-------------------
    private void addPlane() {
        System.out.print("Give plane ID: ");
        String id = reader.nextLine();
        System.out.print("Give plane capacity: ");
        String capacity = reader.nextLine();
        this.planes.put(id, new Airplane(id, capacity));
    }
    
    private void addFlight() {
        System.out.print("Give plane ID: ");
        String id = reader.nextLine();
        Airplane plane = planes.get(id);
        System.out.print("Give departure airport code: ");
        String departureCode = reader.nextLine();
        System.out.print("Give destination airport code: ");
        String destinationCode = reader.nextLine();
        Flight flight = new Flight(plane, departureCode, destinationCode);
        
    }
    
    private void printPLanes() {
        for (Airplane plane : planes.values()) {
            System.out.println(plane);
        }
    }
    
    private void printFlights() {
        for (Flight flight : flights.values()) {
            System.out.println(flight);
        }
    }
    
    private void planeInfo() {
        System.out.print("Give plane ID: ");
        String planeId = reader.next();
        Airplane plane = planes.get(planeId);
        System.out.println(plane);
    }
    
        
        
}
