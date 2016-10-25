import java.util.Scanner;

public class graphTable
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter an integer:");
		int num = kb.nextInt();
		
		System.out.println("Please enter number of rows in table:");
		int rows = kb.nextInt();
		
		for(int i = 1; i <= rows; i++)
		{
			format(i, num*=i);
		}
	}
	
	public static void format(int one, int two)
	{
		System.out.printf("%10d | %10d\n", one, two);
	}
	
}