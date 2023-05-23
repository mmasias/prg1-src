import java.util.Scanner;
public class Ejercicio005002 {

    public static void main(String[] args) {

        int numeroMes;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre el primer número: ");
        primerNumero = entrada.nextInt();

        System.out.println("Entre el segundo número: ");
        segundoNumero = entrada.nextInt();

        if (primerNumero > segundoNumero) {
    			numeroMayor = primerNumero;
    		} else {
    			numeroMayor = segundoNumero;
    		}

        System.out.println("El número mayor es: " + numeroMayor);
    }
}
