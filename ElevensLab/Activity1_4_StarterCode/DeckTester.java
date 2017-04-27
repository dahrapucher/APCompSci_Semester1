/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String [] ranks1 = {"10", "4", "Ace"};
		String [] suits1 = {"Hearts", "Spades", "Clubs"};
		int [] values1 = {10,4,11};
		Deck one = new Deck(ranks1, suits1, values1);
		System.out.println("Deck one size should be 3 and is: " + one.size());
		
		String [] ranks2 = {"Queen", "Jack", "2", "5"};
		String [] suits2 = {"Hearts", "Spades", "Clubs", "Clubs"};
		int [] values2 = {10,10,2,5};
		Deck two = new Deck(ranks2, suits2, values2);
		if(two.isEmpty() == true)
		{
			System.out.println("Deck two should not be empty and is not empty.");
		}
		else
			System.out.println("Deck two should not be empty but is empty.");
		
		String [] ranks3 = {"2", "6", "4", "King"};
		String [] suits3 = {"Hearts", "Spades", "Clubs", "Spades"};
		int [] values3 = {2,6,4,10};
		Deck three = new Deck(ranks3, suits3, values3);
		System.out.println("The dealt card is " + three.deal());
	}
}
