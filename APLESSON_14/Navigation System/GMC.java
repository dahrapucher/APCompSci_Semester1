public class GMC implements location
{
	private double x, y;
	
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
	
	public void move(int one, int two)
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