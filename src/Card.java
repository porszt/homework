
public class Card {

    private int rank;
    private int suit;

    private final int CLUBS = 1;
    private final int DIAMONDS = 2;
    private final int HEARTS = 3;
    private final int SPADES = 4;

    private final int ACE = 1;
    private final int JACK = 11;
    private final int QUEEN = 12;
    private final int KING = 13;


    public Card(int suit, int rank){
        if(!rankValid(rank) || !suitVaild(suit)){
            throw new IllegalArgumentException("invalid card");
        }
        this.rank = rank;
        this.suit = suit;
    }

    private boolean rankValid(int rank){
        return rank == ACE || rank >= JACK && rank <= KING;
    }

    private boolean suitVaild(int suit){
        return suit >= CLUBS && suit <= SPADES;
    }

    public int getRank() {
        return rank;
    }

    public int getSuit() {
        return suit;
    }

    @Override
    public String toString(){
        return rankConverter(this.rank) + "-" + suitConverter(this.suit);
    }

    public String rankConverter(int rank){
        String convertedRank = null;
        switch (rank){
            case 1: convertedRank = "Ace";
                break;
            case 11: convertedRank = "Jack";
                break;
            case 12: convertedRank = "Queen";
                break;
            case 13: convertedRank = "King";
                break;
        }
        return convertedRank;
    }

    public String suitConverter(int suit){
        String convertedSuit = null;
        switch (suit){
            case 1: convertedSuit = "Clubs";
                break;
            case 2: convertedSuit = "Diamonds";
                break;
            case 3: convertedSuit = "Hearts";
                break;
            case 4: convertedSuit = "Spades";
                break;
        }
        return convertedSuit;
    }
}

