package Cards;

public class CardTester {

    public static void main(String[] args) {

        Card card1 = new Card(Suits.DIAMONDS, Ranks.KING);
        Card card2 = new Card(Suits.SPADES, Ranks.ACE);

        System.out.println(card1);
        System.out.println(card2);
    }
}
