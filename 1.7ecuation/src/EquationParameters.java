import java.util.Scanner;
public class EquationParameters {
	private int b;
	
	public EquationParameters() {}  //constr implicit
	
	public EquationParameters(int b)  //constr general
	{
		this.b = b;
	}
	
	public void readFromConsole()  //metoda pt a citi de la tastatura val lui b
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value for b: ");
		this.b = scanner.nextInt();
	}
	
	public int getB()  //geter
	{
		return b;
	}
}
