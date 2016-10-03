import java.util.Scanner;

public class Average43
{
	public static void main(String[]args)
	{
		//instantiate Scanner object
		Scanner kb = new Scanner(System.in);
		
		//user inputs for num1
		System.out.println("Please enter a number: ");
		double num1 = kb.nextDouble();
		
		//user inputs for num2
		System.out.println("Please enter a second number:");
		double num2 = kb.nextDouble();
		
		//user inputs for num3
		System.out.println("Please enter a third number:");
		double num3 = kb.nextDouble();
		
		print(num1,num2,num3, average(num1,num2,num3));
	}
	public static double average(double num1, double num2, double num3)
	{
		return (num1+num2+num3)/3;
	}
	public static void print(double num1, double num2, double num3, double avg)
	{
		System.out.printf("The average of %f, %f, and %f, is %.5f.", num1, num2, num3, avg);
	}
}