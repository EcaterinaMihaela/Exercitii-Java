package equation;

import java.util.Scanner;

public class QuadraticSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input coefficients
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Calculate discriminant (Δ = b² - 4ac)
        double delta = b * b - 4 * a * c;

        // Check conditions
        if (a == 0) {
            System.out.println("Not a quadratic equation (a cannot be zero).");
        } else if (delta > 0) {
            // Two real roots
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Two distinct real roots: x1 = " + x1 + ", x2 = " + x2);
        } else if (delta == 0) {
            // One real root (double root)
            double x = -b / (2 * a);
            System.out.println("One real root (double root): x = " + x);
        } else {
            // Complex roots
            double realPart = -b / (2 * a);
            double imagPart = Math.sqrt(-delta) / (2 * a);
            System.out.println("Complex roots: x1 = " + realPart + " + " + imagPart + "i, x2 = " + realPart + " - " + imagPart + "i");
        }

        scanner.close();
    }
}
