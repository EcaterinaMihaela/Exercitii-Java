
public class ExceptionExemple
{
	// Checked Exception Example: ClassNotFoundException
	public static void loadClass(String className) throws ClassNotFoundException
	{
		Class.forName(className);  //arunca exceptia classnotfound
		System.out.println("Class " +className+"loaded succesfully");
	}
	
	//Unchecked exception exemple
	public static int divide(int a,int b)
	{
		return a/b; //arunca o exceptie aritmetica
	}
}
