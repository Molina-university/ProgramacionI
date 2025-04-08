//Desarrollar un programa que muestre la tabla de multiplicar del 5 (del 5 al 50)
public class TablaMultiplicar5 {
    public static void main(String[] args) {
        for (int i = 5; i <= 50; i += 5) {
            System.out.println("5 x " + i / 5 + " = " + i);
        }
    }
}
