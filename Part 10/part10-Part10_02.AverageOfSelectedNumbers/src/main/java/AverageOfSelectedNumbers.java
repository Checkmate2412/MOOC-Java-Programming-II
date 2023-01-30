
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> num = new ArrayList<>();        
        
        while (true) {            
            String input = scanner.nextLine();
            
            if (input.equals("end"))
                break;           
            num.add(input);
        }       
        System.out.println("Print the average of the negative "
                + "numbers or the positive numbers? (n/p)");  
        String ans = scanner.nextLine();

        if (ans.equals("n") && !num.isEmpty()) {
            System.out.println("Average of the negative numbers: " + 
                    num.stream().mapToInt(n -> Integer.valueOf(n))
                            .filter(n -> n < 0)
                            .average()
                            .getAsDouble());
        } else if (ans.equals("p") && !num.isEmpty()) {
            System.out.println("Average of the positive numbers: " + 
                    num.stream().mapToInt(n -> Integer.valueOf(n))
                            .filter(n -> n > 0)
                            .average()
                            .getAsDouble());
        }
    }
}
