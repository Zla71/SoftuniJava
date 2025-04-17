import java.util.*;

public class _05_AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> students = new TreeMap<>();

        fillMap(students, n, scanner);

        printMap(students);
    }

    private static void printMap(Map<String, List<Double>> students) {
        for (Map.Entry<String, List<Double>> entry : students.entrySet()) {

            String name = entry.getKey();
            double averageGrade = calculateAverageGrade(entry.getValue());

            System.out.printf("%s -> ", name);
//            for (Double currentGrade : entry.getValue()) {
//                System.out.printf("%.2f ", currentGrade);
//            }
            // итерирам през списъка и за всяка итерация давам определен формат на принта
            entry.getValue().forEach(currentGrade -> System.out.printf("%.2f ", currentGrade));
            System.out.printf("(avg: %.2f)", averageGrade);

            System.out.println();
        }
    }

    private static double calculateAverageGrade(List<Double> list) {
        double sum = 0;
        for (Double currentGrade : list) {
            sum += currentGrade;
        }
        return sum / list.size();
    }

    private static void fillMap(Map<String, List<Double>> students, int n, Scanner scanner) {
        for (int i = 0; i < n; i++) {
            String[] info = scanner.nextLine().split("\\s+");
            String name = info[0];
            double grade = Double.parseDouble(info[1]);

            // ако няма ключ с това име в мапа създай ключа с празен списък
            // ако вече има такъв ключ в мапа пропусни създаването на празен списък и премини напред
            students.putIfAbsent(name, new ArrayList<>());
            // попълни вече създадения списък
            students.get(name).add(grade);
        }
    }
}
