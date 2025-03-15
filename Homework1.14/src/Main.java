import java.util.Scanner;

public class Main 
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
        int numar;
        
        while (true)
        {
            System.out.print("Introduceți un număr întreg: ");
            String input = scanner.nextLine();
            
            try 
            {
                numar = Integer.parseInt(input);
                break; // Ieșim din buclă dacă conversia a reușit
            } catch (NumberFormatException e) 
            {
                System.out.println("Valoare invalidă! Trebuie să introduceți un număr întreg.");
            }
        }
        
        System.out.println("Ați introdus numărul: " + numar);
        scanner.close();

	}

}
