import java.util.Scanner;

public class ImpresionDatos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Por favor, ingresa tu edad: ");
        int edad = scanner.nextInt();

        System.out.print("Por favor, ingresa tu altura en metros: ");
        double altura = scanner.nextDouble();

        System.out.println("Hola " + nombre + ", tienes " + edad + " años y mides " + altura + " metros de altura.");

        scanner.close();
    }
}