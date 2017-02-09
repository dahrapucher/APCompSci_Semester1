import java.util.ArrayList;
import java.util.Arrays;

public class toyStore
{
	private ArrayList<Toy> toyList;
	
	public toyStore()
	{
		toyList = null;
	}
	public toyStore(String t)
	{
		toyList = new ArrayList<Toy>();
		loadToys(t);
	}

	
	public void loadToys(String ts)
	{
		String[] toyss = ts.split(", ");
		
		ArrayList<String> toys = new ArrayList<String>(Arrays.asList(toyss));
		
		for(int i = 0; i < toys.size(); i+=2)
		{
			String name = toys.get(i);
			String type = toys.get(i + 1);
			
			Toy t = getThatToy(name);
			
			if(getThatToy(name) == null)
			{
				if(type.equals("Car"))
				{
					toyList.add(new car(name));
				}
				if(type.equals("AF"))
				{
					toyList.add(new AFigure(name));
				}
			}
			else
			{	
				t.setCount(t.getCount()+1);
			}	
		}
	}
	
	public Toy getThatToy(String nm)
	{
		if(toyList.size() > 0)
		{	
			for(Toy t : toyList)
			{
				if(t.getName().equals(nm))
				{
					return t;
				}
			}
		}		
		return null;
	}
	
	public String getMostFrequentToy()
	{
		String name = "";
		int max = 0;
		
		for(Toy t : toyList)
		{
			if(max < t.getCount())
			{
				max = t.getCount();
				name = t.getName();
			}
		}
		return name;
	}
	
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		
		for(Toy t : toyList)
		{
			if(t.getType().equals("Car"))
			{
				cars++;
			}
			if(t.getType().equals("AF"))
			{
				figures++;
			}
		}
		
		if(cars > figures)
			return "Car";
		if(figures > cars)
			return "Action Figures";
		else
			return "Equal amounts of action figures and cars!";
	}
	
	public String toString()
	{
		return toyList + "";
	}
}