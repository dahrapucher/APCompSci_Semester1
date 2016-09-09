import java.util.Scanner; //import Statement

public class calculation
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("What is the radius of your cylinder?");
		
		double radius = keyboard.nextDouble();
		
		System.out.println("Okay.");
		System.out.println("What is the height of your cylinder?");
		
		double height = keyboard.nextDouble();
		
		double volume = 3.14159265359 * height * radius * radius;
		
		System.out.println("The volume of your cylinder is approximately " + volume + ".");
	}
}