import java.util.ArrayList;
import java.util.Scanner;

public class toyStore
{
	private ArrayList<String> toyList;
	
	public toyStore()
	{
		loadToys();
	}
	public toyStore(String t)
	{
		loadToys(t);
	}

	
	public static void loadToys(String ts)
	{
		ArrayList<String> toys = new ArrayList(ts.split(", "));
		
		for(int i = 0, i < toys.size, i++)
		{
			String name = toys.get(i);
			String type = toys.get(i + 1);
			if(getThatToy().equals("null"))
			{
				if(type.equals("Car"))
				{
					
				}
				if(type.eqals("AF"))
				{
					
				}
				else
				{	
					count++;
				}	
			}
		}
	}
	
	public static String getThatToy(String nm)
	{
		for(Toy t : toyList)
		{
			if(name.equals("nm")
			{
				return t;
			}
			return "null";
		}
	}
	
	public static String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		
		for(Toy t : toyList)
		{
			if(type.equals("Car"))
			{
				cars++;
			}
			if(type.equals("AF")
			{
				figures++;
			}
		}
		
		if(cars > figures)
			return "Cars";
		if(figures > cars)
			return "Action Figures";
		if(figures == cars)
			return "Equal amounts of action figures and cars!";
	}
	
	public String toString()
	{
		return toyList;
	}
}