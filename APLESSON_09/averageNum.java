public class averageNum
{
	public static void main(String[]args)
	{
		int[] numbers = new int[10];
		
		for(int i = 0; i < numbers.length; i++)
			numbers[i] = (int)(Math.random()*100)+1;
		
		System.out.println("Numbers...");
		for(int num : numbers)
			System.out.print(num + " ");
		System.out.println();
		System.out.println("The average of the above numbers is about... " + average(numbers));
	}
	
	public static int9 average(int[] x)
	{
		int average = 0;
		int sum = 0;
		for(int num : x)
			sum += num;
		return sum/10;
	}	
}