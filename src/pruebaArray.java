import java.util.Scanner;
public class pruebaArray {

    public static void main(String[] args) {
        
        // probemos la logica del array ya que no tenemos absolutamente nada que hacer xD
        int Filas = 0;
        int Columnas = 0;
        int [] matriz = new int[0];
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese el numero de filas");
        Filas = sc.nextInt();
        System.out.println("ingrese el numero de columnas");
        Columnas = sc.nextInt();

        System.out.println(	"ingrese en orden de filas la matriz");

            for ( int i=0; Filas > i ; i++){
                for ( int j=0; Columnas > j ; j++){
                    matriz = new int[i-j];
                } 
            }
            for ( int i=0; Filas > i ; i++){
                for ( int j=0; Columnas > j ; j++){
                    System.out.println(matriz);
                } 
            }

    sc.close();
    }   
}