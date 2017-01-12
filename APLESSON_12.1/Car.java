public class Car
{
	private String p, i, e, t;
	
	//constructors
	public Car()
	{
		p = "";
		i = "";
		e = "";
		t = "";
	}
	public Car(String paint, String interior, String engine, String tire)
	{
		p = paint;
		i = interior;
		e = engine;
		t = tire;
	}
	
	//modifiers
	public void setPaint(String paint)
	{
		p = paint;
	}
	public void setInterior(String interior)
	{
		i = interior;
	}
	public void setEngine(String engine)
	{
		e = engine;
	}
	public void setTire(String tire)
	{
		t = tire;
	}
	
	//accesors
	public String getPaint()
	{
		return p;
	}
	public String getInterior()
	{
		return i;
	}
	public String getEngine()
	{
		return e;
	}
	public String getTire()
	{
		return t;
	}
}