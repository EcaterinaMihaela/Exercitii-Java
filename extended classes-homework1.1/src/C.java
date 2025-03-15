
public class C extends B
{
	protected float y;
	
	public C(int x, String s, float y)
	{
        super(x,s);
        this.y = y;
    }
	void readY()
	{
		System.out.println("citeste y");
	}
	
	void readX()
	{
		System.out.println("Metoda readX() suprascrisă în C.");
	}
	
	void displayXYS()
	{
		System.out.println("Valori: x = " + x + ", s = " + s + ", y = " + y);
	}
}
