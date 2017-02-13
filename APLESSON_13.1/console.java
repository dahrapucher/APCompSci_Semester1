public abstract class console extends gameSystem
{
	private String platform;
	private int serialNo;
	
	public console()
	{
		super();
	}
	public console(String p)
	{
		super(p);
	}
	
	public abstract String getController();
	
	public String toString()
	{
		return "Platform: " + getPlatform() + "\nSerial #: " + getSerialNo() + "\nController: " + getController();
	}
}