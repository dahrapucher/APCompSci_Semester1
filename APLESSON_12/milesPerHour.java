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
	
	public milesPerHour(int dist, int hr, int min)
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
	
}
