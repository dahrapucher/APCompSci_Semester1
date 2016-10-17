import java.util.Scanner;

public class password
{
	static Scanner kb;
	
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		
		String rightName = "username";
		String rightPW = "Password";
		
		passCheck(rightName, rightPW);
	}
	public static String passCheck(String rightName, String rightPW)
	{
		System.out.println("Please enter your username:");
		String username = kb.next();
		System.out.println("Please enter your password:");
		String password = kb.next();
		
		if(rightName.equals(username) && rightPW.equals(password))
		{
			return "You are granted access!";
		}
	}
}