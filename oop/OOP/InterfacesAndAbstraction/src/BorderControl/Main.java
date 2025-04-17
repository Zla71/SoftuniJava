package BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Identifiable> list = new ArrayList<>();

        while (true) {
            String command = scanner.nextLine();

            if (command.equals("End")) {
                break;
            }

            String[] commandArr = command.split("\\s+");

            if (commandArr.length == 2) {
                String model = commandArr[0];
                String id = commandArr[1];
                Robot robot = new Robot(id, model);
                list.add(robot);

            } else {
                String name = commandArr[0];
                int age = Integer.parseInt(commandArr[1]);
                String id = commandArr[2];
                Citizen citizen = new Citizen(name, age, id);
                list.add(citizen);
            }
        }

        String fakeIdEnd = scanner.nextLine();

        list.forEach(individual -> {if (individual.getId().endsWith(fakeIdEnd)) {
                System.out.println(individual.getId());
            }
        });
    }
}
