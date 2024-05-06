class ConversorDolares{
    private double p,d;

    public double convertirPesosADolares(){
        return(this.p / this.d);
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "ConversorDolares [p=" + p + ", d=" + convertirPesosADolares() + "]";
    }
}