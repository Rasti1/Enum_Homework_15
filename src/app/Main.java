package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        getOutput(getResult(getData()));
    }

    private static TrafficLight getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input traffic's light color: ");
        return TrafficLight.valueOf(sc.nextLine().trim().toUpperCase());
    }
    private static String getResult(TrafficLight light){
        if (light == TrafficLight.RED){
            return "Stop! Red traffic's light signal!";
        } else if (light == TrafficLight.YELLOW){
            return "Get ready!";
        } else if (light == TrafficLight.GREEN){
            return "Keep moving!";
        } else {
            return "Wrong color!";
        }
    }
    private static void getOutput (String output){
        System.out.println(output);
    }
}
