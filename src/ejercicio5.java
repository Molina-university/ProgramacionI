import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
       
        float priceShirts = 25.0f;
        float pricePants = 30.0f;

        float descGnral = 0.15f;
        float descExtra = 0.05f;

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de camisetas que desea comprar: ");
        int cantShirts = sc.nextInt();

        float costShirtDiscount = priceShirts * (1 - descGnral);
        float costPantsDiscount = pricePants * (1 - descGnral);
        float totalShirts = 0.0f;

        if (cantShirts > 0) {
            totalShirts += costShirtDiscount;

            for (int i = 1; i < cantShirts; i++) {
                float pricepromotion = costShirtDiscount * (1 - descExtra);
                totalShirts += pricepromotion;
            }
        }
        
         float total = totalShirts + costPantsDiscount;

        System.out.println("Precio del pantalón con descuento: $" + costPantsDiscount);
        System.out.println("Total camisetas con descuentos: $" + totalShirts);
        System.out.println("Precio total a pagar (incluyendo pantalón): $" + total);

        sc.close();
    }
}
