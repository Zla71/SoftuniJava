import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int tabsCount = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
        boolean hasMoney = true;

        for (int i = 0; i < tabsCount; i++) {
            String website = scanner.nextLine();
            switch (website) {
                case "Facebook":
                    salary -= 150;
                    break;
                case "Instagram":
                    salary -= 100;
                    break;
                case "Reddit":
                    salary -= 50;
                    break;
            }

            if (salary <= 0) {
                hasMoney = false;
                break;
            }
        }
        if (hasMoney) {
            System.out.println(salary);
        }
        else {
            System.out.println("You have lost your salary.");
        }
    }
}
