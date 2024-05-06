import java.util.Scanner;
public class MainAreaCirculo {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        double radio;
        
        do {
            System.out.print("Ingresa el radio del círculo (debe ser mayor que cero): ");
            while (!num.hasNextDouble()) {
                System.out.println("Por favor, ingresa un número válido.");
                num.next();
            }
            radio = num.nextDouble();
        } while (radio <= 0);

        AreaCirculo ac = new AreaCirculo(radio);
        double area = ac.calcularArea();
        System.out.println("El área del círculo con radio " + radio + " es: " + area);
        
        num.close();
    }
}