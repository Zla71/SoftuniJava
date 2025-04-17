package CardsWithPower;

public class Card {

    // силата на картата е равна на силата на картата + силата на ранка
    private int power;

    public Card(CardSuit cardSuit, CardRank cardRank) {
        this.power = cardRank.getPower() + cardSuit.getPower();
    }

    public int getPower() {
        return power;
    }
}
