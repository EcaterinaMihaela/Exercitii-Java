
public class Calculator 
{
	
	//exemplu de aruncare a unei exceptii
	public int divideAruncareExceptie(int a,int b) throws ArithmeticException
	{
		if(b==0)
		{
			throw new ArithmeticException("Cannot divide by zero!");
		}
		return a/b;
	}
	
	public Integer divideReturnNull(int a,int b)
	{
		if(b==0)
		{
			return null;  
		}
		return a/b;
	}
}
//fctii lamda seamana cu fctie dar fara nume,e o bucata de cod
//cum se poate modifica o val s unui param a unei fctii pt diferite tipuri de var