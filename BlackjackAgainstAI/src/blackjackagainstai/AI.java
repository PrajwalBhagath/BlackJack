/*
AI class extends the player abstract class
this class Overrides the next turn method
and AskAce value. These methods will allow the
Computer to make its own decisions with the
cards dealt to it

@author Khaled Almansour 18021460
@author Prajwal Bhagath 18039504
 */
package blackjackagainstai;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AI extends Player{
	/*
	constructor for the AI object allocating the
	AI's name
	 */
	public AI() {
		super();
		this.name = "AI";
	}

	/*
	@overrides nextTurn. this determines the decision that the player makes.
	this method uses an algorithm to allow the computer to
	choose what to do in the next round
	 */
	@Override
	public boolean nextTurn() {
		boolean drawCard = false;
		int handSum = 0;
		
		for(Card c: this.hand) {
			handSum += c.number;
		}
		
		if(handSum < 16) {
			System.out.println("AI decided to hit.");
			Card newCard = Mechanics.drawCard(this.hand);
			System.out.println("AI just drew " + newCard.toString());
			if(newCard.type == CardType.ACE) {
				newCard.number = this.askAceValue();
			}
		} else {
			System.out.println("AI decided to stand.");
		}

		return drawCard;
	}
	/*
	in the game of blackjack the value of the ace card can be chosen with
	convenience to the player. the player can choose whether the value of
	the ace card should be considered as 1 or 11.This algorithm chooses
	what value will act best in the cards drawn by the AI
	 */
	@Override
	public int askAceValue() {
		int value = 1;
		
		int handSum = 0;
		
		for(Card c: this.hand) {
			handSum += c.number;
		}
		
		if(handSum <= 11) {
			value = 11;
		}
		
		return value;
	}
}
