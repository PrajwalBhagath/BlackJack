/*
The card class keeps the data for the suit,
card type and the value of the card
@author Khaled Almansour 18021460
@author Prajwal Bhagath 18039504
 */
package blackjackagainstai;

public class Card {
	CardSuit suit;
	CardType type;
	int number;

	/*
	The constror for the card gets the input the
	card suit and number. It goes through an algorithm
	and determines the type of the card
	@param int number
	@param CardSuit suit
	 */
	public Card(int number, CardSuit suit) {
		this.suit = suit;
		
		if(number < 1 || number > 13) {
			number = 1;
			System.err.println("CardNumberOutOfBoundsException");
		}
		
		this.number = number;
		

		switch(this.number) {
		case 1:
			this.type = CardType.ACE;
			break;
		case 11:
			this.type = CardType.JACK;
			break;
		case 12:
			this.type = CardType.QUEEN;
			break;
		case 13:
			this.type = CardType.KING;
			break;
		default:
			this.type = CardType.NUMBER;
			break;
		}
	}

	/*
	The toString method of the Card class displays the
	suit and value of the card

	@return string
	 */
	public String toString() {
		String output = "[";
		output += this.suit + " ";
		if(type == CardType.NUMBER) {
			output += this.number;
		} else {
			output += this.type;
		}
		return output += "]";
	}
}
