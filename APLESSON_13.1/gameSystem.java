public class gameSystem
{
	private String platform;
	private int serialNo;
	
	public gameSystem()
	{
		platform = "";
		serialNo = (int)(Math.random() * 10000000) + 1;
	} 
	public gameSystem(String p)
	{
		platform = p;
		serialNo = (int)(Math.random() * 1000000) + 1;
	}
	
	public String getPlatform()
	{
		return platform;
	}
	public int getSerialNo()
	{
		return serialNo;
	}
}