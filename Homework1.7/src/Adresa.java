class Adresa {
    private String strada;
    private String oras;
    private String codPostal;

    public Adresa(String strada, String oras, String codPostal) {
        this.strada = strada;
        this.oras = oras;
        this.codPostal = codPostal;
    }

    public String getOras() {
        return oras;
    }

    @Override
    public String toString() {
        return strada + ", " + oras + ", " + codPostal;
    }
}