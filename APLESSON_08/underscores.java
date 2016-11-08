import java.util.Scanner;

public class underscores
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a sentence:");
		String sentence = kb.nextLine();
		System.out.println(replace(sentence));
	}
	public static String replace(String one)
	{
		if(one.indexOf(" ") > 0)
			return replace(one.substring(0, one.indexOf(" ")) + "_" + one.substring(one.indexOf(" ") + 1));
		return one;
	}
}
