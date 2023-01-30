
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Containers contain1 = new Containers(), contain2 = new Containers();
        while (true) {
            System.out.println("First: " + contain1.getAmount() + "/100" +
                    "\nSecond: " + contain2.getAmount() + "/100" );

            String input = scan.nextLine();
            if (input.equals("quit")) 
                break;
            
            String[] splitStrings = input.split(" ");
            String cmd = splitStrings[0];
            int amount = Integer.valueOf(splitStrings[1]);
            
            if (cmd.equals("add"))
                contain1.add(amount);
            else if (cmd.equals("move"))
                contain1.move(contain2, amount);
            else if (cmd.equals("remove"))
                contain2.remove(amount);
            
            System.out.println("");
        }
    }

}
