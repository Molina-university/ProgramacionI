/*
Escribir un programa que solicite ingresar 10 notas de alumnos y nos informe
cuántos tienen notas mayores o iguales a 7 y cuántos menores.
*/

import java.util.Scanner;

public class Ejerclase11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int notasMayorIgualSiete = 0;
        int notasMenorSiete = 0;
        int nota;
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese nota: ");
            nota = sc.nextInt();
            if (nota >= 7) {
                notasMayorIgualSiete++;
            } else {
                notasMenorSiete++;
            }
        }
        System.out.println("Notas mayores o iguales a 7: " + notasMayorIgualSiete);
        System.out.println("Notas menores a 7: " + notasMenorSiete);
        sc.close();
    }
    
}
