import java.util.Scanner;

public class treeDeg60
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a word:");
		String word = kb.next();
		int stop = word.length();
		
		tree(word, 0, stop);
		
	}
	public static String tree(String word, int start, int stop)
	{
		while(start <= stop)
		{
			System.out.printf("%20s\n", word.substring(0, start)); 
			start += 1;
			return tree(word, start, stop);			
		}
		return "";
	}
}