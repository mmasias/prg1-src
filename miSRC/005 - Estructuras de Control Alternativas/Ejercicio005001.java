import java.util.Scanner;
public class Ejercicio005001 {

    public static void main(String[] args) {

        int primerNumero, segundoNumero, diferencia, numeroMayor;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre el primer número: ");
        primerNumero = entrada.nextInt();

        System.out.println("Entre el segundo número: ");
        segundoNumero = entrada.nextInt();

        diferencia = Math.abs(primerNumero - segundoNumero);
        numeroMayor = (primerNumero+segundoNumero+diferencia)/2;

        System.out.println("El número mayor es: " + numeroMayor);
    }
}
