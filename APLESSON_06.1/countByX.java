import java.util.Scanner;

public class countByX
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the number you would like to count up to:");
		int end = kb.nextInt();
		
		System.out.println("Please enter the number you would like to count by:");
		int x = kb.nextInt();
		
		for(int i = 0; i < end;)
		{
			format(i+=x);
		}
	}
	public static void format(int one)
	{
		System.out.printf("%d\t", one);
	}
}