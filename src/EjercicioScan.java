import java.util.Scanner;

public class EjercicioScan {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Ingrese su nombre: ");
       String nombre = input.nextLine();
       System.out.println("Ingrese su edad: ");
       int edad = input.nextInt();

       System.out.println("¡Hola, " + nombre + " tienes " + edad + " años!");

       input.close();
   }
}
