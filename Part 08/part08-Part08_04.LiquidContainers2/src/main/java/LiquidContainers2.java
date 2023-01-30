
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container contain1 = new Container(), contain2 = new Container();

        while (true) {
            System.out.print("First: " + contain1.toString() + 
                    "\nSecond: " + contain2.toString());
            String input = scan.nextLine();
            if (input.equals("quit")) 
                break;

            String[] splitStrings = input.split(" ");
            String cmd = splitStrings[0];
            int amount = Integer.valueOf(splitStrings[1]);
            
            if (cmd.equals("add"))
                contain1.add(amount);
            else if (cmd.equals("move")) {
                if (amount >= 0 && contain1.contains() != 0) {
                    if (contain1.contains() < amount)
                        amount = contain1.contains();

                    contain1.remove(amount);
                    contain2.add(amount);
                }
            } else if (cmd.equals("remove"))
                contain2.remove(amount);
            
            System.out.println("");
        }
    }

}
