package week06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> cards = new ArrayList<>(); // ✅ Fixed typo: ArryList → ArrayList

    // ✅ Constructor
    public Deck() {
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        String[] ranks = { "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
                           "Nine", "Ten", "Jack", "Queen", "King", "Ace" };

        for (int i = 0; i < ranks.length; i++) {
            for (String suit : suits) {
                int value = i + 2; // "Two" starts at 2, "Ace" ends at 14
                String name = ranks[i] + " of " + suit; // ✅ Added space after "of"
                cards.add(new Card(value, name)); // ✅ Creates a new Card and adds it to the deck
            }
        }
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card draw() {
        return cards.remove(0);
    }
}
