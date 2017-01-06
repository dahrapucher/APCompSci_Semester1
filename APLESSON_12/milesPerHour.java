import java.lang.Math.*;
import java.util.Scanner;

public class milesPerHour
{
	private int distance, hour, minutes;
	private double mph;
	
	public milesPerHour()
	{
		distance = 0;
		hour = 0;
		minutes = 0;
		mph = 0;
	}
	
	public milesPerHour(int dist, int hr, int min, double mph)
	{
		distance = dist;
		hour = hr;
		minutes = min;
		mph = 0;
	}
	
	public void setDistance(int dist)
	{
		distance = dist;
	}

	public void setHour(int hr)
	{
		hour = hr;
	}
	
	public void setMin(int min)
	{
		minutes = min;
	}
	
	public int getDist()
	{
		return distance;
	}
	
	public int getHours()
	{
		return hour;
	}
	
	public int getMin()
	{
		return minutes;
	}
	
	public double getMPH()
	{
		return Math.round(distance / (hour + minutes / 60.0));
	}
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter distance: ");
		int distance = kb.nextInt();
		System.out.println("Please enter number of hours: ");
		int hour = kb.nextInt();
		System.out.println("Please enter number of minutes: ");
		int minutes = kb.nextInt();
		
		milesPerHour object = new milesPerHour();
		
		System.out.println(object.getDist() + " miles in " + object.getHours() + " hours and " + object.getMin() + " minutes is " + object.getMPH() + " mph.");
		
		object.setDistance(10);
		object.setHour(2);
		object.setMin(30);
		System.out.println(object.getDist() + " miles in " + object.getHours() + " hours and " + object.getMin() + " minutes is " + object.getMPH() + " mph.");
	}
}
