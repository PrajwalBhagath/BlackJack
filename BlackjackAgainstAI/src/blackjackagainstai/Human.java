/*
The Human class extends the player Abstract class.
The class Overrides nextTurn method and the askAce Value method

@author Khaled Almansour 18021460
@author Prajwal Bhagath 18039504
 */
package blackjackagainstai;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Human extends Player {
	
	public Human() {
		super();
	}
	/*
	Constructor for the human user
	@param String name
	 */
	public Human(String name) {
		super(name);
	}
	/*
	@overrides nextTurn. this determines the decision that the player makes.
	this method gives the player to choose if they want to hit or stand
	 */
	@Override
	public boolean nextTurn() {
		boolean drawCard = false;

		System.out.println(this.name + ", enter [1] to hit, [2] to stand.");
		Scanner scanner = new Scanner(System.in);
		boolean exitInput = false;

		do {
			try {
				int input = scanner.nextInt();
				if (input < 1 || input > 2) {
					throw new InputMismatchException();
				} else if (input == 1) {
					exitInput = true;
					drawCard = true;
					Card newCard = Mechanics.drawCard(this.hand);
					System.out.println(this.name + " just drew " + newCard.toString());
					if(newCard.type == CardType.ACE) {
						newCard.number = this.askAceValue();
					}
				} else if (input == 2) {
					exitInput = true;
				}
			} catch (InputMismatchException e) {
				System.out.println("Sorry, input incorrect. Try again!");
				scanner.nextLine();
			}
		} while (!exitInput);
		
		return drawCard;
	}
	/*
in the game of blackjack the value of the ace card can be chosen with
convenience to the player. the player can choose whether the value of
the ace card should be considered as 1 or 11.This allows the players to
choose which value they want to decide
 */
	@Override
	public int askAceValue() {
		int value = 1;

		System.out.println(this.name + ", enter [1] to make the Ace value 1, [2] to make it 11");
		Scanner scanner = new Scanner(System.in);
		boolean exitInput = false;

		do {
			try {
				int input = scanner.nextInt();
				if (input < 1 || input > 2) {
					throw new InputMismatchException();
				} else if (input == 1) {
					exitInput = true;
					value = 1;
				} else if (input == 2) {
					exitInput = true;
					value = 11;
				}
			} catch (InputMismatchException e) {
				System.out.println("Sorry, input incorrect. Try again!");
				scanner.nextLine();
			}
		} while (!exitInput);
		
		return value;
	}
}
