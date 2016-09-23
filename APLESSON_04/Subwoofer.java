import java.util.Scanner; //import scanner

public class Subwoofer
{
	public static void main(String[]args)
	{
		//instantiate new Scanner object
		Scanner kb = new Scanner(System.in);
		
		//new object
		Subwoofer calculation = new Subwoofer();
		
		//user inputs
		System.out.println("What is the length of your box in inches?");
		double l = kb.nextDouble();
		System.out.println("What is the height of your box in inches?");
		double h = kb.nextDouble();
		System.out.println("What is the width of your box in inches?");
		double w = kb.nextDouble();
		
		//method call
		System.out.printf("The volume of your box in cubic feet is %10.3f", calculation.calcVol(l, w, h));
	}
	
	public double calcVol(double l, double h, double w)
	{
		return l * w * h / 1728;
	}
}