package FlightControl.domain;

public class Flight {
    private Airplane airplane;
    private Place depId, tarID;

    public Flight(Airplane airplane, Place depId, Place tarID) {
        this.airplane = airplane;
        this.depId = depId;
        this.tarID = tarID;
    }

    public Airplane getAirplane() {
        return this.airplane;
    }

    public Place getDepId() {
        return this.depId;
    }

    public Place getTarID() {
        return this.tarID;
    }

    @Override
    public String toString() {
        return this.airplane.getID() + " " + this.airplane
                + " (" + this.depId + "-" 
                + this.tarID + ")";
    }
}
