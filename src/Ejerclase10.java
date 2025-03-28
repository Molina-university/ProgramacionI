/*
De un operario se conoce su sueldo y los años de antigüedad. Se pide
confeccionar un programa que lea los datos de entrada e informe:
a) Si el sueldo es inferior a 500 y su antigüedad es igual o superior a 10 años, otorgarle un aumento del 20 %, mostrar el sueldo a pagar.
b)Si el sueldo es inferior a 500 pero su antigüedad es menor a 10 años, otorgarle un aumento de 5 %.
c) Si el sueldo es mayor o igual a 500 mostrar el sueldo en pantalla sin cambios.
*/
import java.util.Scanner;

public class Ejerclase10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese sueldo: ");
        int sueldo = scanner.nextInt();
        System.out.print("Ingrese antigüedad: ");
        int antiguedad = scanner.nextInt();
        int aumentoSueldo;
        
        if (sueldo < 500 && antiguedad >= 10) {
            aumentoSueldo = (int) (sueldo * 0.20);
            sueldo = (int) (sueldo + aumentoSueldo);
            System.out.println("El sueldo a pagar es: " + sueldo);
        } else if (sueldo < 500 && antiguedad < 10) {
            aumentoSueldo = (int) (sueldo * 0.05);
            sueldo = (int) (sueldo + aumentoSueldo);
            System.out.println("El sueldo a pagar es: " + sueldo);
        } else {
            System.out.println("El sueldo a pagar es: " + sueldo);
        }
    scanner.close();
    }
    
}
