class ConversorDolares {
    /*
     * Aquí se declaran dos variables privadas de tipo double llamadas p y d. Estas
     * variables se utilizan para representar la cantidad de pesos y dólares,
     * respectivamente
     */
    private double p, d;

    /*
     * Esto define un método público llamado convertirPesosADolares(), que devuelve
     * un valor de tipo double. Este método calcula y devuelve la cantidad de
     * dólares equivalentes a la cantidad de pesos almacenados en p dividida por la
     * cantidad de dólares almacenados en d
     */
    public double convertirPesosADolares() {
        return (this.p / this.d);
    }

    /* Este método público llamado getP() devuelve la cantidad de pesos (p) */
    public double getP() {
        return p;
    }

    /*
     * Este método público llamado setP() establece la cantidad de pesos (p). Toma
     * un parámetro p de tipo double
     */
    public void setP(double p) {
        this.p = p;
    }

    /* Este método público llamado getD() devuelve la cantidad de dólares (d) */
    public double getD() {
        return d;
    }

    /*
     * Este método público llamado setD() establece la cantidad de dólares (d). Toma
     * un parámetro d de tipo double
     */
    public void setD(double d) {
        this.d = d;
    }

    /*
     * Esta anotación indica que el método que sigue sobrescribe un método de la
     * superclase (en este caso, Object)
     */
    @Override
    /*
     * Este método público sobrescribe el método toString() de la clase Object y
     * devuelve una representación en forma de cadena del objeto
     */
    public String toString() {
        /*
         * Esta línea devuelve una cadena que representa el objeto. Incluye la cantidad
         * de pesos (p) y la cantidad de dólares (d), así como el resultado de llamar al
         * método convertirPesosADolares(), que calcula la cantidad de dólares
         * equivalente a la cantidad de pesos
         */
        return "ConversorDolares [p=" + p + ", d=" + convertirPesosADolares() + "]";
    }
}