class AreaCirculo {
    /*
     * Declara dos variables miembro privadas de tipo double llamadas radio y
     * result
     */
    private double radio;
    private double result;

    /*
     * Constructor de la clase AreaCirculo que toma un parámetro r de tipo double y
     * lo asigna al miembro radio
     */
    AreaCirculo(double r) {
        radio = r;
    }

    /*
     * Método público calcularArea() que calcula y devuelve el área del círculo
     * utilizando la fórmula π * radio^2
     */
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    /*
     * Método público getRadio() que devuelve el valor actual del radio del círculo
     */
    public double getRadio() {
        return radio;
    }

    /*
     * Método público setRadio(double radio) que establece el valor del radio del
     * círculo utilizando el valor pasado como argumento
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /*
     * Método público getResult() que devuelve el resultado actual. Este método
     * parece estar sin uso, ya que result nunca se establece en ningún lugar en el
     * código proporcionado
     */
    public double getResult() {
        return result;
    }

    /*
     * Método público setResult(double result) que establece el resultado utilizando
     * el valor pasado como argumento
     */
    public void setResult(double result) {
        this.result = result;
    }

    /*
     * Método toString() sobrescrito que devuelve una representación en forma de
     * cadena del objeto AreaCirculo, incluyendo el valor del radio y el resultado
     * del cálculo del área del círculo
     */
    @Override
    public String toString() {
        return "AreaCirculo [radio=" + radio + ", result=" + calcularArea() + "]";
    }
}