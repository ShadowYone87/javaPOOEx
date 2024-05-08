import java.util.Scanner;

class MainPassword {
    public static void main(String[] args) {
        Scanner opc = new Scanner(System.in);
        // Introducimos el tamaño del array y la longitud del password
        System.out.print("Introduce la longitud de las contraseñas: ");
        int longitud = opc.nextInt();
        System.out.print("Introduce la cantidad de contraseñas a generar: ");
        int cantidad = opc.nextInt();
        // Creamos los arrays
        Password[] contraseñas = new Password[cantidad];
        boolean[] esFuerteArray = new boolean[cantidad];
        // Creamos objetos, indicamos si es fuerte y mostramos la contraseña y su
        // fortaleza.
        for (int i = 0; i < cantidad; i++) {
            contraseñas[i] = new Password(longitud);
            esFuerteArray[i] = contraseñas[i].esFuerte();
        }
        for (int i = 0; i < cantidad; i++) {
            System.out.println(contraseñas[i].getContraseña() + " " + esFuerteArray[i]);
        }
        opc.close();
    }
}