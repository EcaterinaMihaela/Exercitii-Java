import java.util.ArrayList;
import java.util.List;

class CompanieManager {
    private List<Companie> companii;

    public CompanieManager() {
        this.companii = new ArrayList<>();
    }

    public void addCompanie(Companie companie) {
        companii.add(companie);
    }

    public Companie findCompanieByName(String nume) {
        for (Companie companie : companii) {
            if (companie.getNume().equalsIgnoreCase(nume)) {
                return companie;
            }
        }
        return null;
    }

    public void listEmployeesByCompanyName(String nume) {
        Companie companie = findCompanieByName(nume);
        if (companie != null) {
            System.out.println("Angajați la compania " + nume + ":");
            for (Angajat angajat : companie.getAngajati()) {
                System.out.println(angajat);
            }
        } else {
            System.out.println("Compania " + nume + " nu a fost găsită.");
        }
    }
}
