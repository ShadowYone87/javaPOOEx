//Define una nueva clase llamada SecondsByDay
class SecondsByDay {
    /*
     * Declara 2 variables miembro privadas llamadas d de tipo entero y s de tipo
     * double
     */
    private int d;
    private double s;

    /*
     * Declara un método público llamado convertirDíasASegundos() que convierte días
     * en segundos y devuelve el resultado como un número de tipo doble
     */
    public double convertirDíasASegundos() {
        /*
         * En este método, multiplica el número de días (d) por 24 (horas por día) y
         * luego por 3600 (segundos por hora) para obtener el total de segundos. La
         * división por 1 es redundante y no tiene efecto
         */
        return (d * 24 * 3600) / 1;
    }

    /*
     * Declara un método público llamado getD() que devuelve el valor de la variable
     * d
     */
    public int getD() {
        return d;
    }

    /*
     * Declara un método público llamado setD(int d) que asigna un nuevo valor a la
     * variable d
     */
    public void setD(int d) {
        this.d = d;
    }

    /*
     * Declara un método público llamado getS() que devuelve el valor de la variable
     * s
     */
    public double getS() {
        return s;
    }

    /*
     * Declara un método público llamado setS(double s) que asigna un nuevo valor a
     * la variable s
     */
    public void setS(double s) {
        this.s = s;
    }

    /* Indica que el método siguiente sobrescribe un método de la clase padre */
    @Override
    /*
     * Declara un método público llamado toString() que devuelve una representación
     * de cadena de la clase
     */
    public String toString() {
        /*
         * Retorna una cadena que representa el objeto, mostrando los valores de las
         * variables d y s, así como el resultado de la conversión de días a segundos
         * mediante el método convertirDíasASegundos()
         */
        return "SecondsByDay [d=" + d + ", s=" + convertirDíasASegundos() + "]";
    }
}