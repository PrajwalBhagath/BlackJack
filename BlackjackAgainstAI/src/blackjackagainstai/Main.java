/*
The main Class contains the main Method
which is basically what the users interact
with. the main method calls all od the
other classes and proceeds through the game

@author Khaled Almansour 18021460
@author Prajwal Bhagath 18039504
 */
package blackjackagainstai;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	/*
	The main method determines all the
	actions performed by the user and
	all of the instruction for the users
	to follow
	 */

	public static void main(String[] args) {
		Mechanics.createDeck();
		
//		for(Card c: Mechanics.deck) {
//			System.out.println(c.toString());
//		}
		
		Scanner scanner = new Scanner(System.in);
		boolean exitGame = false;
		boolean exitInput = false;

		Title title = new Title();
		title.welcomeTitle();
		
//		System.out.println("Hello, welcome to BlackJack.");
//		System.out.println("Enter [1] to play, [2] to exit.");
		
//		do {
//			try {
				int input = title.intro();
				if (input < 1 || input > 2) {
					throw new InputMismatchException();
				} else if (input == 1) {
//					exitInput = true;
				} else if (input == 2) {
//					exitInput = true;
					exitGame = true;
				}
//			} catch (InputMismatchException e) {
//				System.out.println("Sorry, input incorrect. Try again!");
//				scanner.nextLine();
//			}
//		} while (!exitInput);


		if(!exitGame) {
			title.LetsPlay();
		} else {
			System.out.println("Bye!");
			System.exit(0);
		}

		String playerName = scanner.nextLine();
//		System.out.println("Please enter your name.");


		Mechanics.player1 = new Human(playerName);
		Mechanics.player2 = new AI();
		
		System.out.println("Welcome to BlackJack against AI.");
		boolean replay = false;

		do {
			boolean playerOneTurn = true;
			int checkHands = 0; //[0 = no one over 21][1 = playerOne over 21][2 = playerTwo over 21]
			//[3 = playerOne at 21][4 = playerTwo at 21]
			boolean unlucky = false;

			Card newCard = Mechanics.drawCard(Mechanics.player1.hand);
			System.out.println(Mechanics.player1.name + " just drew " +title.PlayerCard(newCard.number)+ newCard.toString());
			if (newCard.type == CardType.ACE) {
				newCard.number = Mechanics.player1.askAceValue();
			}

			newCard = Mechanics.drawCard(Mechanics.player1.hand);
			System.out.println(Mechanics.player1.name + " just drew "+title.PlayerCard(newCard.number) + newCard.toString());
			if (newCard.type == CardType.ACE) {
				newCard.number = Mechanics.player1.askAceValue();
			}

			newCard = Mechanics.drawCard(Mechanics.player2.hand);
			System.out.println(Mechanics.player2.name + " just drew " + title.AICards());
			if (newCard.type == CardType.ACE) {
				newCard.number = Mechanics.player2.askAceValue();
			}

			newCard = Mechanics.drawCard(Mechanics.player2.hand);
			System.out.println(Mechanics.player2.name + " just drew " + title.AICards());
			if (newCard.type == CardType.ACE) {
				newCard.number = Mechanics.player2.askAceValue();
			}

			checkHands = Mechanics.checkHands();
			if (checkHands != 0) {
				unlucky = true;
			}

			while (checkHands == 0) {

				System.out.println("");
				System.out.println(Mechanics.player1.name + "'s hand:");
				for (Card c : Mechanics.player1.hand) {
					System.out.print(c.toString());
				}
				System.out.println("");

				System.out.println(Mechanics.player2.name + " hand:");
				for (Card c : Mechanics.player2.hand) {
					System.out.print("[?]");
				}
				System.out.println("\n");

				if (playerOneTurn) {
					Mechanics.player1.nextTurn();
				} else if (!playerOneTurn) {
					Mechanics.player2.nextTurn();
				}

				checkHands = Mechanics.checkHands();

				playerOneTurn = !playerOneTurn;
			}

			if (unlucky) {
				System.out.println("Unlucky! A player drew a losing hand in the first round!");
			}

			if (checkHands == 1 || checkHands == 4) {
				System.out.println(Mechanics.player2.name + "'s WINNING hand:");
				for (Card c : Mechanics.player2.hand) {
					System.out.print(c.toString());
				}
				System.out.println("\n");
				System.out.println("");
				System.out.println(Mechanics.player1.name + "'s LOSING hand:");
				for (Card c : Mechanics.player1.hand) {
					System.out.print(c.toString());
				}
				Mechanics.player1.points++;
				System.out.println("\n");
			} else if (checkHands == 2 || checkHands == 3) {
				System.out.println(Mechanics.player1.name + "'s WINNING hand:");
				for (Card c : Mechanics.player1.hand) {
					System.out.print(c.toString());
				}
				System.out.println("\n");
				System.out.println("");
				System.out.println(Mechanics.player2.name + "'s LOSING hand:");
				for (Card c : Mechanics.player2.hand) {
					System.out.print(c.toString());
				}
				System.out.println("\n");
				Mechanics.player2.points++;
			}


			System.out.println("Would You Like to play again?");
			System.out.println("Press [1] for yes, Press [2] for No");
			boolean choice = false;

			do {
				try {
					int decision = scanner.nextInt();
					if (decision < 1 || decision > 2) {
						throw new InputMismatchException();
					} else if (decision == 1) {
						replay = true;
						choice = false;
						Mechanics.resetHands();
					}else if (decision == 2) {
						replay = false;
						choice = false;
					}
				} catch (InputMismatchException e) {
					System.out.println("Sorry, input incorrect. Try again!");
					scanner.nextLine();
					choice = true;
				}
			} while (choice);
		}while (replay);

		
		title.GameEnded();

		System.out.println(playerName+" ["+Mechanics.player2.points+"]");
		System.out.println("AI ["+Mechanics.player1.points+"]");
		scanner.close();
	}
}
