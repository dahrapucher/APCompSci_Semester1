public class advance extends ticket
{
	private int serialNo, daysLeft;
	private double price;
	
	public advance()
	{
		super();
	}
	
	public int numDaysLeft(int d)
	{
		return d;
	}
	
	public double getPrice()
	{
		if(numDaysLeft(daysLeft) >= 10)
		{
			return 30.00;
		}
		else
		{
			return 40.00;
		}
	}
}