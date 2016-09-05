import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class CardTest {

    @Test
    public void creatingCard(){
        Card card = new Card(Suits.SPADES, Ranks.ACE);
        assertThat (card.toString(), containsString("Ace-Spades"));
    }
}
