
/*Esta línea importa la clase Scanner del paquete java.util, que permite la lectura de datos desde la entrada estándar*/
import java.util.Scanner;

//Esto declara una clase pública llamada MainAreaCirculo.
public class MainAreaCirculo {
    /*
     * Este es el método principal de la clase MainAreaCirculo. Es el punto de
     * entrada de la aplicación
     */
    public static void main(String[] args) {
        /*
         * Se crea un objeto Scanner llamado 'num' para leer datos de la entrada
         * estándar (System.in)
         */
        Scanner num = new Scanner(System.in);
        /*
         * Se declara una variable de tipo double llamada 'radio' que será utilizada
         * para almacenar el valor del radio del círculo
         */
        double radio;
        /*
         * Inicio de un bucle do-while. Este bucle se ejecutará al menos una vez y
         * continuará ejecutándose mientras la condición entre paréntesis sea verdadera
         */
        do {
            /* Imprime un mensaje solicitando al usuario que ingrese el radio del círculo */
            System.out.print("Ingresa el radio del círculo (debe ser mayor que cero): ");
            /*
             * Inicio de un bucle while que se ejecuta mientras el próximo token en el
             * objeto Scanner 'num' no sea de tipo double
             */
            while (!num.hasNextDouble()) {
                /* Imprime un mensaje indicando al usuario que ingrese un número válido */
                System.out.println("Por favor, ingresa un número válido.");
                /*
                 * Llama al método next() del objeto Scanner 'num' para descartar el token no
                 * válido
                 */
                num.next();
            }
            /*
             * Lee un valor de tipo double ingresado por el usuario y lo asigna a la
             * variable 'radio'
             */
            radio = num.nextDouble();
            /*
             * Fin del bucle do-while. El bucle se repetirá mientras el valor del radio sea
             * menor o igual a cero
             */
        } while (radio <= 0);
        /*
         * Se crea un objeto de la clase AreaCirculo, pasando el radio como argumento al
         * constructor
         */
        AreaCirculo ac = new AreaCirculo(radio);
        /*
         * Se llama al método calcularArea() del objeto ac para calcular el área del
         * círculo y se guarda en la variable 'area'
         */
        double area = ac.calcularArea();
        /*
         * Imprime el resultado del cálculo del área del círculo junto con el valor del
         * radio
         */
        System.out.println("El área del círculo con radio " + radio + " es: " + area);
        /* Cierra el objeto Scanner 'num' para liberar los recursos asociados */
        num.close();
    }
}