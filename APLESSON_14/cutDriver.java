import java.util.ArrayList;

public class cutDriver
{
	public static void main(String[]args)
	{
		ArrayList<cutShapes> cuts = new ArrayList<>();
		cuts.add(new rectangle(10,10));
		cuts.add(new circle(5));
		cuts.add(new square(9));
		
		double totalArea = 0;
		
		for(cutShapes sh : cuts)
		{
			System.out.println(sh.getArea());
			totalArea += sh.getArea();
		}
		
		System.out.println("Total Wood Needed: " + totalArea + "sq ft");
	}
}