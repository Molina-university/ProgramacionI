/*
Confeccionar un programa que pida por teclado tres notas de un alumno,
calcule el promedio e imprima alguno de estos mensajes:
Si el promedio es >=7 mostrar "Promocionado".
Si el promedio es >=4 y <7 mostrar "Regular".
Si el promedio es <4 mostrar "Reprobado".
*/

import java.util.Scanner;

public class PromocionadooReprobado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nota1, nota2, nota3, promedio;
        
        System.out.println("Ingrese la primera nota: ");
        nota1 = sc.nextFloat();
        System.out.println("Ingrese la segunda nota: ");
        nota2 = sc.nextFloat();
        System.out.println("Ingrese la tercera nota: ");
        nota3 = sc.nextFloat();

        promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio >= 7) {
            System.out.println("Promocionado");
        } else if (promedio >= 4 && promedio < 7) {
            System.out.println("Regular");
        } else {
            System.out.println("Reprobado");
        }
        sc.close();
    }
}
