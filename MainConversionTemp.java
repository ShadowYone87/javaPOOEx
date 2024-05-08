
/*Esta línea importa la clase Scanner del paquete java.util, que se utiliza para leer la entrada del usuario desde la consola*/
import java.util.Scanner;

/*Aquí se define una clase llamada MainConversionTemp. Esta clase contiene el método principal main que es el punto de entrada de la aplicación*/
class MainConversionTemp {
    /*
     * Este es el método principal de la aplicación. Es estático (static), lo que
     * significa que pertenece a la clase en lugar de a una instancia particular de
     * la clase. Toma un arreglo de cadenas (String[] args) como argumento, que son
     * los argumentos pasados a la aplicación cuando se ejecuta desde la línea de
     * comandos
     */
    public static void main(String[] args) {
        /*
         * Se crea una instancia de la clase Scanner llamada sc, que se utiliza para
         * leer la entrada del usuario desde la consola (System.in)
         */
        Scanner sc = new Scanner(System.in);
        /*
         * Lee un número de punto flotante ingresado por el usuario desde la consola y
         * lo asigna a la variable grados
         */
        float grados;
        /*
         * Este comando imprime el mensaje "Ingrese los grados centigrados: " en la
         * consola, solicitando al usuario que ingrese los grados centígrados
         */
        System.out.println("Ingrese los grados centigrados: ");
        /*
         * Lee un número de punto flotante ingresado por el usuario desde la consola y
         * lo asigna a la variable grados
         */
        grados = sc.nextFloat();
        // Se crea el objeto temp
        ConversionTemp temp = new ConversionTemp();
        /*
         * Se llama al método setGrados() del objeto temp para establecer los grados
         * centígrados ingresados por el usuario
         */
        temp.setGrados(grados);
        /*
         * Imprime un mensaje indicando que se realizará la conversión de grados
         * centígrados a grados Fahrenheit
         */
        System.out.println("Conversion de grados centigrados a fahrenheit");
        /*
         * Imprime el resultado de la conversión de grados centígrados a grados
         * Fahrenheit. temp.mostrarGrados() es un método que devuelve los grados
         * Fahrenheit calculados y se concatena con la cadena de texto para imprimir el
         * resultado completo
         */
        System.out.println(+grados + "  Grados Centigrados son  " + temp.mostrarGrados() + "  Grados Fahrenheit");
    }
}