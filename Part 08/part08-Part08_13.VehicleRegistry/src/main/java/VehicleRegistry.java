
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> hashMap;

    public VehicleRegistry() {
        this.hashMap = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.hashMap.containsKey(licensePlate))
            return false;
        this.hashMap.put(licensePlate, owner);
        return true;
    }
    
    public String get(LicensePlate licensePlate) {
        return hashMap.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if (!(this.hashMap.containsKey(licensePlate)))
            return false;
        this.hashMap.remove(licensePlate);
        return true;
    }
    
    public void printLicensePlates() {
        for (Map.Entry<LicensePlate, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
    
    public void printOwners() {
        ArrayList<String> name = new ArrayList<>();
        
        for (Map.Entry<LicensePlate, String> entry : hashMap.entrySet()) {
            if (!(name.contains(entry.getValue()))) {
                name.add(entry.getValue());
                System.out.println(entry.getValue());
            }
        }
    }
}
