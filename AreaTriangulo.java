class AreaTriangulo {
    /* Declara dos variables privadas de tipo double, llamadas base y altura */
    private double base;
    private double altura;

    /*
     * Define un constructor público que toma dos parámetros base y altura y los
     * asigna a las variables de instancia base y altura respectivamente
     */
    public AreaTriangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    /*
     * Define un método público llamado calcularArea() que devuelve un valor de tipo
     * double
     */
    public double calcularArea() {
        return (base * altura) / 2;
    }

    /*
     * Define un método público llamado getBase() que devuelve un valor de tipo
     * double
     */
    public double getBase() {
        return base;
    }

    /*
     * Define un método público llamado setBase() que toma un parámetro de tipo
     * double
     */
    public void setBase(double base) {
        this.base = base;
    }

    /*
     * Define un método público llamado getAltura() que devuelve un valor de tipo
     * double
     */
    public double getAltura() {
        return altura;
    }

    /*
     * Define un método público llamado setAltura() que toma un parámetro de tipo
     * double
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /* Define un método toString() público que devuelve un objeto String */
    @Override
    public String toString() {
        /*
         * Devuelve una representación de cadena de la clase AreaTriangulo, que incluye
         * los valores de los atributos base y altura
         */
        return "AreaTriangulo [base=" + base + ", altura=" + altura + "]";
    }
}