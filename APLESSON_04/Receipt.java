import java.util.Scanner; //import scanner

public class Receipt
{
	public static void main(String[]args)
	
	{
		Receipt form = new Receipt();
		
		//instantiate the new Scanner object "kb"
		Scanner kb = new Scanner(System.in);
		
		//inputs for item1
		System.out.println("Please enter item 1");
		String item1 = kb.nextLine();
		System.out.println("Please enter the price");
		double price1 = kb.nextDouble();
		kb.nextLine();
		//inputs for item2
		System.out.println("Please enter item 2");
		String item2 = kb.nextLine();
		System.out.println("Please enter the price");
		double price2 = kb.nextDouble();
		kb.nextLine();
		//inputs for item3
		System.out.println("Please enter item 3");
		String item3 = kb.nextLine();		
		System.out.println("Please enter the price");
		double price3 = kb.nextDouble();
		
		//calculations for reciept
		double subamount = price1 + price2 + price3;
		
		double tax = 0.08 * subamount;
		
		double total = tax + subamount;
		
		//final reciept
		System.out.println("<<<<<<<<<<_Receipt_>>>>>>>>>>");
		form.format(item1, price1);
		form.format(item2, price2);
		form.format(item3, price3);
		System.out.println("\n");
		form.format("Subtotal:", subamount);
		form.format("Tax:", tax);
		form.format("Total:", total);
		System.out.println("\n");
		System.out.println("-----------------------------------------------------");
		System.out.println("\t*  Thank you for your support  *");
	}
	
	public void format(String item, double price)
	{
		System.out.printf("\n*%20s ........ %7.2f", item, price);
	}
}
	

		
		