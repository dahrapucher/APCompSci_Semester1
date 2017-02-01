public class money
{
	private String name;
	private double value;
	
	public money()
	{
		this.name = "";
		this.value = 0;
	}
	
	public money(String n, double v)
	{
		this.name = n;
		this.value = v;
	}
	
	public String toString()
	{
		return "Your " + name + " is worth $" + value + ".\n";
	}
}