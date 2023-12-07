package app.tools;

import app.enums.TrafficLight;

public class Scanner {
    public static TrafficLight getData() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Input traffic's light color: ");
        return TrafficLight.valueOf(sc.nextLine().trim().toUpperCase());
    }

}
