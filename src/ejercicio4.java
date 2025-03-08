import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        // Crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicita al usuario su nombre, edad y altura
        System.out.print("Por favor, ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Por favor, ingresa tu edad: ");
        int edad = scanner.nextInt();

        System.out.print("Por favor, ingresa tu altura en metros: ");
        double altura = scanner.nextDouble();

        // Muestra un mensaje personalizado con los datos ingresados
        System.out.println("Hola " + nombre + ", tienes " + edad + " años y mides " + altura + " metros de altura.");

        // Cierra el objeto Scanner
        scanner.close();
    }
}