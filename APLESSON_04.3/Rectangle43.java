import java.util.Scanner;

public class Rectangle43
{
	public static void main(String[]args)
	{
		//instantiate Scanner object
		Scanner kb = new Scanner(System.in);
		
		//user input
		System.out.println("Please enter your length: ");
		int l = kb.nextInt();
		System.out.println("Please enter your width: ");
		int w = kb.nextInt();
		
		print(calcPerim(l, w));
	}
	public static int calcPerim(int l, int w)
	{
		return 2*(l+w);
		
	}
	public static void print(int perimeter)
	{
		System.out.println("The perimeter of your rectangle is " + perimeter);
	}
}