package dictionary;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class SaveableDictionary {
    private HashMap<String, String> dictionary;
    private String file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }
    
    public SaveableDictionary(String file) {
        this.dictionary = new HashMap<>();
        this.file = file;
    }
    
    public void add(String words, String translation) {
        this.dictionary.putIfAbsent(words, translation);
    }
    
    public void delete(String word) {    
        for (Iterator<Map.Entry<String, String>> iterator = 
                this.dictionary.entrySet().iterator(); iterator.hasNext();) {
            Map.Entry<String, String> map = iterator.next();
            if (map.getKey().equals(word))
                iterator.remove();
            else if (map.getValue().equals(word))
                iterator.remove();  
        }
    }
    
    public String translate(String word) {
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            if (entry.getKey().equals(word))
                return entry.getValue();
            else if (entry.getValue().equals(word))
                return entry.getKey();
        }
        return null;
    }
    
    public boolean load() {
        try (Scanner scanfile = new Scanner(Paths.get(this.file))) {
            while (scanfile.hasNextLine()) {
                String line = scanfile.nextLine();
                String[] parts = line.split(":");
                this.add(parts[0], parts[1]);
            }     
            return true;
        } catch (Exception e) {
            System.out.println("File not found. " + e.getMessage());
            return false;
        }
    }
    
    public boolean save() {
        try (PrintWriter writer = new PrintWriter(this.file)){
            for (Map.Entry<String, String> entry : dictionary.entrySet())
                writer.println(entry.getKey() + ":" + entry.getValue());
            writer.close();
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
}
