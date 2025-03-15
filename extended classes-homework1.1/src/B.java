
public class B extends ABase
{
	public B(int x, String s) 
	{
        super(x);
        this.s = s;
    }

	protected String s;
	
	void readS()
	{
		System.out.println("citeste S");
	}
	
	void displayX()
	{
		System.out.println("Suprascriere displayX() în clasa B, valoarea lui x: " + x);
	}
}
