// Escribe un programa que pida al usuario que ingrese 5 números y los almacene en un array. 
// Luego, el programa debe calcular e imprimir el promedio de esos números.

import java.util.Scanner;

public class PromNumerosArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int suma = 0;

        System.out.println("Por favor, ingresa 5 números:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            suma += numeros[i]; 
        }

        double promedio = (double) suma / 5;

        System.out.println("El promedio de los números ingresados es: " + promedio);

        scanner.close();
    }
}