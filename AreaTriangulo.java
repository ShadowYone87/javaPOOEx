class AreaTriangulo {
    private double base;
    private double altura;

    public AreaTriangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public double calcularArea() {
        return (base * altura) / 2;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    @Override
    public String toString() {
        return "AreaTriangulo [base=" + base + ", altura=" + altura + "]";
    }
}