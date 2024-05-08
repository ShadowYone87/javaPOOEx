class Estudiante {
    /*
     * Declara tres variables miembro privadas de la clase para almacenar el nombre
     * del estudiante, su edad y su calificación
     */
    private String name;
    private int age;
    private float score;

    /*
     * Declara un constructor público para la clase "Estudiante" que acepta tres
     * parámetros: el nombre, la edad y la calificación del estudiante
     */
    public Estudiante(String name, int age, float score) {
        this.name = name;
        /*
         * Verifica si la edad proporcionada es menor que 0. Si es así, imprime un
         * mensaje de advertencia y establece la edad en 0. Si no, asigna el valor de la
         * edad proporcionada al atributo "age" de la instancia actual
         */
        if (age < 0) {
            System.out.println("Edad inválida. Se asignará 0.");
            this.age = 0;
        } else {
            this.age = age;
        }
        /*
         * Verifica si la calificación proporcionada es menor que 0. Si es así, imprime
         * un mensaje de advertencia y establece la calificación en 0. Si no, asigna el
         * valor de la calificación proporcionada al atributo "score" de la instancia
         * actual
         */
        if (score < 0) {
            System.out.println("Calificación inválida. Se asignará 0.");
            this.score = 0;
        } else {
            this.score = score;
        }
    }

    /*
     * Declara un método público llamado "imprimirDetalles()" que no devuelve ningún
     * valor
     */
    public void imprimirDetalles() {
        /*
         * Imprime en la consola los detalles del estudiante, incluyendo su nombre, edad
         * y calificación
         */
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
        System.out.println("Calificación: " + score);
    }

    /*
     * Declara un método público para obtener el nombre del estudiante y otro para
     * establecerlo
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
     * Declara un método público para obtener la edad del estudiante y otro para
     * establecerla
     */
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*
     * Declara un método público para obtener la calificación del estudiante y otro
     * para establecerla
     */
    public double getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    /*
     * Sobrescribe el método "toString()" de la clase Object para devolver una
     * representación de cadena de los detalles del estudiante
     */
    @Override
    public String toString() {
        return "Estudiante [name=" + name + ", age=" + age + ", score=" + score + "]";
    }
}