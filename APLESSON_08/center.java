import java.util.Scanner;

public class center
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a word:");
		String word1 = kb.next();
		System.out.println("Please enter a second word:");
		String word2 = kb.next();
		System.out.println("Please enter a third word:");
		String word3 = kb.next();
		
		System.out.println(makeCenter(word1));
		System.out.println(makeCenter(word2));
		System.out.println(makeCenter(word3));
	}
	public static String makeCenter(String one)
	{
		if(one.length() >= 20)
			return one;
		return makeCenter(" " + one + " ");
	}
}