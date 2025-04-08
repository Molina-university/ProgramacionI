//Confeccionar un programa que permita cargar un número entero positivo
//de hasta tres cifras y muestre un mensaje indicando si tiene 1, 2, o 3 cifras.
//Mostrar un mensaje de error si el número de cifras es mayor.

import java.util.Scanner;

public class CantidadCifras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero positivo de hasta tres cifras: ");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("El numero ingresado es 0");
        } else if (num < 10 || num > -10) {
            System.out.println("El numero ingresado tiene 1 cifra");
        } else if (num < 100 || num > -100) {
            System.out.println("El numero ingresado tiene 2 cifras");
        } else if (num < 1000 || num > -1000) {
            System.out.println("El numero ingresado tiene 3 cifras");
        } else {
            System.out.println("El numero ingresado tiene mas de 3 cifras");
        }

    sc.close();
    
    }

}
