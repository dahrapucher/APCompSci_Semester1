public class GMC extends Car
{
	private double x, y;
	private final int ID = getID();
	
	public GMC()
	{
		x = y = 0;
	}
	public GMC(double one, double two)
	{
		x = one;
		y = two;
	}
	
	public double[] getLoc()
	{
		double[] location = new double[2];
		location[0] = x;
		location [1] = y;
		return location;
	}
}

