import java.util.Scanner;

public class ejercicio8 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1 = input.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = input.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        int num3 = input.nextInt();
        
        System.out.println("el primer numero es mayor que el segundo y menor que el tercero? " + (num1 > num2 && num1 > num3));
        System.out.println("el segundo numero es mayor que el tercero y menor que el primero? " + (num2 > num3 && num2 < num1));
    input.close();
    }
}