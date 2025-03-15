import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class FileReaderUtility
{
    public static int readNumberFromFile(String fileName) {
        int x = 1; // Valoare implicită în caz de eroare
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();
            x = Integer.parseInt(line.trim());
        } catch (FileNotFoundException e) {
            System.out.println("Fișierul nu a fost găsit. Se folosește valoarea implicită: " + x);
        } catch (IOException e) {
            System.out.println("Eroare la citirea fișierului. Se folosește valoarea implicită: " + x);
        } catch (NumberFormatException e) {
            System.out.println("Fișierul nu conține un număr valid. Se folosește valoarea implicită: " + x);
        }
        return x;
    }
}