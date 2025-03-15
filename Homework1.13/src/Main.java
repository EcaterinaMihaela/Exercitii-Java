
public class Main 
{
	public static void main(String[] args)
	{
        String fileName = "numar.txt";
        int x = FileReaderUtility.readNumberFromFile(fileName);
        int result = Calculator.calculate(x);
        System.out.println("Valoarea calculată: " + result);
	}
}
