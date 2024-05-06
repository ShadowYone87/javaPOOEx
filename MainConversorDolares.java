import java.util.Scanner;
class MainConversorDolares{
    public static void main(String[]args){
        Scanner num = new Scanner(System.in);
        ConversorDolares d1 = new ConversorDolares();
        System.out.println("Ingresa la cantidad de pesos");
        d1.setP(num.nextDouble());
        System.out.println("Ingresa el valor del dolar");
        d1.setD(num.nextDouble());
        System.out.println("La conversion a dolares es: " + d1.convertirPesosADolares());
        System.out.println(d1);
        d1.getP();
        d1.getD();
        num.close();
    }
}