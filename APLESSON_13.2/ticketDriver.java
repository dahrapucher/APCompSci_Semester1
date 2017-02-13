public class ticketDriver
{
	public static void main(String[]args)
	{
		ticket object1 = new walkUp();
		System.out.println(object1);
		
		ticket object2 = new advance();
		System.out.println("\n" + object2);
		
		ticket object3 = new studentAdvance();
		System.out.print("\n" + object3);
	}	
}