import java.util.Scanner;
public class maquinaDeCambio {

    public static void main(String[] args) {

        double montoPorPagar, montoEntregado, cambioPendiente;
        double porEntregar;

        String miEstado="";

        Scanner entrada = new Scanner(System.in);

        System.out.println("Por pagar: ");
        montoPorPagar = entrada.nextDouble();

        System.out.println("Se entrega: ");
        montoEntregado = entrada.nextDouble();

        cambioPendiente = montoEntregado - montoPorPagar;

        if (cambioPendiente>=20) {
          porEntregar = Math.floor(cambioPendiente/20);
          cambioPendiente = cambioPendiente - (20*porEntregar);
          System.out.println ("De 20 euros:"+porEntregar);
        }

        if (cambioPendiente>=10) {
          porEntregar = Math.floor(cambioPendiente/10);
          cambioPendiente = cambioPendiente - (10*porEntregar);
          System.out.println ("De 10 euros:"+porEntregar);
        }

        if (cambioPendiente>=1) {
          porEntregar = Math.floor(cambioPendiente/1);
          cambioPendiente = cambioPendiente - (1*porEntregar);
          System.out.println ("De 1 euro:"+porEntregar);
        }

// A partir de aquí hay que multiplicar por 100 y lo mismo que arriba



        System.out.println ("El cambio es: "+cambioPendiente);

    }
}
