
/*Esta línea importa la clase Scanner del paquete java.util, que proporciona métodos para leer datos de entrada del usuario*/
import java.util.Scanner;

/*Define una clase llamada MainEstudiante, que es pública y puede ser accedida desde otras clases*/
public class MainEstudiante {
    /*
     * Este es el método principal (main) que marca el punto de entrada del
     * programa. Toma un array de strings (args) como argumento, que puede contener
     * argumentos pasados al programa desde la línea de comandos
     */
    public static void main(String[] args) {
        /*
         * Crea un nuevo objeto Scanner llamado opc, que se utilizará para leer la
         * entrada del usuario desde la consola
         */
        Scanner opc = new Scanner(System.in);
        /*
         * Muestra un mensaje en la consola pidiendo al usuario que ingrese el nombre
         * del estudiante
         */
        System.out.println("Ingrese el nombre del estudiante:");
        /*
         * Lee la entrada del usuario (el nombre del estudiante) y la almacena en la
         * variable name
         */
        String name = opc.nextLine();
        /*
         * Muestra un mensaje en la consola pidiendo al usuario que ingrese la edad del
         * estudiante
         */
        System.out.println("Ingrese la edad del estudiante:");
        /*
         * Lee la entrada del usuario (la edad del estudiante) y la almacena en la
         * variable age
         */
        int age = opc.nextInt();
        /*
         * Muestra un mensaje en la consola pidiendo al usuario que ingrese la
         * calificación del estudiante
         */
        System.out.println("Ingrese la calificación del estudiante:");
        /*
         * Lee la entrada del usuario (la calificación del estudiante) y la almacena en
         * la variable score
         */
        float score = opc.nextFloat();
        /*
         * Crea un nuevo objeto Estudiante llamado e1, utilizando el nombre, edad y
         * calificación ingresados por el usuario
         */
        Estudiante e1 = new Estudiante(name, age, score);
        /*
         * Muestra un mensaje en la consola indicando que se mostrará la información del
         * estudiante
         */
        System.out.println("La informacion del estudiante es: ");
        /*
         * Llama al método imprimirDetalles() del objeto e1 para imprimir los detalles
         * del estudiante en la consola
         */
        e1.imprimirDetalles();
        /*
         * Imprime la representación de cadena del objeto e1 en la consola. Esto invoca
         * el método toString() de la clase Estudiante
         */
        System.out.println(e1);
        /*
         * Cierra el objeto Scanner opc para liberar recursos asociados con la lectura
         * de entrada del usuario
         */
        opc.close();
    }
}