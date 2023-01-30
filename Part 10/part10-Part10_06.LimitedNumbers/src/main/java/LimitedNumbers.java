
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();
        
        while (true) {            
            int input = scanner.nextInt();
            
            if (input == -1)
                break;
            
            num.add(input);
        }
        num.stream().filter(v -> (v >= 1 && v <= 5))
                .forEach(n -> System.out.println(n));
    }
}
