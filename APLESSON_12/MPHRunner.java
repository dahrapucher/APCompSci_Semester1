import java.util.Scanner;

public class MPHRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter distance: ");
		int dist = kb.nextInt();
		System.out.println("Please enter number of hours: ");
		int hr = kb.nextInt();
		System.out.println("Please enter number of minutes: ");
		int min = kb.nextInt();
		
		milesPerHour object = new milesPerHour(dist, hr, min);
		
		System.out.println(object.getDist() + " miles in " + object.getHours() + " hours and " + object.getMin() + " minutes is " + object.getMPH() + " mph.");
		
		object.setDistance(10);
		object.setHour(2);
		object.setMin(30);
		System.out.println(object.getDist() + " miles in " + object.getHours() + " hours and " + object.getMin() + " minutes is " + object.getMPH() + " mph.");
	}
	
}