// Clasa Patrat (extinde Shape2D)
class Patrat extends Shape2D {
    private String culoare;
    private double latura;

    public Patrat(String culoare, double latura) {
        this.culoare = culoare;
        this.latura = latura;
    }

    @Override
    public String getCuloare() {
        return culoare;
    }

    @Override
    public double getPerimetru() {
        return 4 * latura;
    }

    @Override
    public double getAria() {
        return latura * latura;
    }
}
