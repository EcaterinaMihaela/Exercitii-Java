
public class Equation 
{
	private equationParameters parameters;
	
	public Equation(equationParameters parameters)
	{
		this.parameters = parameters;
	}
	
	public Solution solve() {
        double a = parameters.getA();
        double b = parameters.getB();
        double c = parameters.getC();
       try 
       { 
        if (a == 0) 
        {
        	throw new IllegalArgumentException("Not a quadratic equation (a cannot be 0)");
        }
       
        
        double delta = b * b - 4 * a * c;
        if (delta < 0) 
        {
        	throw new IllegalArgumentException("No real solutions");
        } 
        else if (delta == 0) 
        {
            double x = -b / (2 * a);
            return new Solution(x, null);
        } 
        else 
        {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new Solution(x1, x2);
        }
       }
        catch(IllegalArgumentException e)
        {
        	return new Solution(e.getMessage());
        }
    }
}
