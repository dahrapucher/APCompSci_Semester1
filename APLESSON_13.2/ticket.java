public abstract class ticket
{
	private int serialNo;
	private double price;
	
	public ticket()
	{
		serialNo = 0;
		price = 0;
	}
	
	public int getSerialNo()
	{
		return (int)(Math.random() * 10000000) + 1;
	}
	
	public abstract double getPrice();

	public String toString()
	{
		return "Serial #: " + getSerialNo() + "\nPrice: " + getPrice();
	}
}