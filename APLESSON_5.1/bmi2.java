import java.util.Scanner;

public class bmi2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your height in inches:");
		double h = kb.nextDouble();
		System.out.println("Please enter your weight in pounds:");
		double w = kb.nextDouble();
		
		double bmi = "";
		String condition = 
	}
	calcBMI(double h, double w)
	{
		bmi = (w/(h*h))*703
		if(bmi < 18.5)
			condition = Underweight
		if else(bmi > 18.5, bmi < 24.9)
			condition = Normal
		if else(bmi > 25, bmi < 29.9)
			condtion = Obese
		if else(29.9 < bmi < 34.9)
	}
}