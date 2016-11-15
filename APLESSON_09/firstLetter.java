import java.util.Scanner;

public class firstLetter
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter 5 words:");
		String [] words = new String[5];
		
		for(int i = 0; i < words.length; i++)
			words[i] = kb.next();
		
		first(words);
	}
	
	public static void first(String[] x)
	{
		for(String word : x)
			System.out.println(word.charAt(0));
	}
}