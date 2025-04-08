//Realizar un programa que solicite ingresar
//dos números distintos y muestre por pantalla el mayor de ellos.
import java.util.Scanner;
public class NumeroMayor {
    
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el primer número: ");
    int num1 = sc.nextInt();
    System.out.println("Ingrese el segundo número: ");
    int num2 = sc.nextInt();

        if (num1>num2){
        System.out.println(num1);
        }
        else {
        System.out.println(num2);
        }
        sc.close();
    
    }
}