import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {

        // Crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicita los tres números al usuario
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Ingrese el tercer número: ");
        double num3 = scanner.nextDouble();

        // Determina cuál es el mayor de los tres números
        if (num1 > num2 && num1 > num3) {
            System.out.println("El mayor de los tres números es " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El mayor de los tres números es " + num2);
        } else {
            System.out.println("El mayor de los tres números es " + num3);
        }

        // Cierra el objeto Scanner
        scanner.close();
    }
}
