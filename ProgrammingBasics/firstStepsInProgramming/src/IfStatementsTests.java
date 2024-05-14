public class IfStatementsTests {
    public static void main(String[] args) {
        int number = -1897;
        System.out.println("Информация дали числото е отрицателно или положително");
        // Проверка дали числото е положително, отрицателно или нула
        if (number > 0) {
            System.out.printf("Числото %d е положително%n", number);
        } else if (number < 0) {
            System.out.printf("Числото %d е отрицателно%n", number);
        } else {
            System.out.printf("Числото %d е нула%n", number);
        }
        System.out.println("Информация дали числото е четно или нечетно");
        // Проверка дали числото е четно или нечетно
        if (number % 2 == 0) {
            System.out.printf("Числото %d е четно", number);
        } else {
            System.out.printf("Числото %d е нечетно", number);
        }
    }
}
