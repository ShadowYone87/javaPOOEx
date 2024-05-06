import java.util.Scanner;
class MainSecondsByDay{
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        SecondsByDay sd = new SecondsByDay();
        System.out.println("Ingrese la cantidad de dias: ");
        sd.setD(num.nextInt());
        System.out.println("Ingrese el valor de un dia en segundos: ");
        sd.setS(num.nextDouble());
        System.out.println("La cantidad de segundos es: " + sd.convertirDíasASegundos());
        System.out.println(sd);

        sd.getD();
        sd.getS();
        num.close();
    }
}