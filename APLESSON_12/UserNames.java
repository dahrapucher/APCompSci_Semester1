public class UserNames
{
	//instance variables
	private String userName, firstName, lastName;
	
	//Default constructor
	public UserNames()
	{
		//default values for instance variables
		userName = "";
		firstName = "";
		lastName = "";
	}
	
	//Constructor with params - overloaded
	public UserNames(String uName, String fName, String lName)
	{
		userName = uName;
		firstName = fName;
		lastName = lName;
	}
	
	//Modifier 
	public void setUserName(String uName)
	{
		userName = uName;
	}
	
	//Accessors
	public String getUserName()
	{
		return userName;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public static void main(String[]args)
	{
		UserNames object = new UserNames("dahrapucher", "Dahra", "Pucher");
		
		System.out.println("<<<<<<<<< USER INFO >>>>>>>>>>");
		System.out.println("Name: " + object.getFirstName() + " " + object.getLastName());
		System.out.println("UserName: " + object.getUserName());
		
		UserNames object1 = new UserNames();
		
		System.out.println("<<<<<<<<< USER INFO >>>>>>>>>>");
		System.out.println("Name: " + object1.getFirstName() + " " + object1.getLastName());
		System.out.println("UserName: " + object1.getUserName());
		
		object.setUserName("dpucher");
		System.out.println("<<<<<<<<< USER INFO >>>>>>>>>>");
		System.out.println("Name: " + object.getFirstName() + " " + object.getLastName());
		System.out.println("UserName: " + object.getUserName());
	}
}