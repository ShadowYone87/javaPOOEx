import java.util.Scanner;
public class MainEstudiante {
    public static void main(String[] args) {
        Scanner opc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante:");
        String name = opc.nextLine();
        System.out.println("Ingrese la edad del estudiante:");
        int age = opc.nextInt();
        System.out.println("Ingrese la calificación del estudiante:");
        float score = opc.nextFloat();
        Estudiante e1 = new Estudiante(name, age, score);
        System.out.println("La informacion del estudiante es: ");
        e1.imprimirDetalles();
        System.out.println(e1);

        opc.close();
    }
}