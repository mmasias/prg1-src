import java.util.Scanner;
public class PromedioNotas{
  public static void main(String[] args){

    double[] misNotas = new double[10];
    double promedio=0;
    String[] nombre=new String[5];
    int i;
    Scanner entrada = new Scanner(System.in);

    for (i=0;i<5;i=i+1){
      //System.out.println ("Ingrese nota "+(i+1)+":");
      //misNotas[i] = entrada.nextDouble();
      //promedio = promedio + misNotas[i];

      nombre[i] = entrada.next();
      System.out.print ("Vuelta 1 - Valor "+i+": ");
      System.out.println (nombre[i]);

    }

    for (i=0;i<10;i=i+1){
      //System.out.println ("Ingrese nota "+(i+1)+":");
      //misNotas[i] = entrada.nextDouble();
      //promedio = promedio + misNotas[i];

      nombre[i] = entrada.next();
      System.out.print ("Vuelta 2 - Valor "+i+": ");
      System.out.println (nombre[i]);

    }



    //promedio = promedio / 10;
    //System.out.println ("El promedio es:"+promedio);
  }
}
