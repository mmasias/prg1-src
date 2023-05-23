import java.util.Scanner;
public class calculosConNumeros {

  public static void main(String[] args) {

      int numeroIngresado;
      int numeroMayor=0;
      int numeroPromedio=0;
      int cantidadDeNumeros=0;
      int sumaDeNumeros=0;
      Scanner entrada = new Scanner(System.in);

      do {
        System.out.println ("Ingrese un entero positivo (0 para terminar)");
        numeroIngresado = entrada.nextInt();
        if (numeroIngresado>0){
          cantidadDeNumeros = cantidadDeNumeros+1;
          sumaDeNumeros = sumaDeNumeros + numeroIngresado;
          if (numeroIngresado>numeroMayor){
            numeroMayor=numeroIngresado;
          }
        }
      } while (numeroIngresado!=0);

      if (cantidadDeNumeros>0){
        numeroPromedio = sumaDeNumeros / cantidadDeNumeros;
        System.out.println ("Total de números:"+cantidadDeNumeros);
        System.out.println ("Promedio de números:"+numeroPromedio);
        System.out.println ("Número mayor:"+numeroMayor);
      }
      else {
        System.out.println ("No se ingresaron números.");
      }


    }

  }
