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
		
		double bmi = (w/(h*h))*703;
		String condition = calcCondish(bmi);
		System.out.printf("Your BMI is %.1f.", bmi);
		System.out.println("\nYou are " + condition + ".");
	}
	public static String calcCondish(double bmi)
	{	
		if(bmi < 18.5)
			return "Underweight";
		else if(bmi < 25)
			return "Normal";
		else if(bmi < 30)
			return "Overweight";
		else if(bmi < 35)
			return "Obese";
		else if(bmi < 40)
			return "Very Obese";
		else
			return "Morbidly Obese";
	}
}