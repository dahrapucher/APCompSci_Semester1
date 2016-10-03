import java.util.Scanner;

public class Cube43
{
	public static void main(String[]args)
	{
		//instantiate Scanner object
		Scanner kb = new Scanner(System.in);
		
		//user input
		System.out.println("Enter the lenth of a side of your cube: ");
		double side = kb.nextDouble();
		
		print(calcSurf(side));
	}
	public static double calcSurf(double side)
	{
		return 6*side*side;
	}
	public static void print(double side, double surfArea)
	{
		System.out.printf("The surface area of a cube whose sides are %f in lenght is %.5f", side, surfArea);
	}
}