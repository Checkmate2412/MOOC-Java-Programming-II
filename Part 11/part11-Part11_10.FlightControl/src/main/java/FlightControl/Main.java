package FlightControl;

import FlightControl.ui.UserInterface;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserInterface ui = new UserInterface(scanner);
        ui.startUI();
    }
}
