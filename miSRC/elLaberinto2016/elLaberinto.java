import java.util.Scanner;

public class elLaberinto{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int[][] elMundo= {
            {0,0,0,0,1,1,1,0,1,0},
            {0,1,1,0,0,0,0,0,1,0},
            {0,0,1,0,1,1,1,0,1,0},
            {0,0,1,0,1,0,0,0,0,0},
            {1,0,0,0,1,0,1,1,1,1},
            {1,0,0,1,1,0,0,0,0,0},
            {1,1,0,0,1,1,1,0,1,0},
            {0,1,1,0,0,0,0,0,1,0},
            {0,0,0,0,1,0,1,0,1,0},
            {0,1,0,0,0,0,0,0,0,0}
        };

        int x=0, y=0;               //  Variables de mapa
        int posX=0, posY=0;         //  Punto de partida
        String accion;              //  Variable para comandos
        boolean caminando = true;   //  Bandera para gestionar el final  

        int minX, minY, maxX, maxY; // Variables que controlan los limites
        minX=0; minY=0;             // Limites X e Y inferiores del mundo
        maxY=elMundo.length-1;      // Limite Y superior del mundo
        maxX=elMundo[0].length-1;   // Limite X superior del mundo

        while (caminando==true) {

            // Imprimir el mapa
            //  INICIO Impresión del mundo
                System.out.println("+==========+");
                for (y=0;y<elMundo.length;y=y+1){
                    System.out.print("|");
                    for (x=0;x<elMundo[y].length;x=x+1){
                        if((posX==x)&&(posY==y)) {
                            System.out.print("H");} 
                        else {
                                    if (elMundo[y][x]==0) { System.out.print("´"); }  
                            else    if (elMundo[y][x]==1) { System.out.print("*"); }                             
                        }
                    }
                    System.out.println("|");
                }
                System.out.println("+==========+");
            //  FIN de la impresión del mundo

            //  Decir donde estoy
            //System.out.println ("Estas en: "+elMundo[posY][posX]);

            // Pedir input del usuario
            System.out.print  ("Estas en ("+posX+","+posY+"). Ingrese comando: ");
            accion = entrada.nextLine();

            // Analizar el input del usuario
            if (accion.equals("norte")) { 
                if (posY>minY) {
                    posY = posY - 1; 
                } else {
                    System.out.println ("No puedes subir mas!");
                }
            }

            if (accion.equals("sur"))   { 
                if (posY<maxY) {
                    posY = posY + 1;
                } else {
                    System.out.println ("No puedes bajar mas!");
                }
            }

            if (accion.equals("este"))  { 
                if (posX<maxX) {
                    posX = posX + 1; 
                } else {
                    System.out.println ("No puedes ir mas al este!");
                } 
            }

            if (accion.equals("oeste")) { 
                if (posX>minX) {
                    posX = posX - 1;  
                } else {
                    System.out.println ("No puedes ir mas al oeste!");
                } 
            }

            if (accion.equals("fin")){
                caminando=false;
            }

 
        }
    }
}