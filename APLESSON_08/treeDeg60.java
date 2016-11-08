import java.util.Scanner;

public class treeDeg60
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a word:");
		String word = kb.next();
		int stop = word.length();
		
		System.out.printf(tree(word, 0, stop));
		
	}
	public static String tree(String word, int start, int stop)
	{
		if(start <= stop)
		{
			return word.substring(0, start);
			start += 1;
			tree(word, start, stop);
		}
		return word;
	}
}