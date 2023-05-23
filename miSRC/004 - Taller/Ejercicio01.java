import java.util.Scanner;
public class Ejercicio01 {

    public static void main(String[] args) {
        double caloriasDesayuno;
        double caloriasAlmuerzo;
        double caloriasCena;
        double totalCalorias;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Calorías del desayuno: ");
        caloriasDesayuno = entrada.nextDouble();

        System.out.print("Calorías del almuerzo: ");
        caloriasAlmuerzo = entrada.nextDouble ();

        System.out.print("Calorías de la cena: ");
        caloriasCena = entrada.nextDouble ();

        totalCalorias = caloriasDesayuno + caloriasAlmuerzo + caloriasCena;

        System.out.println("Total de calorías: " + totalCalorias);

    }
}
