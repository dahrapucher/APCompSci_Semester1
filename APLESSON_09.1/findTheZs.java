import java.util.Scanner;

public class findTheZs
{
	static String[]words;
	
	public static void main(String[]args)
	{
		words = new String[5];
		
		fillArray();
		System.out.print("For the words... ");
		printArray(words);
		System.out.println("\nOnly " + hasZs(words) + " contain the letter z.");
	}
	
	public static void fillArray()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter 5 words:");
		for(int i = 0; i < words.length; i++)
		{
			words[i]=kb.next();
		}
	}
	
	public static String printArray(String[]words)
	{
		for(String word : words)
		{
			System.out.print(word + ", ");
		}
		return "";
	}
	
	public static String hasZs(String[]words)
	{
		String Zs = "";
		for(String word : words)
		{
			if(word.indexOf("z") >= 0)
			{
				Zs+=word + " ";
			}
		}
		return Zs;
	}
}