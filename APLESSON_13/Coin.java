public class Coin extends money
{
	private double weight;
	
	public Coin()
	{
		super();
		this.weight = 0;
	}
	
	public Coin(String n, double w, double v)
	{
		super(n, v);
		this.weight = w;
	}
	
	public String toString()
	{
		return "Weight " + weight + "g\n" +
				super.toString();
	}
}