//Se ingresan tres notas de un alumno, si el promedio es mayor o igual a siete
//mostrar un mensaje "Promocionado".

import java.util.Scanner;

public class ejerclase2 {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
    System.out.print("ingrese la primera nota");
    float nota1 = scanner.nextFloat();
    System.out.print("ingrese la segunda nota");    
    float nota2 = scanner.nextFloat();
    System.out.print("ingrese la tercera nota");
    float nota3 = scanner.nextFloat();

    float promedio = (float)((nota1 + nota2 + nota3) / 3);


        if (promedio >=7) {
         System.out.println("Promocionado");
        }
        else {
        System.out.println("No promocionado");
        }

    scanner.close();
    }
}