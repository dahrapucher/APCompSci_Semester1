import java.util.Scanner;

public class reverseWord
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter 5 words:");
		
		String[] words = new String[5];
		
		for(int i = 0; i < words.length; i++)
			words[i] = kb.next();
		
		System.out.println();
		System.out.println("In order...");
		
		for(String word : words)
			System.out.print(word + " ");
		
		System.out.println();
		System.out.println();
		System.out.println("Reversed...");
		System.out.println(reverse(words));
	}
	public static String reverse(String[] x)
	{
		String output = "";
		for(int i = x.length-1; i >= 0; i--)
			output += x[i] + " ";
		return output;
	}
}