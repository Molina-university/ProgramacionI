//Realizar un programa que solicite la carga por teclado de dos números,
//si el primero es mayor al segundo informar su suma y diferencia,
//en caso contrario informar el producto y la división
//del primero respecto al segundo.

import java.util.Scanner;

public class SumaOproducto {

    public static void main(String[] args) {
        int num1, num2, suma, resta, producto;
        float division;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        num2 = scanner.nextInt();

        if (num1 > num2) {
            suma = num1 + num2;
            resta = num1 - num2;
            System.out.println("La suma de los dos números es: " + suma);
            System.out.println("La resta de los dos números es: " + resta);
        } else {
            producto = num1 * num2;
            division = (float) num1 / num2;
            System.out.println("El producto de los dos números es: " + producto);
            System.out.println("La división de los dos números es: " + division);
        }
        scanner.close();
    }
   
}