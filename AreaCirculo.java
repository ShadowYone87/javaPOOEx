class AreaCirculo {
    private double radio;
    private double result;

    AreaCirculo(double r) {
        radio = r;
    }
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double getResult() {
        return result;
    }
    public void setResult(double result) {
        this.result = result;
    }
    @Override
    public String toString() {
        return "AreaCirculo [radio=" + radio + ", result=" + calcularArea() + "]";
    }
}