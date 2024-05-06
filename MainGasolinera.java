import java.util.Scanner;
class MainGasolinera{
    public static void main(String[]args){
        Scanner num = new Scanner(System.in);
        Gasolinera g1 = new Gasolinera();
        System.out.println("Ingrese la cantidad de galones surtidos: ");
        g1.setG(num.nextDouble());
        System.out.println("El monto en litros es: "+ g1.convertirGalonesALitros());
        System.out.println(g1);
        g1.getG();
        num.close();
    }
}
