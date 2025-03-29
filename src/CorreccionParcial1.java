import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CorreccionParcial1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> usuarios = new ArrayList<>();
        List<Integer> edades = new ArrayList<>();

        System.out.println("Número de usuarios a ingresar:");
        int numUsuarios = scanner.nextInt();
        scanner.nextLine();

        for (int contadorUsuarios = 0; contadorUsuarios < numUsuarios; contadorUsuarios++) {
            System.out.println("Nombre del usuario:");
            String nombreUsuario = scanner.nextLine();

            int edadUsuario = 0;
            boolean edadValida = false;

            while (!edadValida) {
                System.out.println("Edad del usuario:");
                try {
                    edadUsuario = scanner.nextInt();
                    scanner.nextLine();

                    if (edadUsuario < 1 || edadUsuario > 120) {
                        System.out.println("Edad no válida. Por favor, ingrese una edad entre 1 y 120.");
                    } else {
                        edadValida = true;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada no válida. Por favor, ingrese un número entero para la edad.");
                    scanner.nextLine(); // Clear the invalid input
                }
            }

            usuarios.add(nombreUsuario);
            edades.add(edadUsuario);

            if (edadUsuario >= 18) {
                System.out.println(nombreUsuario + " es mayor de edad.");
            } else {
                System.out.println(nombreUsuario + " es menor de edad.");
            }
        }

        System.out.println("Resultados:");
        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println("Usuario " + (i + 1) + ": " + usuarios.get(i) + " - Edad: " + edades.get(i));
        }

        scanner.close();
    }
}
