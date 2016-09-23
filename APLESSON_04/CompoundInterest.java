import java.util.Scanner; //import scanner

public class CompoundInterest
{
	public static void main(String[]args)
	{
		//create a new oject of your class
		CompoundInterest loan = new CompoundInterest();
		
		//instantiate new Scanner object
		Scanner kb = new Scanner(System.in);
		
		//user inputs
		System.out.println("What is your interest rate?");
		double rate = kb.nextDouble();
		System.out.println("How much do you intend to borrow?");
		double principle = kb.nextDouble();
		System.out.println("How many times is the loan is compounded per year?");
		double number = kb.nextDouble();
		System.out.println("In how many years do you want to pay off your loan?");
		double time = kb.nextDouble();
		
		//method call
		System.out.printf("Your monthly payment will be $%10.2f\n", loan.payment(rate, principle, time, number));
		
	}
	
	public double payment(double rate, double principle, double time, double number)
	{
		return (principle * Math.pow(1 + (rate/100/number), (number * time))) / (time * 12);
	}
}