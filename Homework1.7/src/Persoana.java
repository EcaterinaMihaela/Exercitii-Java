abstract class Persoana {
    protected String nume;
    protected Adresa adresa;

    public Persoana(String nume, Adresa adresa) {
        this.nume = nume;
        this.adresa = adresa;
    }

    public String getNume() {
        return nume;
    }

    public Adresa getAdresa() {
        return adresa;
    }

    public void setAdresa(Adresa nouaAdresa) {
        this.adresa = nouaAdresa;
    }
}