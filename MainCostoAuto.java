import java.util.Scanner;
class MainCostoAuto{
    public static void main(String[]args){
    Scanner num = new Scanner(System.in);
    System.out.print("Ingrese el costo del vehículo: ");
    int costoVehiculo = num.nextInt();

    double porcentajeGanancia = 12;
    double impuesto = 6;

    CostoAuto a1 = new CostoAuto(costoVehiculo, porcentajeGanancia, impuesto);
    double costoFinal = a1.calcularCostoFinal();
    
    System.out.println("El costo final para el consumidor es: $" + costoFinal);

        num.close();
    }
}