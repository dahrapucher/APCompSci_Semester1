import java.util.Scanner;

public class discount
{
	public static void main(String[]args)
	{
		//instantiate Scanner
		Scanner kb = new Scanner(System.in);
		
		
		//user input for item1
		System.out.println("Enter first item: ");
		String item1 = kb.nextLine();
		System.out.println("Enter the price of the first item:");
		double price1 = kb.nextDouble();
		//user input for item2
		System.out.println("Enter second item: ");
		String item2 = kb.nextLine();
		System.out.println("Enter the price of the second item: ");
		double price2 = kb.nextDouble();
		//user input for item3
		System.out.println("Enter third item:");
		String itme3 = kb.nextLine();
		System.out.println("Enter the price of the third item:");
		double price3 = kb.nextDouble();
		//user input for item4
		System.out.println("Enter fourth item:");
		String item4 = kb.nextLine();
		System.out.println("Enter the price of the fourth item:");
		double price4 = kb.nextDouble();
		
		double sub = price1+price2+price3+price4;
		String discount = discount(sub);
		double total = sub - dicount + tax;
		
		//format reciept
		System.out.println("<<<<<<<<<<_Receipt_>>>>>>>>>>");
		format(item1, price1);
		format(item2, price2);
		format(item3, price3);
		format(item4, price4);
		System.out.println("\n");
		format("Subtotal: ", sub);
		format("Discount:", discount);
		format("Total: ", total);
		System.out.println("\n");
		System.out.println("-----------------------------------");
		System.out.println("\t*  Thank you for your support  *");
		
	}
	
	public static boolean discount(double total, String discount)
	{
		double discount = 0;
		if(total >= 2000)
		{
			discount = total * 0.15;
		}
		if(total < 2000)
		{
			discount = 0;
		}
		return discount;
	}
	
	public void format(String item, double price)
	{
		System.out.printf("\n*%20s ........ %7.2f", item, price);
	}
}