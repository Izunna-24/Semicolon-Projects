package nigeriaGeopoliticalZones;

import nigeriaGeopoliticalZones.Nigeria;

import java.util.Scanner;

public class NigeriaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter State: ");
        String state = scanner.nextLine();

        System.out.println (Nigeria.knowYourZone(state));

    }
}
