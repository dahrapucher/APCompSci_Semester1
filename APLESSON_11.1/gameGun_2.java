import java.util.Scanner;

public class gameGun_2
{
	static String[]health;
	static int healthLoad = 6;
	static int healthCount;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String turn = "";
		int damage = 0;
		int amount = 0;
		healthCount = 6;
		health = new String[healthLoad];
		
		while(turn != "Q" && healthCount > 0)
		{
			System.out.println("Your turn! Hit Enter when ready:");
			turn = kb.nextLine();
			damage = (int)(Math.random()*2) + 1;
			amount = (int)(Math.random()*6) + 1;
			System.out.println(takeDamage(damage, amount));
			printClip();
		}
		System.out.println("You died!!");
	}
	
	public static String takeDamage(int damage, int amount)
	{
		if(damage == 1)
		{
			healthCount -= amount;
			return "Taking " + amount + " damage!";
		}
		else
		{
			if(healthCount + amount < healthLoad)
			{
				healthCount += amount;
			}
			else
			{
				healthCount = healthLoad;
			}
			return "Power up " + amount + "!";
		}
	}
	
	public static void printClip()
	{
		String output = "Health:\t";
		for(int i = 0; i < healthLoad; i++)
		{
			if(i < healthCount)
			{
				health[i] = "@";
			}
			else
			{
				health[i] = "[]";
			}
			output += health[i];
		}
		System.out.println(output);
	}
}