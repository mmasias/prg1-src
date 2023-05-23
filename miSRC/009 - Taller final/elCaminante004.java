import java.util.Scanner;

public class elCaminante004{

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
            if (accion.equals("norte")) { posY = posY - 1; }
            if (accion.equals("sur"))   { posY = posY + 1; }
            if (accion.equals("este"))  { posX = posX + 1; }
            if (accion.equals("oeste")) { posX = posX - 1; }

            //  Decir donde estoy
            System.out.println ("Estas en: "+elMundo[posY][posX]);
        }
    }
}