import java.util.ArrayList;
import java.util.List;

class Companie {
    private String nume;
    private List<Angajat> angajati;

    public Companie(String nume) {
        this.nume = nume;
        this.angajati = new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public List<Angajat> getAngajati() {
        return angajati;
    }

    // Adăugare angajat
    public void addEmployee(Angajat angajat) {
        angajati.add(angajat);
        angajat.setCompanie(this);
        System.out.println("Angajatul " + angajat.getNume() + " a fost adăugat la compania " + nume);
    }

    // Mutare angajat la altă companie
    public void moveEmployee(Angajat angajat, Companie nouaCompanie) {
        if (angajati.remove(angajat)) {
            nouaCompanie.addEmployee(angajat);
            System.out.println("Angajatul " + angajat.getNume() + " a fost mutat la compania " + nouaCompanie.getNume());
        }
    }

    // Afișare adrese ale angajaților care lucrează într-un anumit oraș
    public void displayEmployeesAtAddress(String oras) {
        System.out.println("Angajați la compania " + nume + " care locuiesc în " + oras + ":");
        for (Angajat angajat : angajati) {
            if (angajat.getAdresa().getOras().equalsIgnoreCase(oras)) {
                System.out.println(angajat.getNume() + " - " + angajat.getAdresa());
            }
        }
    }
}