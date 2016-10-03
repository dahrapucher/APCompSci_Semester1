import java.util.Scanner;

public class Circle43
{
	public static void main(String[]args)
	{
		//instantiate Scanner object
		Scanner kb = new Scanner(System.in);
		
		//user inputs
		System.out.println("Enter the radius of your cirlce: ");
		double r = kb.nextDouble();
		
		print(r, calcArea(r));
	}
	public static double calcArea(double r)
	{
		return r*r*3.14;
	}
	public static void print(double r, double area)
	{
		System.out.printf("The area of a circle with a radius of %f is %.5f.", r, area);
	}
}
