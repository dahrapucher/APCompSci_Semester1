import java.util.Scanner;

public class factorial
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an integer:");
		int num = kb.nextInt();
	
		for(int fact = 1; fact <= num; num*=fact)
		{
			System.out.println(fact);
			fact++;
		}
	}
}