class CostoAuto{
    private int costoVehiculo;
    private double porcentajeGanancia;
    private double impuesto;
    
    public CostoAuto(int costoVehiculo, double porcentajeGanancia, double impuesto) {
        this.costoVehiculo = costoVehiculo;
        this.porcentajeGanancia = porcentajeGanancia;
        this.impuesto = impuesto;
    }
    public double calcularCostoFinal() {
        double costoFinal = costoVehiculo * (1 + porcentajeGanancia / 100);
        costoFinal *= (1 + impuesto / 100);
        return costoFinal;
    }
    public int getCostoVehiculo() {
        return costoVehiculo;
    }
    public void setCostoVehiculo(int costoVehiculo) {
        this.costoVehiculo = costoVehiculo;
    }
    public double getPorcentajeGanancia() {
        return porcentajeGanancia;
    }
    public void setPorcentajeGanancia(double porcentajeGanancia) {
        this.porcentajeGanancia = porcentajeGanancia;
    }
    public double getImpuesto() {
        return impuesto;
    }
    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }
    @Override
    public String toString() {
        return "CostoAuto [costoVehiculo=" + costoVehiculo + ", porcentajeGanancia=" + porcentajeGanancia
                + ", impuesto=" + impuesto + "]";
    }
} 