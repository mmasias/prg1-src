import java.util.Scanner;
public class PromedioNotas{
  public static void main(String[] args){

    double[] misNotas;
    double promedio;
    int i;
    Scanner entrada = new Scanner(System.in);

    for (i=0;i<=10;i=i+1){
      System.out.println ("Ingrese nota "+i+":");
      nota[i] = entrada.nextDouble();
      promedio = promedio + nota;
    }
    promedio = promedio / 10;
    System.out.println ("El promedio es:"+promedio);
  }
}
