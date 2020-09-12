/*
Player is an abstract class that lays
out the method prototypes and constructor
so when the human and AI classes extends

@author Khaled Almansour 18021460
@author Prajwal Bhagath 18039504
 */
package blackjackagainstai;

import java.util.ArrayList;

public abstract class Player {
	String name;			//Name of the player
	int points;				//Points each player
	ArrayList<Card> hand;	//The hand

	/*
	Constructor for the Player object
	this constructor is used for the
	AI object
	 */
	public Player() {
		name = "New Player";
		points = 0;
		hand = new ArrayList<Card>();
	}

	/*
	Second Constructor for the player object
	this constructor is used for the human name
	the constructor sets the Players name

	@param String name
	 */
	public Player(String name) {
		this.name = name;
		points = 0;
		hand = new ArrayList<Card>();
	}
	/*
	next turn alllows only one player to play at the time
	@returns boolean
	 */
	public boolean nextTurn() { //boolean --> if true, draw a new card;
		throw new UnsupportedOperationException();
	}
	/*
	Asks the player if they want to
	take the Ace value as 1 or 11

	@returns int
	 */
	
	public int askAceValue() {
		throw new UnsupportedOperationException();
	}
}
