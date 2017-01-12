import java.util.Scanner;

public class HumanRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter hair color:");
		String h = kb.nextLine();
		System.out.println("Enter eye color:");
		String e = kb.nextLine();
		System.out.println("Enter skin tone:");
		String s = kb.nextLine();
		
		Human object = new Human(h, e, s);
		
		System.out.println("My info...");
		System.out.println("Hair:\t" + object.getHair());
		System.out.println("Eyes:\t" + object.getEyes());
		System.out.println("Skin:\t" + object.getSkin());
		
		object.setHES("blonde", "blue", "white");
		System.out.println("Friends info...");
		System.out.println("Hair:\t" + object.getHair());
		System.out.println("Eyes:\t" + object.getEyes());
		System.out.println("Skin:\t" + object.getSkin());
	}
}