
/*Esta línea importa la clase Scanner del paquete java.util. Scanner se utiliza para obtener la entrada del usuario desde la consola*/
import java.util.Scanner;

//Aquí se declara una clase llamada MainCostoAuto
class MainCostoAuto {
    /*
     * Esta línea declara el método principal (main) que es el punto de entrada del
     * programa. Toma un array de cadenas como argumento
     */
    public static void main(String[] args) {
        /*
         * Aquí se crea un nuevo objeto Scanner llamado "num" que está asociado con la
         * entrada estándar del sistema (System.in). Esto se utilizará para obtener la
         * entrada del usuario desde la consola
         */
        Scanner num = new Scanner(System.in);
        /*
         * Esta línea imprime un mensaje en la consola solicitando al usuario que
         * ingrese el costo del vehículo
         */
        System.out.print("Ingrese el costo del vehículo: ");
        /*
         * Aquí se lee el próximo entero ingresado por el usuario utilizando el objeto
         * Scanner "num" y se asigna a la variable "costoVehiculo"
         */
        int costoVehiculo = num.nextInt();
        /*
         * Se declara una variable "porcentajeGanancia" y se le asigna el valor 12. Este
         * es el porcentaje de ganancia que se agregará al costo del vehículo
         */
        double porcentajeGanancia = 12;
        /*
         * Se declara una variable "impuesto" y se le asigna el valor 6. Este es el
         * impuesto que se aplicará al costo del vehículo
         */
        double impuesto = 6;
        /*
         * Se crea un nuevo objeto de la clase CostoAuto llamado "a1", utilizando el
         * constructor de CostoAuto y pasando como argumentos el costo del vehículo, el
         * porcentaje de ganancia y el impuesto
         */
        CostoAuto a1 = new CostoAuto(costoVehiculo, porcentajeGanancia, impuesto);
        /*
         * Se llama al método "calcularCostoFinal()" del objeto "a1" para calcular el
         * costo final del vehículo para el consumidor, y el resultado se asigna a la
         * variable "costoFinal"
         */
        double costoFinal = a1.calcularCostoFinal();
        /*
         * Se imprime en la consola el mensaje "El costo final para el consumidor es: $"
         * seguido del valor de la variable "costoFinal"
         */
        System.out.println("El costo final para el consumidor es: $" + costoFinal);
        /*
         * Se cierra el objeto Scanner "num" para liberar los recursos utilizados por él
         */
        num.close();
    }
}