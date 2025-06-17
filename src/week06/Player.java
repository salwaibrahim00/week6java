package week06;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private List<Card> hand = new ArrayList<>();
    private int score = 0;
    private String name;

    // Constructor
    public Player(String name) {
        this.name = name;
    }

    // Describe player and their hand
    public void describe() {
        System.out.println("Player: " + name);
        for (Card card : hand) {
            System.out.println(card.getName() + " (value: " + card.getValue() + ")");
        }
    }
    
        //draw (takes a Deck as an argument and calls the draw method on
    //the deck, adding the returned Card to the hand field)
    
    
    public void draw(Deck deck) {
    	hand.add(deck.draw());
    }
   public  Card flip() {
	   return hand.remove(0);
   }
	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void incrementScore() {
	    score++;
	}
}