package app;

import app.enums.TrafficLight;
import app.tools.Scanner;
import static app.view.AppView.getOutput;
import static app.view.AppView.getResult;

public class Main {

    public static void main(String[] args) {
        try {
            TrafficLight light = Scanner.getData();
            String result = getResult(light);
            getOutput(result);
        } catch (Exception e){
            getOutput("\nIncorrect color. Try again.");
        }
    }
}

