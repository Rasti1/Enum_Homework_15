package app.view;

import app.enums.TrafficLight;

public class AppView {
    public static String getResult(TrafficLight light){
        if (light == TrafficLight.RED){
            return "\nStop! Red traffic's light signal!";
        } else if (light == TrafficLight.YELLOW){
            return "\nGet ready!";
        } else if (light == TrafficLight.GREEN){
            return "\nKeep moving!";
        } else {
            return "\nWrong color!";
        }
    }
    public static void getOutput (String output){
        System.out.println(output);
    }
}

