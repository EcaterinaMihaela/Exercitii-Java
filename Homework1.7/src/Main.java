public class Main {
    public static void main(String[] args) {
        Adresa adresa1 = new Adresa("Strada Libertății 10", "București", "010203");
        Adresa adresa2 = new Adresa("Strada Primăverii 5", "Cluj-Napoca", "400500");

        Companie google = new Companie("Google");
        Companie amazon = new Companie("Amazon");

        CompanieManager manager = new CompanieManager();
        manager.addCompanie(google);
        manager.addCompanie(amazon);

        Angajat angajat1 = new Angajat("Ana Ionescu", adresa1, google);
        Angajat angajat2 = new Angajat("Mihai Georgescu", adresa2, google);
        google.addEmployee(angajat1);
        google.addEmployee(angajat2);

        google.displayEmployeesAtAddress("București");

        manager.listEmployeesByCompanyName("Google");

        google.moveEmployee(angajat1, amazon);

        manager.listEmployeesByCompanyName("Amazon");
    }
}