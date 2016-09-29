import java.util.Scanner;

public class circle
{
	static double r;
	static double area;
	
	public static void main(String[]args)
	{
		//import scanner
		Scanner kb = new Scanner(System.in);
		
		//user input
		System.out.println("Enter the radius of your sphere: ");
		r = kb.nextDouble();
		
		//method call
		calcArea();
		print();
	}
	
	public static void calcArea()
	{
		area = 3.14*r*r;
	}
	
	public static void print()
	{
		System.out.printf("The area of a circle with a radius of %f is %.5f", r, area);
	}
}