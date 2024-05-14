import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;
        String symbol = "%";

        for (int i = 0; i < n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            if (currentNumber < 200) {
                p1 += 1;
            } else if (currentNumber <= 399) {
                p2 += 1;
            } else if (currentNumber <= 599) {
                p3 += 1;
            } else if (currentNumber <= 799) {
                p4 += 1;
            } else {
                p5 += 1;
            }
        }
        double p1Result = ((double) p1 / n) * 100;
        double p2Result = ((double) p2 / n) * 100;
        double p3Result = ((double) p3 / n) * 100;
        double p4Result = ((double) p4 / n) * 100;
        double p5Result = ((double) p5 / n) * 100;
        System.out.printf("%.2f%s%n%.2f%s%n%.2f%s%n%.2f%s%n%.2f%s%n", p1Result, symbol, p2Result, symbol, p3Result,
                symbol, p4Result, symbol, p5Result, symbol);
    }
}
