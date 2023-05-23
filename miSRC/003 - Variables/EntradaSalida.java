import java.util.Scanner;

public class EntradaSalida {

  public static void main(String[] args) {

    int miNumero1;
    int miNumero2;

    Scanner entrada = new Scanner(System.in);

    System.out.print("Ingrese un # entero: ");
    miNumero1 = entrada.nextInt();

    System.out.print("Entre otro # entero: ");
    miNumero2 = entrada.nextInt();

    System.out.print ("Los valores son: ");
    System.out.println (miNumero1 + " y " + miNumero2);
    }
 }
