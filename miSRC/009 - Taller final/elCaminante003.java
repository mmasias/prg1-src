import java.util.Scanner;

public class elCaminante003{

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

        int x=0, y=0;

        int posX=1, posY=2;

        for (y=0;y<elMundo.length;y=y+1){

            for (x=0;x<elMundo[y].length;x=x+1){
                                
                System.out.print(elMundo[y][x]);

                if((posX==x)&&(posY==y)) {System.out.print("*");} else {System.out.print(" ");}

                System.out.print("| ");
            }

            System.out.println();
        }

    }
}