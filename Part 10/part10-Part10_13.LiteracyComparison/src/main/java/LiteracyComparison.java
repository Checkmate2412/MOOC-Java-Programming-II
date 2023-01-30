import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        ArrayList<Result> data = new ArrayList<>();
        
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(v -> v.split(","))
                    .map(v -> new Result(
                            v[2].replace(" (%)", "").trim(), v[3]
                            , Integer.valueOf(v[4]), Double.valueOf(v[5])))
                    .forEach(v -> data.add(v));        
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        data.stream().sorted((a, b) -> {
            if (a.getLiteracyPercent() > b.getLiteracyPercent()) {
                return 1;
            }
            if (a.getLiteracyPercent() < b.getLiteracyPercent()) {
                return -1;
            }    
            return 0;
        }).forEach(v -> System.out.println(v));
    } 
}
