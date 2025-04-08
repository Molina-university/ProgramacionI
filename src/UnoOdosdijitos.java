//Se ingresa por teclado un número positivo de uno o dos dígitos (1..99)
//mostrar un mensaje indicando si el número tiene uno o dos dígitos.
//(Tener en cuenta que condición debe cumplirse para tener dos dígitos
//un número entero)
import java.util.Scanner;
public class UnoOdosdijitos {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero positivo de hasta dos cifras: ");
        int num = scanner.nextInt();

        if (num < 10 || num > -10) {
            System.out.println("El numero ingresado tiene 1 cifra");
        } else if (num < 100 || num > -100) {
            System.out.println("El numero ingresado tiene 2 cifras");
        } else {
            System.out.println("El numero ingresado tiene mas de 2 cifras");
        }
        scanner.close();
    }
}
