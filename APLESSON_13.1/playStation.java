public class playStation extends console
{
	private String platform;
	private int serialNo;
	
	public playStation()
	{
		super();
	}
	public playStation(String p)
	{
		super(p);
	}
	
	public String getController()
	{
		return "PS DualShock 3";
	}
	
	public String getPlatform()
	{
		return "PlayStation";
	}
}