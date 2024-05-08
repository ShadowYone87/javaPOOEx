class Gasolinera {
    /*
     * Declara dos variables miembro privadas de tipo double llamadas g y l. Estas
     * variables representan los galones (g) y litros (l) respectivamente
     */
    private double g, l;

    /*
     * Define un método público llamado convertirGalonesALitros() que devuelve un
     * valor de tipo double. Este método convierte galones a litros usando la
     * fórmula (g * 3.78541) / 1 y retorna el resultado
     */
    public double convertirGalonesALitros() {
        /*
         * Dentro del método convertirGalonesALitros(), realiza la conversión de galones
         * a litros multiplicando el valor de g por 3.78541 (factor de conversión) y
         * luego dividiendo por 1 (operación redundante)
         */
        return (g * 3.78541) / 1;
    }

    /*
     * Define un método público llamado getG() que devuelve un valor de tipo double.
     * Este método retorna el valor actual de la variable g
     */
    public double getG() {
        return g;
    }

    /*
     * Define un método público llamado setG() que no devuelve ningún valor (void).
     * Este método establece el valor de la variable g según el valor pasado como
     * argumento
     */
    public void setG(double g) {
        this.g = g;
    }

    /*
     * Define un método público llamado getL() que devuelve un valor de tipo double.
     * Este método retorna el valor actual de la variable l
     */
    public double getL() {
        return l;
    }

    /*
     * Define un método público llamado setL() que no devuelve ningún valor (void).
     * Este método establece el valor de la variable l según el valor pasado como
     * argumento
     */
    public void setL(double l) {
        this.l = l;
    }

    /*
     * Anotación que indica que el método que sigue sobrescribe un método de la
     * superclase (en este caso, el método toString() de la clase Object)
     */
    @Override
    /*
     * Define el método toString(), que devuelve un valor de tipo String. Este
     * método proporciona una representación en forma de cadena de la instancia de
     * la clase Gasolinera
     */
    public String toString() {
        /*
         * Dentro del método toString(), crea y retorna una cadena que representa el
         * estado actual del objeto Gasolinera, incluyendo los valores de g y l, así
         * como el resultado de llamar al método convertirGalonesALitros() para mostrar
         * los litros
         */
        return "Gasolinera [g=" + g + ", l=" + convertirGalonesALitros() + "]";
    }
}