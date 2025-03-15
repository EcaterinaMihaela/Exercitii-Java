import java.util.Scanner;
public class equationParameters 
{
	private double a;
	private double b;
	private double c;
	
	public equationParameters() {}
	
	public equationParameters(double a, double b, double c) 
	{
        this.a = a;
        this.b = b;
        this.c = c;
    }
	
	public void readFromConsole()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value for a: ");
		this.a = scanner.nextDouble();
		
		System.out.println("Enter value for b: ");
		this.b = scanner.nextDouble();
		
		System.out.println("Enter value for c: ");
		this.c = scanner.nextDouble();
	}
	
	//geteri si setari
	public double getA() 
	{
        return a;
    }
	
	public double getB() 
	{
        return b;
    }
	
	public double getC() 
	{
        return c;
    }
}
