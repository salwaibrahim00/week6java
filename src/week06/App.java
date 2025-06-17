package week06;

public class App {

    public static void main(String[] args) {

        // 1. Create the deck and shuffle it
        Deck deck = new Deck();
        deck.shuffle();

        // 2. Create two players
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        // 3. Deal all 52 cards (26 each)
        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                player1.draw(deck);
            } else {
                player2.draw(deck);
            }
        }

        // 4. Play 26 rounds
       for (int i=0;i <26;i++) {
    	   Card card1=player1.flip();
    	   Card card2=player2.flip();

            System.out.println("Round " + (i + 1) + ":");
            System.out.println(player1.getName() + " plays " + card1.getName());
            System.out.println(player2.getName() + " plays " + card2.getName());

            if (card1.getValue() > card2.getValue()) {
                player1.incrementScore();
                System.out.println(player1.getName() + " wins the round!\n");
            } else if (card2.getValue() > card1.getValue()) {
                player2.incrementScore();
                System.out.println(player2.getName() + " wins the round!\n");
            } else {
                System.out.println("It's a tie! No points awarded.\n");
            }
        }

        // 5. Display final scores and winner
        System.out.println("Final Scores:");
        System.out.println(player1.getName() + ": " + player1.getScore());
        System.out.println(player2.getName() + ": " + player2.getScore());

        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " wins the game!");
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println(player2.getName() + " wins the game!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}

