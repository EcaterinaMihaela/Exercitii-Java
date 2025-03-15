
public class ABase 
{
	protected int x;
	public ABase(int x) {
		this.x = x;
	}
	
	public void setX(int x)
	{
		this.x = x;
	}
	public int getX()
	{
		return x;
	}
	
	void displayX()
	{
		System.out.println("x = " + x);
	}
	public void method1()
	{
		System.out.println("Method from base class");
	}
}

class AExtended extends ABase
{
	public AExtended(int x) 
	{
		super(x);
	}
	
	@Override    //overload e supraincarcarea
	public void method1()
	{
		System.out.println("Clasa derivata");
	}
}

