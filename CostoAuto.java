class CostoAuto {
    /*
     * Declara 3 variables privadas de tipo int(entero) y double llamada
     * costoVehiculo, porcentajeGanancia e impuesto
     */
    private int costoVehiculo;
    private double porcentajeGanancia;
    private double impuesto;

    /*
     * Define un constructor público para la clase CostoAuto que toma tres
     * parámetros: costoVehiculo, porcentajeGanancia e impuesto
     */
    public CostoAuto(int costoVehiculo, double porcentajeGanancia, double impuesto) {
        this.costoVehiculo = costoVehiculo;
        this.porcentajeGanancia = porcentajeGanancia;
        this.impuesto = impuesto;
    }

    /*
     * Define un método público llamado calcularCostoFinal que devuelve un valor de
     * tipo double
     */
    public double calcularCostoFinal() {
        /*
         * Calcula el costo final del vehículo agregando el porcentaje de ganancia al
         * costo del vehículo
         */
        double costoFinal = costoVehiculo * (1 + porcentajeGanancia / 100);
        /* Calcula el costo final multiplicándolo por el impuesto */
        costoFinal *= (1 + impuesto / 100);
        return costoFinal;
    }

    /*
     * Define un método público llamado getCostoVehiculo que devuelve un valor de
     * tipo entero
     */
    public int getCostoVehiculo() {
        return costoVehiculo;
    }

    /* Devuelve el valor de la variable de instancia costoVehiculo */
    public void setCostoVehiculo(int costoVehiculo) {
        this.costoVehiculo = costoVehiculo;
    }

    /*
     * Define un método público llamado setCostoVehiculo que toma un parámetro de
     * tipo entero
     */
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
    /*
     * Define un método público llamado toString que devuelve un valor de tipo
     * String
     */
    public String toString() {
        /*
         * Devuelve una cadena que representa el objeto CostoAuto, incluyendo sus
         * variables de instancia
         */
        return "CostoAuto [costoVehiculo=" + costoVehiculo + ", porcentajeGanancia=" + porcentajeGanancia
                + ", impuesto=" + impuesto + "]";
    }
}