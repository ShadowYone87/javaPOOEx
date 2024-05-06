class SecondsByDay{
    private int d;
    private double s;

    public double convertirDíasASegundos(){
        return(d*24*3600)/1;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }
    @Override
    public String toString() {
        return "SecondsByDay [d=" + d + ", s=" + convertirDíasASegundos() + "]";
    }
}