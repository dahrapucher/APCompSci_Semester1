import java.util.Scanner;

public class toyStoreRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter toys:");
		String ts = kb.nextLine();
		
		toyStore object = new toyStore(ts);
		
		System.out.println("List...\n" + ts);
		System.out.println(object);
		System.out.println("Most Frequent Toy: " + object.getMostFrequentToy());
		System.out.println("Most Frequent Type of Toy: " + object.getMostFrequentType());
	}
}