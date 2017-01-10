import java.lang.Math.*;
import java.util.Scanner;

public class Distance
{
	private int xOne, yOne, xTwo, yTwo;
	private double distance;
	
	public Distance()
	{
		xOne = 0;
		yOne = 0;
		xTwo = 0;
		yTwo = 0;
		distance = 0;
	}
	
	public Distance(int Xone, int Yone, int Xtwo, int Ytwo)
	{
		xOne = Xone;
		yOne = Yone;
		xTwo = Xtwo;
		yTwo = Ytwo;
		distance = 0;
	}
	
	public void setXOne(int Xone)
	{
		xOne = Xone;
	}
	
	public void setYOne(int Yone)
	{
		yOne = Yone;
	}
	
	public void setXTwo(int Xtwo)
	{
		xTwo = Xtwo;
	}
	
	public void setYTwo(int Ytwo)
	{
		yTwo = Ytwo;
	}
	
	public double getDist()
	{
		return Math.sqrt((xTwo - xOne) * (xTwo - xOne) + (yTwo - yOne) * (yTwo - yOne));
	}
	
}