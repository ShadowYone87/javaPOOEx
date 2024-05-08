//Declara una clase llamada ConversionTemp
class ConversionTemp {
    /*
     * Declara una variable de instancia (campo) llamada grados que es de tipo float
     * y es privada, lo que significa que solo se puede acceder a ella desde dentro
     * de la clase
     */
    private float grados;

    /*
     * Constructor de la clase ConversionTemp que no recibe argumentos. Este
     * constructor no realiza ninguna acción específica
     */
    ConversionTemp() {
    }

    /*
     * Declara un método público llamado mostrarGrados que devuelve un valor de tipo
     * float
     */
    public float mostrarGrados() {
        /*
         * Devuelve el valor de grados convertido a grados Fahrenheit utilizando la
         * fórmula de conversión de temperatura de Celsius a Fahrenheit
         */
        return this.grados * 9 / 5 + 32;
    }

    /*
     * Declara un método público llamado getGrados que devuelve un valor de tipo
     * float
     */
    public float getGrados() {
        return grados;
    }

    /*
     * Declara un método público llamado setGrados que no devuelve ningún valor y
     * toma un parámetro de tipo float llamado grados
     */
    public void setGrados(float grados) {
        this.grados = grados;
    }

    /*
     * Anotación utilizada para indicar que el método que sigue sobrescribe un
     * método de la clase base
     */
    @Override
    /*
     * Declara un método público llamado toString que devuelve un valor de tipo
     * String
     */
    public String toString() {
        /*
         * Devuelve una cadena que representa el objeto ConversionTemp, incluyendo el
         * valor actual de grados. Esta cadena tiene el formato
         * "ConversionTemp [grados=valor_de_grados]"
         */
        return "ConversionTemp [grados=" + grados + "]";
    }

}
