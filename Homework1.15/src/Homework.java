import java.util.Random;

public class Homework {
    public static void main(String[] args) {
        try {
            int[] result = generateNumbers();
            // Afișăm rezultatele pentru a verifica corectitudinea
            for (int i = 0; i < result.length; i++) {
                System.out.println("Elementul " + i + ": " + result[i]);
            }
        } catch (ArithmeticException e) {
            System.out.println("Eroare de împărțire: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Eroare de indexare a tabloului: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("A apărut o eroare generală: " + e.getMessage());
        }
    }

    public static int[] generateNumbers() throws ArithmeticException, ArrayIndexOutOfBoundsException {
        Random rand = new Random();
        int[] array = new int[10]; // Vom crea un tablou cu 10 elemente
        for (int i = 0; i < array.length; i++) {
            int x = rand.nextInt(20); // Generăm un număr întreg aleatoriu între 0 și 19
            if (x == 0) {
                throw new ArithmeticException("Împărțirea la 0 nu este permisă!");
            }
            array[i] = 100 / x; // Adăugăm 100 / x în tablou
        }
        return array;
    }
}
