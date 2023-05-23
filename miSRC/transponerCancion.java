import java.util.Scanner;

public class transponerCancion{

  public static void main(String[] args){

    Scanner entrada = new Scanner(System.in);
    int i,j,k;
    int tonosPorTransponer;
    int ubicacion=0;
    int ubicacionTranspuesta=0;
    String acorde="";
    String[] escala = {"C","C#","D","D#","E","F","F#","G","G#","A","A#","B"};
    String acordesTranspuestos="";

    System.out.print ("Ingrese tonos a transponer: ");
    tonosPorTransponer=entrada.nextInt();
    entrada.nextLine();

    while (!acorde.equals("FIN")){
      System.out.print ("Ingrese acorde (FIN para finalizar): ");
    	acorde=entrada.nextLine();

  		// Si no es la instrucción de final, encontrar la nota dentro del array
      ubicacion=-1;
      if (!acorde.equals("FIN")){
  			for (i=0;i<12;i=i+1){
  				if (acorde.equals(escala[i])){
  					ubicacion = i;
  				}
  			}

        // Transponer
        if (ubicacion!=-1){
  	      ubicacionTranspuesta = ubicacion + tonosPorTransponer;
          if (ubicacionTranspuesta>escala.length) {ubicacionTranspuesta=ubicacionTranspuesta-escala.length;}
          if (ubicacionTranspuesta<0) {ubicacionTranspuesta=ubicacionTranspuesta+escala.length;}
          acordesTranspuestos = acordesTranspuestos + escala[ubicacionTranspuesta]+"\n";
        }
		  }
    }
    System.out.println ("El resultado es:");
    System.out.println (acordesTranspuestos);
  }
}
