import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int dogFood = Integer.parseInt(scanner.nextLine());
        int catFood = Integer.parseInt(scanner.nextLine());


        int resultCatFood = catFood * 4;
        double resultDogFood = dogFood * 2.5;

        double finalResult = resultDogFood + resultCatFood;

        System.out.printf("%.1f lv",finalResult);
    }
}
