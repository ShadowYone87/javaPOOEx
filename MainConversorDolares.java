
/*Esta línea importa la clase Scanner del paquete java.util, que se utiliza para leer la entrada del usuario desde la consola*/
import java.util.Scanner;

/*Esta línea define una clase llamada MainConversorDolares. Las clases en Java son bloques de construcción fundamentales que se utilizan para definir objetos y sus comportamientos*/
class MainConversorDolares {
    /*
     * Esta línea define el método principal main, que es el punto de entrada de la
     * aplicación Java. El programa comienza a ejecutarse desde aquí. Toma un
     * argumento String[] args, que permite pasar argumentos desde la línea de
     * comandos
     */
    public static void main(String[] args) {
        /*
         * Esta línea crea un nuevo objeto Scanner llamado num, que se utilizará para
         * leer la entrada del usuario desde la consola
         */
        Scanner num = new Scanner(System.in);
        /*
         * Esta línea crea un nuevo objeto ConversorDolares llamado d1 utilizando el
         * constructor predeterminado de la clase ConversorDolares. Presumiblemente,
         * esta clase realiza conversiones de pesos a dólares
         */
        ConversorDolares d1 = new ConversorDolares();
        /*
         * Esta línea imprime un mensaje en la consola, solicitando al usuario que
         * ingrese la cantidad de pesos que desea convertir
         */
        System.out.println("Ingresa la cantidad de pesos");
        /*
         * Esta línea lee un número de tipo double ingresado por el usuario utilizando
         * el objeto num de tipo Scanner, y luego llama al método setP del objeto d1
         * para establecer la cantidad de pesos ingresada
         */
        d1.setP(num.nextDouble());
        /*
         * Esta línea imprime un mensaje en la consola, solicitando al usuario que
         * ingrese el valor actual del dólar
         */
        System.out.println("Ingresa el valor del dolar");
        /*
         * Esta línea lee un número de tipo double ingresado por el usuario utilizando
         * el objeto num de tipo Scanner, y luego llama al método setD del objeto d1
         * para establecer el valor del dólar ingresado
         */
        d1.setD(num.nextDouble());
        /*
         * Esta línea imprime en la consola el resultado de la conversión de pesos a
         * dólares, que es devuelto por el método convertirPesosADolares() del objeto d1
         */
        System.out.println("La conversion a dolares es: " + d1.convertirPesosADolares());
        /*
         * Esta línea imprime en la consola una representación textual del objeto d1,
         * que presumiblemente incluye tanto la cantidad de pesos como el valor del
         * dólar
         */
        System.out.println(d1);
        /*
         * Estas líneas llaman a los métodos getP() y getD() del objeto d1, pero no
         * hacen nada con los valores devueltos. Es posible que se hayan agregado por
         * error o con el propósito de imprimir los valores, pero como están
         * actualmente, no tienen ningún efecto
         */
        d1.getP();
        d1.getD();
        /*
         * Esta línea cierra el objeto Scanner num, liberando los recursos asociados con
         * él y evitando posibles fugas de memoria. Es una buena práctica cerrar los
         * objetos Scanner cuando ya no se necesitan
         */
        num.close();
    }
}