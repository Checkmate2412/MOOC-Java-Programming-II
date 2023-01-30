package FlightControl.ui;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.logic.FlightControl;;
import java.util.Scanner;

public class UserInterface {
    private Scanner scan;
    private FlightControl flightControl;

    public UserInterface(Scanner scan) {
        this.scan = scan;
        this.flightControl = new FlightControl();
    }
    
    public void startUI() {
        this.airportAssetControl();
        System.out.println("");
        this.FlightControl();
        System.out.println("");
    }
    
    private void airportAssetControl() {
        System.out.println("Airport Asset Control");
        while (true) {            
            System.out.println("Choose an action:\n"
                + "[1] Add an airplane\n"
                + "[2] Add a flight\n"
                + "[x] Exit Airport Asset Control");
            String input = scan.nextLine();

            if (input.equals("1"))
                this.addAirplane();
            else if (input.equals("2"))
                this.addFlight();
            else if (input.equals("x"))
                break;
            System.out.println("");
        }
    }
    
    private void addAirplane() {
        System.out.println("Give the airplane id: ");
        String ID = scan.nextLine();
        System.out.println("Give the airplane capacity: ");
        int capacity = scan.nextInt();
        this.flightControl.addAirplane(ID, capacity);
    }
    
    private void addFlight() {
        System.out.println("Give the airplane id: ");
        Airplane airplane = checkAirplane(this.scan);
        System.out.println("Give the departure airport id: ");
        String depID = scan.nextLine();
        System.out.println("Give the target airport id: ");
        String tarId = scan.nextLine();
        this.flightControl.addFlight(airplane, depID, tarId);
    }
    
    private Airplane checkAirplane(Scanner scan) {
        Airplane airplane = null;      
        while (airplane == null) {            
            String ID = scan.nextLine();
            airplane = this.flightControl.getAirplaneID(ID);
            
            if (airplane == null)
                System.out.println("No airplane with the id " + ID + ".");
        }
        return airplane;
    }
    
    private void FlightControl() {
        System.out.println("Flight Control");
        while (true) {            
            System.out.println("Choose an action:\n"
                + "[1] Print airplanes\n"
                + "[2] Print flights\n"
                + "[3] Print airplane details\n"
                + "[x] Quit");
            String input = scan.nextLine();
            
            if (input.equals("1"))
                this.printAirplanes();
            else if (input.equals("2"))
                this.printFlights();
            else if (input.equals("3"))
                this.printAirplaneDetails();
            else if (input.equals("x"))
                break;
            System.out.println("");
        }
    }
    
    private void printAirplanes() {
        for (Airplane airplane: this.flightControl.getAirplane())
            System.out.println(airplane);
    }
    
    private void printFlights() {
        for (Flight flight: this.flightControl.getFlight())
            System.out.println(flight);
    }
    
    private void printAirplaneDetails() {
        System.out.println("Give the airplane id: ");
        Airplane airplane = checkAirplane(this.scan);
        System.out.println(airplane);
    }
}
