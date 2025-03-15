import java.util.Scanner;
public class clase1403 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int numero =input.nextInt();
        System.out.println("El número es: " + numero);

        for (int i = 1; i <= numero; i++) {
                for (int j = 1; j <= i; j++) {
                        if (j%2==1){
                            System.out.print(i);
                        } else {
                            System.out.print(i * -1);
                        }
                        if (j<i){
                            System.out.print("");
                        }
                }
                System.out.println();
        }
        input.close();
    }
}
