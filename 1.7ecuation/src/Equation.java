
public class Equation 
{
	private EquationParameters parameters;
	
	public Equation(EquationParameters parameters) 
	{
		this.parameters = parameters;
	}
	
	public Solution solve()
	{
		int b = parameters.getB();
		int x1 = b;
		int x2 = -b;
		
		return new Solution(x1,x2);
	}
}
