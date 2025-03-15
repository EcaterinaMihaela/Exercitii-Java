
public class Main 
{

	public static void main(String[] args) 
	{
		try
		{
			ExceptionExemple.loadClass("java.util.ArrayList");  //gasita
			ExceptionExemple.loadClass("com.nonexistent.NonExistentClass");  //negasita
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Checked Exception(ClassNotFoundException)"+e.getMessage());
		}
		
		try 
		{
            System.out.println(ExceptionExemple.divide(10, 0));  // Împărțirea la 0 va arunca ArithmeticException
        } 
		catch (ArithmeticException e) 
		{
            System.out.println("Unchecked Exception (ArithmeticException): " + e.getMessage());
        }
		
		
		//pt clasa calculator
		Calculator calculator = new Calculator();
		
		try
		{
			int result = calculator.divideAruncareExceptie(10,0);  //aruca iar arithmetic error
			System.out.println("Result: "+ result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error: "+e.getMessage());  //afiseaza
		}
	}

}
