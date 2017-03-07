public class GMC extends Car
{
	private double x, y;
	private int ID;
	
	public GMC()
	{
		x = y = 0;
	}
	public GMC(double one, double two)
	{
		x = one;
		y = two;
	}
	
	public int getID()
	{
		return (int)(Math.random()*1000000)+1;
	}
	
	public void move(double one, double two)
	{
		x += one;
		y += two;
	}
	
	public double[] getLoc()
	{
		double[] location = new double[2];
		location[0] = x;
		location [1] = y;
		return location;
	}
}