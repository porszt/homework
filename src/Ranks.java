
public enum Ranks {
    ACE("Ace"), JACK("Jack"), QUEEN("Queen"), KING("King");

    private String rank;

    Ranks(String rank){
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }
}
