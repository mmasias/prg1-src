import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre la masa del cuerpo en Kg: ");
        double masa;
        masa = entrada.nextDouble();

        System.out.println("Peso en Mercurio es: " + (3.70 * masa));
        System.out.println("Peso en Venus es: " + (8.87 * masa));
        System.out.println("Peso en Tierra es: " + (9.80 * masa));
        System.out.println("Peso en Marte es: " + (3.71 * masa));
        System.out.println("Peso en Júpiter es: " + (23.12 * masa));
        System.out.println("Peso en Saturno es: " + (8.96 * masa));
        System.out.println("Peso en Urano es: " + (8.69 * masa));
        System.out.println("Peso en Neptuno es: " + (11.0 * masa));
        System.out.println("Peso en Plutón es: " + (0.81 * masa));

    }
}
