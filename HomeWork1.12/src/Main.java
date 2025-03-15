public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Rezultat: " + calculeaza(2));
            System.out.println("Rezultat: " + calculeaza(0)); // Caz cu împărțire la 0
        } catch (ArithmeticException e) {
            System.out.println("Eroare capturată în main: " + e.getMessage());
        }
    }

    public static int calculeaza(int x) throws ArithmeticException {
        return 10 / x; // Dacă x este 0, se aruncă automat o excepție
    }
}
