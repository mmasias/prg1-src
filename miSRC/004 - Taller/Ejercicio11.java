import java.util.Scanner;
public class Ejercicio11 {

    public static void main(String[] args) {

        int numero1, numero2, numero3, numeroFinal;
        int digito1, digito2, digito3;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre el primer número: ");
        numero1 = entrada.nextInt();
        System.out.println("Entre el segundo número: ");
        numero2 = entrada.nextInt();
        System.out.println("Entre el terce número: ");
        numero3 = entrada.nextInt();

        digito1 = numero1 / 100;
        digito2 = (numero2 / 10) % 10;
        digito3 = numero3 % 10;

        numeroFinal = digito1 * 100 + digito2 * 10 + digito3;

        System.out.println("El número formado es: " + numeroFinal);
    }
}
