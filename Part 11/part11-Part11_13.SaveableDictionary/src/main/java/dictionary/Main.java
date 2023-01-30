package dictionary;

public class Main {
    public static void main(String[] args) {
        SaveableDictionary s = new SaveableDictionary("word.txt");
        s.load();
        s.add("ohjelmointi", "programming");
        s.delete("olut");
    }
}
