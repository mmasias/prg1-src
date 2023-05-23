import java.util.Scanner;

public class elCaminante005{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        String[][] elMundo= {
            {"MAR", "MONTE    ",   "MONTE    ",   "MONTE    ", "MONTE    ", "MONTE    ", "MONTE  "  },
            {"MAR", "BOSQUE   ",   "BOSQUE   ",   "COLINA   ", "RUINAS   ", "BOSQUE   ", "MONTE  "  },
            {"MAR", "CASA     ",   "BOSQUE   ",   "ARBOL    ", "LAGO     ", "LAGO     ", "MONTE  "  },
            {"MAR", "PLANICIE ",   "BOSQUE   ",   "POZO     ", "LAGO     ", "LAGO     ", "CUEVA  "  },
            {"MAR", "BOSQUE   ",   "BOSQUE   ",   "BOSQUE   ", "RUINAS   ", "BOSQUE   ", "MONTE  "  },
            {"MAR", "RISCO    ",   "RISCO    ",   "RISCO    ", "RISCO    ", "RISCO    ", "MONTE  "  },
        };

        int x=0, y=0;               //  Variables de mapa
        int posX=1, posY=2;         //  Punto de partida
        String accion;              //  Variable para comandos
        boolean caminando = true;   //  Bandera para gestionar el final  

        int minX, minY, maxX, maxY; // Variables que controlan los limites
        minX=0; minY=0;             // Limites X e Y inferiores del mundo
        maxY=elMundo.length-1;      // Limite Y superior del mundo
        maxX=elMundo[0].length-1;   // Limite X superior del mundo

    // Imprimir el mapa
    //  INICIO Impresión del mundo
        for (y=0;y<elMundo.length;y=y+1){
            for (x=0;x<elMundo[y].length;x=x+1){
                System.out.print(elMundo[y][x]);
                if((posX==x)&&(posY==y)) {System.out.print("*");} else {System.out.print(" ");}
                System.out.print("| ");
            }
            System.out.println();
        }
    //  FIN de la impresión del mundo

        while (caminando==true) {
            // Pedir input del usuario
            System.out.print  ("Ingrese comando: ");
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

            //  Decir donde estoy
            System.out.println ("Estas en: "+elMundo[posY][posX]);
        }
    }
}