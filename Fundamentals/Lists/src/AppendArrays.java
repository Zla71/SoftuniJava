import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> initialList = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());
        List<String> output = new ArrayList<>();

        for (int i = initialList.size() - 1; i >= 0; i--) {
            String[] numbers = initialList.get(i).split("\\s+");

            for (int j = 0; j < numbers.length; j++) {
                if (!numbers[j].equals("")) {
                    output.add(numbers[j]);
                }
            }
        }

        String print = output.toString().trim();
        System.out.println(print.replaceAll("\\[|,|\\]", ""));
    }
}
