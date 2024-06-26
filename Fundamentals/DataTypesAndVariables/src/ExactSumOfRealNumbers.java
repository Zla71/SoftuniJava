import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        BigDecimal result = new BigDecimal(0);

        for (int i = 0; i < n; i++) {
            BigDecimal currentNum = new BigDecimal(scanner.nextLine());
            result = result.add(currentNum);
        }
        System.out.println(result);
    }
}
