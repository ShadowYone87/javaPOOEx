class Gasolinera {
    private double g, l;
    public double convertirGalonesALitros(){
        return(g * 3.78541)/1;   
    }
    public double getG() {
        return g;
    }
    public void setG(double g) {
        this.g = g;
    }
    public double getL() {
        return l;
    }
    public void setL(double l) {
        this.l = l;
    }
    @Override
    public String toString() {
        return "Gasolinera [g=" + g + ", l=" + convertirGalonesALitros() + "]";
    }
}