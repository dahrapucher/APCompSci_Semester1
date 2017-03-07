public class Toyota extends Car
{
	private double[] location;
	private int ID;
	
	public Toyota()
	{
		location = new double[2];
	}
	public Toyota(String s)
	{
		location = new double[2];
		String[] locs = s.split(", ");
		location[0] = Double.parseDouble(locs[0]);
		location[1] = Double.parseDouble(locs[1]);
	}
	
	public int getID()
	{
		return (int)(Math.random()*1000000)+1;
	}
	
	public void move(double x, double y)
	{
		location[0]+=x;
		location[1]+=y;
	}
	
	public double[] getLoc()
	{
		return location;
	}
}