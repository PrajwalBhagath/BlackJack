/*
The mechanics class Acts as the dealer in a real life blackjack game.
the class can create a deck, draw a card to the player, checks the
hands of the player and resets the deck once the game is finished

@author Khaled Almansour 18021460
@author Prajwal Bhagath 18039504
 */
package blackjackagainstai;

import java.util.ArrayList;
import java.util.Random;

public class Mechanics {
	static ArrayList<Card> deck;
	static Player player1;
	static Player player2;

	/*
	The create deck methods generates the all 52 cards in a deck
	one of each kind. all of the card objects are stored in an
	arraylist
	 */
	public static void createDeck() {
		deck = new ArrayList<Card>();
		CardSuit suit = CardSuit.CLUB;
		for(int i = 1; i < 14; i++) {
			deck.add(new Card(i, suit));
		}
		suit = CardSuit.DIAMOND;
		for(int i = 1; i < 14; i++) {
			deck.add(new Card(i, suit));
		}
		suit = CardSuit.HEART;
		for(int i = 1; i < 14; i++) {
			deck.add(new Card(i, suit));
		}
		suit = CardSuit.SPADE;
		for(int i = 1; i < 14; i++) {
			deck.add(new Card(i, suit));
		}
	}
	/*
	the draw card function returns a card object
	it chooses a single card form the array list
	it makes sure that the card does not get
	repeated.
	@returns Card
	 */
	public static Card drawCard(ArrayList<Card> hand) {
		Random random = new Random();
		Card card = deck.remove(random.nextInt(deck.size()));
		hand.add(card);
		return card;
	}

	/*
	CheckHands checks both AI and players
	hands and determines who is the winner of the game.
	the method returns an integer adding the two values
	of the card together

	@returns int
	 */
	public static int checkHands() {
		int P1Sum = 0;
		int P2Sum = 0;
		int result = 0;
		
		for(Card c: player1.hand) {
			P1Sum += c.number;
		}
		
		for(Card c: player2.hand) {
			P2Sum += c.number;
		}
		
		if(P1Sum > 21) {
			result = 1;
		} else if (P2Sum > 21) {
			result = 2;
		} else if (P1Sum == 21) {
			result = 3;
		} else if (P2Sum == 21) {
			result = 4;
		}
		
		return result;
	}

	/*
	Reset Hand method takes the cards delt in previous games
	and insets it back into the dect to be reused in future
	game
	 */

	public static void resetHands() {
		for(int i = player1.hand.size() - 1; i >= 0; i--) {
			deck.add(player1.hand.remove(0));
		}
		for(int i = player2.hand.size() - 1; i >= 0; i--) {
			deck.add(player2.hand.remove(0));
		}
	}
	
}
