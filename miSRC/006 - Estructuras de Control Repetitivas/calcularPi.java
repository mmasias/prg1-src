import java.util.Scanner;
public class calcularPi{
  public static void main(String[] args){

    int iteraciones;
    int i;
    double divisor=1;
    double miPi=0;
    Scanner entrada = new Scanner(System.in);

    System.out.println("Indique cuantas iteraciones: ");
    iteraciones = entrada.nextInt();

    for(i=1; i<=iteraciones; i=i+1){
        if((i%2)==0){
            miPi = miPi - 4/divisor;
        }else{
            miPi = miPi + 4/divisor;
        }
        divisor = divisor + 2;
        System.out.println("PI en la " + i + " iteracion: " + miPi);

    }
    System.out.println("Valor final luego de " + i + " iteraciones: "+miPi);
  }
}



----------------------
jose luis
CD el salvador
averiguar necesidades
trabajo mecanico con los becarios - media jornada - 500


Nomina 1200 le cuesta 2000 al mes a el

media jornada
----------------------

salvador
cda santander

----------------------
