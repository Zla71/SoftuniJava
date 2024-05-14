import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String article = scanner.nextLine();

        if (article.equals("banana") || article.equals("apple") || article.equals("kiwi") ||
                article.equals("cherry") || article.equals("lemon") || article.equals("grapes")) {
            System.out.println("fruit");
        }
        else if (article.equals("tomato") || article.equals("cucumber") || article.equals("pepper") ||
                article.equals("carrot")) {
            System.out.println("vegetable");
        }
        else {
            System.out.println("unknown");
        }
    }
}
