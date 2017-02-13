public class gameRunner
{
	public static void main(String[]args)
	{
		gameSystem object1 = new XBox();
		System.out.println(object1);
		
		gameSystem object2 = new XBox();
		System.out.println("\n" + object2);
		
		gameSystem object3 = new PC();
		System.out.println("\n" + object3);
		
		gameSystem object4 = new playStation();
		System.out.println("\n" + object4);
	}
}