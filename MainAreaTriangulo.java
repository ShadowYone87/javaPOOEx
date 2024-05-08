import java.util.Scanner;

public class MainAreaTriangulo {
    /*
     * Declara el método main, que es el punto de entrada del programa. Este método
     * recibe un array de cadenas como argumento, aunque en este caso no se utiliza
     */
    public static void main(String[] args) {
        /*
         * Crea una nueva instancia de la clase Scanner, que se utilizará para leer la
         * entrada del usuario desde la consola
         */
        Scanner scanner = new Scanner(System.in);
        /*
         * Declara dos variables de tipo double llamadas base y altura, que se
         * utilizarán para almacenar los valores de la base y altura del triángulo
         */
        double base, altura;
        /*
         * Este bucle se ejecutará al menos una vez y continuará repitiéndose mientras
         * la condición especificada sea verdadera
         */
        do {
            /*
             * Imprime en la consola la solicitud para que el usuario ingrese la base del
             * triángulo
             */
            System.out.print("Ingrese la base del triángulo: ");
            /*
             * Lee un valor de tipo double ingresado por el usuario desde la consola y lo
             * asigna a la variable base
             */
            base = scanner.nextDouble();
            /*
             * Cierra el bucle do-while. Si el valor ingresado por el usuario para la base
             * es menor o igual a cero, el bucle se repetirá.
             */
        } while (base <= 0);
        // Se repite el bucle para la altura
        do {
            System.out.print("Ingrese la altura del triángulo: ");
            altura = scanner.nextDouble();
        } while (altura <= 0);
        /*
         * Crea una nueva instancia de la clase AreaTriangulo, que representa un
         * triángulo con una base y altura específicas, utilizando los valores
         * ingresados por el usuario
         */
        AreaTriangulo triangulo = new AreaTriangulo(base, altura);
        /*
         * Imprime en la consola el mensaje "El área del triángulo es: " seguido del
         * resultado del método calcularArea() de la instancia triangulo, que devuelve
         * el área del triángulo
         */
        System.out.println("El área del triángulo es: " + triangulo.calcularArea());
        /*
         * Cierra el objeto Scanner para liberar los recursos asociados con la entrada
         * del usuario desde la consola
         */
        scanner.close();
    }
}