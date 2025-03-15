class Cub extends Shape3D {
    private String culoare;
    private double latura;

    public Cub(String culoare, double latura) {
        this.culoare = culoare;
        this.latura = latura;
    }

    @Override
    public String getCuloare() {
        return culoare;
    }

    @Override
    public double getPerimetru() {
        return 12 * latura;
    }

    @Override
    public double getAria() {
        return 6 * latura * latura;
    }

    @Override
    public double getVolum() {
        return latura * latura * latura;
    }
}