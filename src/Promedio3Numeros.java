import java.util.Scanner;

public class Promedio3Numeros {
    public static void main(String[] args) {
        // Crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicita al usuario que ingrese tres números
        System.out.print("Por favor, ingresa el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Por favor, ingresa el segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Por favor, ingresa el tercer número: ");
        double numero3 = scanner.nextDouble();

        // Calcula la media de los tres números
        double media = (numero1 + numero2 + numero3) / 3;

        // Muestra el resultado
        System.out.println("La media de los tres números es: " + media);

        // Cierra el objeto Scanner
        scanner.close();
    }
}