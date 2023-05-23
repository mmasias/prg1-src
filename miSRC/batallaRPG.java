import java.util.Scanner;
public class batallaRPG{
  public static void main(String[] args){

    int vidaHeroe=100, armaHeroe=10, exitoHeroe=50;
    int vidaBandido=100, armaBandido=10, exitoBandido=50;
    double intentoDeGolpe;

    intentoDeGolpe = 0;

    System.out.println ("=======================================================================");
    while (vidaHeroe*vidaBandido>0){
      // Ataque del héroe
      if (vidaHeroe>0){
        intentoDeGolpe = Math.random()*100;
        if (intentoDeGolpe>exitoHeroe) {
          vidaBandido = vidaBandido - armaHeroe;
          System.out.println ("Golpe del Heroe! ");
        }
      }
      // Ataque del bandido
      if (vidaBandido>0) {
        intentoDeGolpe = Math.random()*100;
        if (intentoDeGolpe>exitoBandido) {
          vidaHeroe = vidaHeroe - armaBandido;
          System.out.println ("Golpe del Bandido!");
        }
      }
      System.out.println ("-----------------------------------------------------------------------");
      System.out.println ("Resumen de la vuelta: HEROE:["+vidaHeroe+"] / BANDIDO:["+vidaBandido+"]");
      System.out.println ("-----------------------------------------------------------------------");

    }


    // Aquí la batalla ha terminado. Hay un vencedor: indicar quién ha sido.
    if (vidaHeroe>0) {
      System.out.println ("Vencedor: HEROE");
    } else if (vidaBandido>0) {
      System.out.println ("Vencedor: BANDIDO");
    } else {
      System.out.println ("Empate (perdieron ambos)");
    }
    System.out.println ("=======================================================================");
  }
}
