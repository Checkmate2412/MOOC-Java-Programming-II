
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> num = new ArrayList<>();
        
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {            
            String input = scanner.nextLine();          
            if (input.equals("end"))
                break;           
            num.add(input);
        }      
        double avg = num.stream()
                .mapToInt(n -> Integer.valueOf(n)).
                average().
                getAsDouble();        
        System.out.println(avg);
    }
}
