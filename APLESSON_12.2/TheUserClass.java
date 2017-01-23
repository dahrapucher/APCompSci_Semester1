import java.util.Scanner;

public class TheUserClass
{
	private String firstName;
	private String lastName;
	private String avatar;
	private int userID;
	
	//constructors
	public TheUserClass()
	{
		firstName = "";
		lastName = "";
		avatar = "";
		userID = 0;
	}
	public TheUserClass(String fN, String lN)
	{
		firstName = fN;
		lastName = lN;
		avatar = "undefined";
		userID = (int)(Math.random()*1000000)+1;
	}
	public TheUserClass(String fN, String lN, String av)
	{
		firstName = fN;
		lastName = lN;
		avatar = av;
		userID = (int)(Math.random()*1000000)+1;
	}
	
	//modifier
	public void setAv(String av)
	{
		avatar = av;
	}
	
	public String toString()
	{
		return "Customer Info...\nFist Name: " + firstName +
								"\nLast Name: " + lastName +
								"\nAvatar: " + avatar +
								"\nUser ID#: " + userID;
	}
}