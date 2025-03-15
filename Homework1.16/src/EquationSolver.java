// EquationSolver.java
import java.util.Optional;

public class EquationSolver
{

    // Metoda pentru rezolvarea ecuației
    public static Optional<Double> solveEquation(double a, double b) throws NoSolutionException {
        if (a == 0 && b == 0) {
            // Infinit de soluții (optional, nu returnăm nimic)
            return Optional.empty();
        } else if (a == 0 && b != 0) {
            // Nu există soluție
            throw new NoSolutionException("Ecuația nu are soluții.");
        } else {
            // Există o soluție, x = -b/a
            return Optional.of(-b / a);
        }
    }
}
