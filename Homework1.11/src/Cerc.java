class Cerc extends Shape2D {
    private String culoare;
    private double raza;

    public Cerc(String culoare, double raza) {
        this.culoare = culoare;
        this.raza = raza;
    }

    @Override
    public String getCuloare() {
        return culoare;
    }

    @Override
    public double getPerimetru() {
        return 2 * Math.PI * raza;
    }

    @Override
    public double getAria() {
        return Math.PI * raza * raza;
    }
}