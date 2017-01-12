import java.util.Scanner;

public class CarRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter paint color:");
		String paint = kb.nextLine();
		System.out.println("Please enter interior type:");
		String interior = kb.nextLine();
		System.out.println("Please enter engine type:");
		String engine = kb.nextLine();
		System.out.println("Please enter tire type:");
		String tire = kb.nextLine();
		
		Car object = new Car(paint, interior, engine, tire);
		
		System.out.println("Your vehicle is ready...");
		System.out.println("Paint:\t" + object.getPaint());
		System.out.println("Interior:\t" + object.getInterior());
		System.out.println("Engine:\t" + object.getEngine());
		System.out.println("Tires:\t" + object.getTire());
		
	}	
}