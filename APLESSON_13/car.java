public class car extends Toy
{
	private String name;
	private int count;
	
	public car()
	{
		super();
	}
	public car(String n)
	{
		super(n);
	}
	
	public String getType()
	{
		return "Car";
	}
}