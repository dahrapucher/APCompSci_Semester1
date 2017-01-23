import java.util.Scanner;

public class inventoryRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter item manufacturer:");
		String man = kb.next();
		System.out.println("Enter item name:");
		String n = kb.next();
		
		InventoryItems item1;
	
		System.out.println("Will you be entering category and price information?\nEnter y or n.");
		String yOrN = kb.next();
		if(yOrN.equals("n"))
		{
			item1 = new InventoryItems(man, n);
			System.out.println(item1);
		}
		if(yOrN.equals("y"))
		{
			System.out.println("Enter item category:");
			String cat = kb.next();
			System.out.println("Enter item price:");
			int p = kb.nextInt();
			
			item1 = new InventoryItems(man, n, cat, p);
			System.out.println(item1);
		}
	}
	

}