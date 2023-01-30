package FlightControl.logic;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;
import java.util.Collection;
import java.util.HashMap;

public class FlightControl {
    private HashMap<String, Airplane> airplane;
    private HashMap<String, Flight> flight;
    private HashMap<String, Place> place;

    public FlightControl() {
        this.airplane = new HashMap<>();
        this.flight = new HashMap<>();
        this.place = new HashMap<>();
    }  
    
    public void addAirplane(String ID, int capacity){
        this.airplane.put(ID, new Airplane(ID, capacity));
    }
    
    public void addFlight(Airplane airplane, String depID, String tarID) {
        this.place.putIfAbsent(depID, new Place(depID));
        this.place.putIfAbsent(tarID, new Place(tarID));
        
        Flight flightPlane =  new Flight(airplane, 
                this.place.get(depID), this.place.get(tarID));
        this.flight.put(flightPlane.toString(), flightPlane);
    }

    public Collection<Airplane> getAirplane() {
        return this.airplane.values();
    }

    public Collection<Flight> getFlight() {
        return this.flight.values();
    }

    public Airplane getAirplaneID(String ID) {
        return this.airplane.get(ID);
    }
}
