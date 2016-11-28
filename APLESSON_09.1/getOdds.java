public class getOdds
{
	static int[] numbers;
	
	public static void main(String[]args)
	{
		numbers = new int[10];
		
		fillArray();
		
		System.out.print("For the following numbers...");
		printArray(numbers);
		System.out.println("\nThe " + getOdds(numbers) + " are odd numbers.");
	}
	
	public static void fillArray()
	{
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i]=(int)(Math.random()*100)+1;
		}
	}
	
	public static String printArray(int[]numbers)
	{
		for(int num : numbers)
		{
			System.out.print(num + ", ");
		}
		return "";
	}
	
	public static String getOdds(int[] y)
	{
		String odds = "";
		for(int num : y)
		{
			if(num % 2 != 0)
			{
				odds+=num + ", ";
			}
		}
		return odds;
	}
}