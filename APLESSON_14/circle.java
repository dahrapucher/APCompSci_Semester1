public class circle implements cutShapes
{
	private double radius;
	
	public circle()
	{
		radius = 0;
	}
	public circle(double r)
	{
		radius = r;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public double getArea()
	{
		return pi * Math.pow(radius, 2);
	}
}