package CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // rank
        CardRank rank = CardRank.valueOf(scanner.nextLine());
        // card suit
        CardSuit suit = CardSuit.valueOf(scanner.nextLine());

        Card card = new Card(suit, rank);

        System.out.printf("Card name: %s of %s; Card power: %d", rank, suit, card.getPower());

    }
}
