import java.util.*;

public class _06_FixEmails {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, String > emailsMap = new LinkedHashMap<>();

        while (true) {
            String name = scanner.nextLine();

            if (name.equals("stop")) {
                break;
            }

            String email = scanner.nextLine();
            String[] emailSplit = email.split("\\.");
            String end = emailSplit[emailSplit.length - 1];

            List<String> forbidden = Arrays.asList("com", "uk", "us");
            if (!forbidden.contains(end)) {
                emailsMap.put(name, email);
            }
        }

        for (Map.Entry<String, String> entry : emailsMap.entrySet()) {
            System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());
        }
    }
}
