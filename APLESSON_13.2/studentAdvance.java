public class studentAdvance extends advance
{
	private int serialNo, daysLeft;
	private double price;
	
	public studentAdvance()
	{
		super();
	}
	
	public double getPrice()
	{
		if(numDaysLeft(daysLeft) >= 10)
		{
			return 15.00;
		}
		else
		{
			return 20.00;
		}
	}
	
	public String toString()
	{
		return "Serial #: " + getSerialNo() + "\nPrice: " + getPrice() + "\n(STUDENT ID REQUIRED)";
	}
}