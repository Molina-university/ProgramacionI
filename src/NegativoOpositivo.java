//Se ingresa por teclado un valor entero,
//mostrar una leyenda que indique si el número es positivo,
//negativo o nulo (es decir cero).

import java.util.Scanner;

public class NegativoOpositivo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero:");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("El numero es positivo");
        } else if (num < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es nulo");
        }
    sc.close();
    }
}
