import java.util.Scanner;

public class Cube
{
	static double side;
	static double sa;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		//user input
		System.out.println("Enter the length of a side of your cube: ");
		side = kb.nextDouble();
		
		//method call
		calcSA();
		print();
	}
	
	public static void calcSA()
	{
		sa = 6*side*side;
	}
	public static void print()
	{
		System.out.printf("The surface area of a cube with sides a length of %f is %.5f", side, sa);
	}
}
