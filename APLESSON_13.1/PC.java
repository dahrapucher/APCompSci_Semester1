public class PC extends gameSystem
{
	private String platform;
	private int serialNo;
	
	public PC()
	{
		super();
	} 
	public PC(String p)
	{
		super(p);
	}
	
	public String systemInput()
	{
		return "Keyboard and Mouse";
	}
	
	public String getPlatform()
	{
		return "PC";
	}
	
	public String toString()
	{
		return "Platform: " + getPlatform() + "\nSerial #: " + getSerialNo() + "\nSystem Input: " + systemInput();
	}
}