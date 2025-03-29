public class RetiroPlata {
    public static void main(String[] args) {
    
        int saldoInicial = 1000;
        int retiroSemanal = 200;
        int semanas = 4;

        int totalRetirado = retiroSemanal * semanas;

        int saldoFinal = saldoInicial - totalRetirado;

        System.out.println("Saldo inicial: $" + saldoInicial);
        System.out.println("Total retirado después de " + semanas + " semanas: $" + totalRetirado);
        System.out.println("Saldo final en la cuenta: $" + saldoFinal);
    }
}
