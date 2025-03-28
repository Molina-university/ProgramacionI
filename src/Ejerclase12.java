/*
En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y $500,
realizar un programa que lea los sueldos que cobra cada empleado e informe
cuántos empleados cobran entre $100 y $300 y cuántos cobran más de $300.
Además el programa deberá informar el importe que gasta la empresa en sueldos
al personal.
*/

import java.util.Scanner;

public class Ejerclase12 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int n, sueldo, cont1 = 0, cont2 = 0, gasto = 0;
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sueldo = sc.nextInt();
            if (sueldo >= 100 && sueldo <= 300) {
                cont1++;
            } else if (sueldo > 300) {
                cont2++;
            }
            gasto += sueldo;
        }
        System.out.println("Cantidad de empleados que cobran entre $100 y $300: " + cont1);
        System.out.println("Cantidad de empleados que cobran más de $300: " + cont2);
        System.out.println("Gasto total en sueldos: $" + gasto);

        sc.close();
    }
}
