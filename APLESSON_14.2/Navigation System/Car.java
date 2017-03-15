public abstract class Car implements Location
{
	private final int ID = getID();
	private double[] location;
	
	public Car()
	{
		location = new double[2];
	}
	
	public int getID()
	{
		return (int)(Math.random()*1000000)+1;
	}
	
	public void move(double one, double two)
	{
		location[0]+=one;
		location[1]+=two;
	}	
	public double[] getLoc()
	{
		return location;
	}
}