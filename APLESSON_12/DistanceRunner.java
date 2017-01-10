import java.util.Scanner;

public class DistanceRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		//user input for coordinate 1
		System.out.println("Please enter the first x coordinate:");
		int x1 = kb.nextInt();
		System.out.println("Please enter the first y coordinate:");
		int y1 = kb.nextInt();
		
		//user input for coordinate 2
		System.out.println("Please enter the second x coordinate:");
		int x2 = kb.nextInt();
		System.out.println("Please enter the second y coordinate:");
		int y2 = kb.nextInt();
		
		Distance object = new Distance(x1, y1, x2, y2);
		
		System.out.println("The distance between these coordinates is " + object.getDist());
		
		object.setXOne(3);
		object.setYOne(2);
		object.setXTwo(10);
		object.setYTwo(12);
		System.out.println("The distance between the new coordinates is " + object.getDist());
	}
}