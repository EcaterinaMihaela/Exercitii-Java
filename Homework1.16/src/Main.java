// Main.java
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        try {
            // Exemplu 1: a = 2, b = -4
            Optional<Double> solution1 = EquationSolver.solveEquation(2, -4);
            solution1.ifPresentOrElse(
                solution -> System.out.println("Soluția ecuației este: " + solution),
                () -> System.out.println("Ecuația are un număr infinit de soluții.")
            );

            // Exemplu 2: a = 0, b = 5 (nu are soluție)
            Optional<Double> solution2 = EquationSolver.solveEquation(0, 5);
            solution2.ifPresentOrElse(
                solution -> System.out.println("Soluția ecuației este: " + solution),
                () -> System.out.println("Ecuația nu are soluții.")
            );

            // Exemplu 3: a = 0, b = 0 (infinit de soluții)
            Optional<Double> solution3 = EquationSolver.solveEquation(0, 0);
            solution3.ifPresentOrElse(
                solution -> System.out.println("Soluția ecuației este: " + solution),
                () -> System.out.println("Ecuația are un număr infinit de soluții.")
            );

        } catch (NoSolutionException e) {
            System.out.println("Eroare: " + e.getMessage());
        }
    }
}
