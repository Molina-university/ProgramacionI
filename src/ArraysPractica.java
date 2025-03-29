// Escribe un programa que pida al usuario que ingrese 5 números y los almacene en un array. 
// Luego, el programa debe calcular e imprimir el promedio de esos números.

public class ArraysPractica {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int suma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese un número: ");
            numeros[i] = Integer.parseInt(System.console().readLine());
            suma += numeros[i];
        }
        System.out.println("El promedio de los números ingresados es: " + (suma / 5));
    }
}
