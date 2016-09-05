
public class Card {

    private Ranks rank;
    private Suits suit;

    public Card(Suits suit, Ranks rank){
        this.rank = rank;
        this.suit = suit;
    }

    public Ranks getRank() {
        return rank;
    }

    public Suits getSuit() {
        return suit;
    }

    @Override
    public String toString(){
        return rank.getRank() + "-" + suit.getSuit();
    }
}

