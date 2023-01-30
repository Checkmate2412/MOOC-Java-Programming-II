
public class Main {

    public static void main(String[] args) {
        // the following is the same sample program shown in ex 8.13 description
        
        VehicleRegistry vr = new VehicleRegistry(); 
        vr.add( new LicensePlate("FI", "AAA-111"), "Arto");
        vr.add( new LicensePlate("FI", "BBB-222"), "Pekka");
        vr.add( new LicensePlate("FI", "CCC-333"), "Arto");
        vr.printOwners();
    }
}
