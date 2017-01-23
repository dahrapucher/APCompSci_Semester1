public class InventoryItems
{
	private static String manufacturer, name, category;
	private static int UPC, price;
	
	//constructors
	public InventoryItems(String man, String n)
	{
		manufacturer = man;
		name = n;
		UPC = (int)(Math.random()*1000000000)+100000000;
	}
	public InventoryItems(String man, String n, String cat, int p)
	{
		manufacturer = man;
		name = n;
		category = cat;
		price = p;
		UPC = (int)(Math.random()*1000000000)+100000000;
	}
		public String toString()
	{
		return "Item Info...\nItem Manufacturer: " + manufacturer +
							"\nItem Name: " + name +
							"\nItem Category: " + category +
							"\nItem UPC#: " + UPC +
							"\nItem Price: " + price;
	}
}