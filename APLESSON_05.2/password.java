import java.util.Scanner;

public class password
{
	static Scanner kb;
	static String rightName;
	static String rightPW;
	
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		
		rightName = "username";
		rightPW = "Password";
		
		passCheck();
	}
	public static void passCheck()
	{
		System.out.println("Please enter your username:");
		String username = kb.next();
		System.out.println("Please enter your password:");
		String password = kb.next();
		
		if(rightName.equals(username) && rightPW.equals(password))
		{
			System.out.println("You are granted access!");
		}
		
		else
		{
			if(rightName.equals(username))
			{
				System.out.println("Your password is incorrect!");
				passCheck();
			}
			else if(rightPW.equals(password))
			{
				System.out.println("Your username is incorrect!");
				passCheck();
			}
			else
			{
				System.out.println("Your username and password are incorrect!");
				passCheck();
			}
		}
	}
}