
public enum Suits {
    CLUBS("Clubs"), DIAMONDS("Diamonds"), HEARTS("Hearts"), SPADES("Spades");

    private String suit;

    Suits(String suit){
        this.suit = suit;
    }

    public String getSuit() {
        return suit;
    }
}
