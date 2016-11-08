import java.util.Scanner;

public class lucky7s
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int num = kb.nextInt();
		
		System.out.println("The number of 7's in your number is " + luck(num));
	}
	public static int luck(int one)
	{
		if(one > 0)
		{	
			if(one % 10 == 7)
			{
				return 1 + luck(one/10);
			}
			else
			{
				return 0 + luck(one/10);
			}
		}
		return 0;
	}
}