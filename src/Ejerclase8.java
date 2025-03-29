/*
Un postulante a un empleo, realiza un test de capacitación, se obtuvo la siguiente información: cantidad total de preguntas que se le realizaron y la 
cantidad de preguntas que contestó correctamente. Se pide confeccionar un programa que ingrese los dos datos por teclado e informe el nivel del mismo 
según el porcentaje de respuestas correctas que ha obtenido, y sabiendo que:
	Nivel máximo:	Porcentaje>=90%.
	Nivel medio:	Porcentaje>=75% y <90%.
	Nivel regular:	Porcentaje>=50% y <75%.
	Fuera de nivel:	Porcentaje<50%.
*/
import java.util.Scanner;
public class Ejerclase8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad total de preguntas: ");
        int total = sc.nextInt();
        System.out.println("Ingrese la cantidad de preguntas contestadas correctamente: ");
        int correctas = sc.nextInt();
        
        double porcentaje = (correctas * 100) / total;
        String nivel = "Fuera de nivel";

        if (porcentaje >= 90) {
            nivel = "Nivel máximo";
        } else if (porcentaje >= 75) {
            nivel = "Nivel medio";
        } else if (porcentaje >= 50) {
            nivel = "Nivel regular";
        }

        System.out.println("El postulante tiene un porcentaje de respuestas correctas del " + porcentaje + "%, por lo tanto, su nivel es: " + nivel);
        sc.close();
    }
}
