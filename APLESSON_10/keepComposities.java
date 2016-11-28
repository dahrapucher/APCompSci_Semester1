import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class keepComposities
{
	public static void main(String[]args)
	{
		Integer[] numbers = {2,6,8,9,10,12,13,15,17,24,55,66,78,77,79};
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(numbers));
		
		gFactor();
		removeComposites();
		System.out.println(nums);
	}
	
	public static int gFactor(int n)
	{
		for(int i = 2; i < n-1; i++)
		{
			if(n % i == 0)
				return 1;
		}
		return 0;
	}
	
	public static void removeComposites()
	{
		for(int i = 0; i < nums.length; i++)
		{
			if(gFactor(nums[i]) == 0)
			{
				nums.remove(i);
			}
		}
	}
}