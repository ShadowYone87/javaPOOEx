import java.util.Scanner;
public class MainAreaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base, altura;
        do {
            System.out.print("Ingrese la base del triángulo: ");
            base = scanner.nextDouble();
        } while (base <= 0);

        do {
            System.out.print("Ingrese la altura del triángulo: ");
            altura = scanner.nextDouble();
        } while (altura <= 0);
        AreaTriangulo triangulo = new AreaTriangulo(base, altura);
        System.out.println("El área del triángulo es: " + triangulo.calcularArea());

        scanner.close();
    }
}