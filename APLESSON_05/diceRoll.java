import java.util.Random;

public class diceRoll
{
	public static void main(String[]args)
	{
		Random rand = new Random();
		int player = rand.nextInt(6)+1;
		int comp = rand.nextInt(6)+1;
		
		String winner = rollDice(player,comp);
		
		System.out.println("You rolled a " + player + "\nComputer rolled a " + comp + "\nThe winner is... " + winner);
	}
	public static String rollDice(int player, int comp)
	{
		String winner = "";
		if(player > comp)
		{
			winner = "You";
		}
		if(player < comp)
		{
			winner = "Computer";
		}
		return winner;
	}
}