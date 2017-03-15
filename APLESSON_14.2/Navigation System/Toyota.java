public class Toyota extends Car
{
	private double[] location;
	private final int ID = getID();
	
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
	public double[] getLoc()
	{
		return location;
	}	
}