import java.util.ArrayList;
import java.util.List;

public class LambdaSumExample {
    public static void main(String[] args) {
        // Creăm o listă de numere
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Folosim lambda pentru a calcula suma numerelor din listă
        int sum = numbers.stream()
                         .mapToInt(Integer::intValue) // Convertim fiecare element la int
                         .sum();  // Calculăm suma tuturor elementelor

        // Afișăm rezultatul
        System.out.println("Suma numerelor din listă este: " + sum);
    }
}
