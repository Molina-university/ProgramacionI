import java.util.Scanner;

public class clase1503 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el número inicial");
        int inicial = input.nextInt();
        System.out.print("Ingrese el número final");
        int fin = input.nextInt();

        if (inicial>fin) {
            System.out.print("entrada no valida");
            input.close();
            return;
        }
        boolean encontrado = false;

        for (int i = Math.max(2, inicial); i <= fin; i++) {
            int contadorDivisores = 0;
            int primerDivisor = 0;       
            int segundoDivisor = 0;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        contadorDivisores++;
                        if (contadorDivisores == 1) {
                            primerDivisor = j;
                        }   else if (contadorDivisores == 2) {
                                    segundoDivisor = j;
                        }   else {
                            break;
                            }  
                    }
                }
            if (contadorDivisores == 2) {
                encontrado = true ;
                System.out.println("el numero " + i + "  es un numero amigo y tiene como divisores los numeros: " + primerDivisor + " y " + segundoDivisor);
            }            
        }
        if (!encontrado) {
            System.out.println("No se encontraron números amigos");
        }
        input.close();
    }
}