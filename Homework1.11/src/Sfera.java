class Sfera extends Shape3D {
    private String culoare;
    private double raza;

    public Sfera(String culoare, double raza) {
        this.culoare = culoare;
        this.raza = raza;
    }

    @Override
    public String getCuloare() {
        return culoare;
    }

   
    public double getPerimetru() {
        return 2 * Math.PI * raza; // Circumferința mare a sferei
    }

    @Override
    public double getAria() {
        return 4 * Math.PI * raza * raza;
    }

    @Override
    public double getVolum() {
        return (4.0 / 3.0) * Math.PI * Math.pow(raza, 3);
    }
}