import java.util.Scanner;

public class GPA
{	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		//user inputs
		System.out.println("Enter your letter grade for math: ");
		String math = kb.next();
		System.out.println("Enter your letter grade for science:");
		String science = kb.next();
		System.out.println("Enter your letter grade for P.E.:");
		String pe = kb.next();
		System.out.println("Enter your letter grade for english:");
		String english = kb.next();
		System.out.println("Enter your letter grade for art:");
		String art = kb.next();
		System.out.println("Enter your letter grade for spanish:");
		String spanish = kb.next();
		System.out.println("Enter your letter grade for history:");
		String history = kb.next();
		
		double gPoints = calcPoints(math) + calcPoints(science) + calcPoints(pe) + calcPoints(english) + calcPoints(art) + calcPoints(spanish) + calcPoints(history);
		System.out.println("Your GPA is " + gPoints/7);
		
	}
	public static double calcPoints(String grade)
	{
		if(grade.equals("A"))
			return 4.0;
		if(grade.equals("B"))
			return 3.0;
		if(grade.equals("C"))
			return 2.0;
		if(grade.equals("D"))
			return 1.0;
		return 0.0;
	}
}