import java.util.Scanner; //import scanner

public class IDCard
{
	public static void main(String[]args)
	{
		//instantiate format
		IDCard form = new IDCard();
		
		//insantiate new Scanner object "kb"
		Scanner kb = new Scanner(System.in);
		
		//user input
		System.out.println("Enter your first name");
		String first = kb.nextLine();
		System.out.println("Enter your last name");
		String last = kb.nextLine();
		System.out.println("Enter your title");
		String title = kb.nextLine();
		System.out.println("Enter the school site");
		String site = kb.nextLine();
		System.out.println("Enter the school year");
		String year = kb.nextLine();
		System.out.println("What is your subject?");
		String subject = kb.nextLine();
		
		//formating ID Card
		System.out.println("***************************************");
		form.format(site, year);
		form.format(first, last);
		form.format(title, subject);
		System.out.println("***************************************");
		
	}
	
	public void format(String item0, String item1)
	{
		System.out.printf("*  %15s\t%15s  *\n", item0, item1);
	}
}