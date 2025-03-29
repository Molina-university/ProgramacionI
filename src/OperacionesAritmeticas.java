import java.util.InputMismatchException;
import java.util.Scanner;

public class OperacionesAritmeticas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que introduzca dos números
        System.out.println("Introduce el primer número:");
        double num1 = pedirNumero(scanner);

        System.out.println("Introduce el segundo número:");
        double num2 = pedirNumero(scanner);

        // Realizar las operaciones aritméticas básicas
        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division = num2 != 0 ? num1 / num2 : Double.NaN;
        double modulo = num2 != 0 ? num1 % num2 : Double.NaN;

        // Mostrar los resultados
        System.out.println("Suma: " + num1 + " + " + num2 + " = " + suma);
        System.out.println("Resta: " + num1 + " - " + num2 + " = " + resta);
        System.out.println("Multiplicación: " + num1 + " * " + num2 + " = " + multiplicacion);
        System.out.println("División: " + num1 + " / " + num2 + " = " + (division == Double.NaN ? "No se puede dividir por cero" : division));
        System.out.println("Módulo: " + num1 + " % " + num2 + " = " + (modulo == Double.NaN ? "No se puede dividir por cero" : modulo));
    }

    /**
     * Pide al usuario que introduzca un número y lo devuelve.
     * 
     * @param scanner el objeto Scanner para leer la entrada del usuario
     * @return el número introducido por el usuario
     */
    private static double pedirNumero(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("No has introducido un número válido. Por favor, inténtalo de nuevo.");
                scanner.next(); // Limpiar la entrada incorrecta
            }
        }
    }
}