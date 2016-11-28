public class biggestNum
{
	static int[] numbers;
	
	public static void main(String[]args)
	{
		numbers = new int[10];
		
		fillArray();
		System.out.print("For the following numbers... ");
		printArray(numbers);
		System.out.println("\nThe biggest number is " + getBiggest(numbers));
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
	
	public static int getBiggest(int[]numbers)
	{
		int max = 0;
		for(int num : numbers)
		{
			if(num > max)
			{
				max = num;
			}
		}
		return max;
	}
}