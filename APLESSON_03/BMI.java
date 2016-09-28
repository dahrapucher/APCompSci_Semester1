import java.util.Scanner; //import Statement

public class BMI
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("How tall are you in inches?");
		
		double height = keyboard.nextDouble();
		
		System.out.println("Okay. How much do you weigh in pounds?");
		
		double weight = keyboard.nextDouble();
		
		double BMI = weight / (height * height) * 703;
		
		System.out.println("Your BMI is " + BMI + ".");
	}
}
