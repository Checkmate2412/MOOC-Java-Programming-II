
public class Program {

    public static void main(String[] args) {
        List<Object> myList = new List<>();
        System.out.println(myList.contains(true));
        myList.add(1);
        myList.add("hello");
        myList.add(true);
        System.out.println(myList.contains(1));
        System.out.println(myList.contains("hello"));
        System.out.println(myList.contains(true));
        myList.remove(true);
        System.out.println(myList.contains(1));
        System.out.println(myList.contains("hello"));
        System.out.println(myList.contains(true));
    }

}
