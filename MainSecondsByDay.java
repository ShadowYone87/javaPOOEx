
/*Esta línea importa la clase Scanner del paquete java.util, que es utilizada para obtener la entrada del usuario desde la consola*/
import java.util.Scanner;

/*Esto define una nueva clase llamada MainSecondsByDay. Esta clase contiene el método main, que es el punto de entrada del programa*/
class MainSecondsByDay {
    /*
     * Este es el método principal del programa. Es el punto de entrada cuando el
     * programa se ejecuta. Recibe argumentos como una matriz de cadenas (args),
     * pero en este caso no se están utilizando
     */
    public static void main(String[] args) {
        /*
         * Se crea un nuevo objeto de tipo Scanner llamado num, que se utiliza para leer
         * la entrada del usuario desde el sistema de entrada estándar (System.in)
         */
        Scanner num = new Scanner(System.in);
        /*
         * Se crea un nuevo objeto de tipo SecondsByDay llamado sd. No está claro qué
         * hace este objeto sin ver la implementación de la clase SecondsByDay, pero
         * parece que será utilizado para realizar alguna operación relacionada con la
         * conversión de días a segundos
         */
        SecondsByDay sd = new SecondsByDay();
        /*
         * Esto imprime un mensaje en la consola pidiendo al usuario que ingrese la
         * cantidad de días
         */
        System.out.println("Ingrese la cantidad de dias: ");
        /*
         * Se llama al método setD del objeto sd para establecer la cantidad de días
         * ingresada por el usuario utilizando el método nextInt() del objeto Scanner
         * num
         */
        sd.setD(num.nextInt());
        /*
         * Se imprime un mensaje pidiendo al usuario que ingrese el valor de un día en
         * segundos
         */
        System.out.println("Ingrese el valor de un dia en segundos: ");
        /*
         * Se llama al método setS del objeto sd para establecer el valor de un día en
         * segundos ingresado por el usuario utilizando el método nextDouble() del
         * objeto Scanner num
         */
        sd.setS(num.nextDouble());
        /*
         * Se imprime la cantidad de segundos calculada utilizando el método
         * convertirDíasASegundos() del objeto sd
         */
        System.out.println("La cantidad de segundos es: " + sd.convertirDíasASegundos());
        /*
         * Se imprime el objeto sd. Esto imprimirá lo que sea que se haya definido en el
         * método toString() de la clase SecondsByDay, que normalmente imprimirá
         * información relevante sobre el objeto
         */
        System.out.println(sd);
        /*
         * Se llama al método getD() del objeto sd, pero el valor devuelto no se asigna
         * ni se imprime, por lo que no tiene ningún efecto observable en el programa
         */
        sd.getD();
        /*
         * Se llama al método getS() del objeto sd, pero al igual que la línea anterior,
         * el valor devuelto no se asigna ni se imprime, por lo que no tiene ningún
         * efecto observable en el programa
         */
        sd.getS();
        /*
         * Se cierra el objeto Scanner num para liberar los recursos asociados con la
         * entrada del usuario
         */
        num.close();
    }
}