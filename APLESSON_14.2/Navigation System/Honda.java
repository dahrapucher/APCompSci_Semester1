public class Honda extends Car
{
	private double[] location;
	private final int ID = getID();
	
	public Honda()
	{
		location = new double[2];
	}
	public Honda(double[]d)
	{
		location = new double[2];
		location[0] = d[0];
		location[1] = d[1];
		
	}
	
	public double[] getLoc()
	{
		return location;
	}	
	
}