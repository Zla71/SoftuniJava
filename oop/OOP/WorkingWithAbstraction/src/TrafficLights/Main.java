package TrafficLights;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Light[] lights = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(light -> Light.valueOf(light))
                .toArray(Light[]::new);

        int numberOfUpdates = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfUpdates; i++) {
            // обновявам светлините
            updateLights(lights);
            // принтирам светлините
            printLights(lights);

        }
    }

    private static void printLights(Light[] lights) {
        for (Light light : lights) {
            System.out.print(light + " ");
        }
        System.out.println();
    }

    private static void updateLights(Light[] lights) {
        for (int index = 0; index < lights.length; index++) {
            switch (lights[index]) {
                case RED:
                    lights[index] = Light.GREEN;
                    break;
                case GREEN:
                    lights[index] = Light.YELLOW;
                    break;
                case YELLOW:
                    lights[index] = Light.RED;
                    break;
            }
        }
    }
}
