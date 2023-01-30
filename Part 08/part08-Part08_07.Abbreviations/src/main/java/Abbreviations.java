
import java.util.HashMap;


public class Abbreviations {
    HashMap<String, String> abbHashMap;

    public Abbreviations() {
        this.abbHashMap = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        this.abbHashMap.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        return this.abbHashMap.containsKey(abbreviation);
    }
    
    public String findExplanationFor(String abbreviation) {
        if (this.hasAbbreviation(abbreviation)) {
            return this.abbHashMap.get(abbreviation);
        }    
        return null;
    }
}
