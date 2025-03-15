
public class Persoana 
{
	protected String nume;
    protected Adresa adresa;

    public Persoana(String nume, Adresa adresa) {
        this.nume = nume;
        this.adresa = adresa;
    }

	public void setAdresa(Adresa nouaAdresa) {
        this.adresa = nouaAdresa;
    }

    public String getNume() {
        return nume;
    }
}
