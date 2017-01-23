import java.util.Scanner;

public class UserClassRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter first name:");
		String first = kb.next();
		System.out.println("Enter last name:");
		String last = kb.next();
		
		TheUserClass user1;
		
		System.out.println("Do you want a public avatar?\nEnter y or n.");
		String yOrN = kb.next();
		if(yOrN.equals("n"))
		{	
			user1 = new TheUserClass(first, last);
			System.out.println(user1);
		}	
		if(yOrN.equals("y"))
		{
			System.out.println("Enter avatar:");
			String av = kb.next();
			user1 = new TheUserClass(first, last, av);
			System.out.println(user1);
		}
	}
	
}