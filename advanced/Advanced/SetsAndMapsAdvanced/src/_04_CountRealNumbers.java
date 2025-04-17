import java.util.*;

public class _04_CountRealNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] numbersArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();
        Map<Double, Integer> numbersMap = new LinkedHashMap<>();

        for (Double number : numbersArr) {
            if (!numbersMap.containsKey(number)) {
                numbersMap.put(number, 1);
            } else {
                numbersMap.put(number, numbersMap.get(number) + 1);
            }
        }
        for (Map.Entry<Double, Integer> entry : numbersMap.entrySet()) {
            System.out.printf("%.1f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
