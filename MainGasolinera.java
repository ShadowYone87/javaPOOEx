
/*Esta línea importa la clase Scanner del paquete java.util, que se utiliza para leer la entrada del usuario desde la consola*/
import java.util.Scanner;

//Define una clase llamada MainGasolinera
class MainGasolinera {
    /*
     * Define el método principal main, que es el punto de entrada del programa.
     * Toma un array de cadenas como argumento (que generalmente se utiliza para
     * pasar argumentos de línea de comandos al programa)
     */
    public static void main(String[] args) {
        /*
         * Crea un nuevo objeto Scanner llamado num que leerá la entrada del usuario
         * desde el sistema de entrada estándar (en este caso, la consola)
         */
        Scanner num = new Scanner(System.in);
        /* Crea un nuevo objeto de la clase Gasolinera y lo asigna a la variable g1 */
        Gasolinera g1 = new Gasolinera();
        /*
         * Imprime un mensaje solicitando al usuario que ingrese la cantidad de galones
         * surtidos
         */
        System.out.println("Ingrese la cantidad de galones surtidos: ");
        /*
         * Llama al método setG del objeto g1 para establecer la cantidad de galones
         * utilizando el valor proporcionado por el usuario (leído con nextDouble() del
         * objeto num)
         */
        g1.setG(num.nextDouble());
        /*
         * Imprime un mensaje mostrando el resultado de convertir la cantidad de galones
         * a litros, utilizando el método convertirGalonesALitros() del objeto g1
         */
        System.out.println("El monto en litros es: " + g1.convertirGalonesALitros());
        /*
         * Imprime una representación de cadena del objeto g1, que probablemente se basa
         * en la implementación del método toString() de la clase Gasolinera
         */
        System.out.println(g1);
        /*
         * Llama al método getG() del objeto g1, pero el valor devuelto no se utiliza ni
         * se imprime, por lo que esta línea no tiene ningún efecto aparente
         */
        g1.getG();
        /*
         * Cierra el objeto Scanner num, liberando los recursos asociados con la lectura
         * de la entrada del usuario
         */
        num.close();
    }
}
