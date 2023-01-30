
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>(); 
        
        while (true) {            
            int num = Integer.valueOf(scanner.nextLine());            
            if (num == 0) {
                break;         
            }
            
            if (num > 0) {
                numList.add(num);
            }
        }
        
        if (numList.isEmpty()) {
            System.out.println("Cannot calculate the average");
        } else {
            int item = 0, sum = 0;
            for (Integer integer : numList) {
                sum += integer;
                item++;
            }
            System.out.println((double)sum / item);
        }
    }
}
