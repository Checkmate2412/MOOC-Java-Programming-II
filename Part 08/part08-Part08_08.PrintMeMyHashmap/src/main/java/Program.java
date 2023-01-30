
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
    }
    
    public static void printKeys(HashMap<String, String> hashMap) {
        for (String string : hashMap.keySet()) {
            System.out.println(string);
        }
    }
    
    public static void printKeysWhere(HashMap<String, String> hashMap, String text) {
        for (String string : hashMap.keySet()) {
            if (string.contains(text))
                System.out.println(string);
        }
    }
    
    public static void printValuesOfKeysWhere(HashMap<String, String> hashMap, String text) {
        for (String string : hashMap.keySet()) {
            if (string.contains(text))
                System.out.println(hashMap.get(string));
        }
    }
}
