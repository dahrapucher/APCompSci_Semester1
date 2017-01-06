public class UserNamesRunner
{
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