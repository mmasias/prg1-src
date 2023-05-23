import java.util.Scanner;

public class elCaminante000{

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

        String[][] elMundoDetallado= {
            {"El mar se extiende al oeste mas alla de lo que alcanza la vista...", "Las montañas son muy altas y bloquean el paso...",     "Las montañas son muy altas y bloquean el paso...",     "Las montañas son muy altas y bloquean el paso...",         "Las montañas son muy altas y bloquean el paso...",     "Las montañas son muy altas y bloquean el paso...",     "Las montañas son muy altas y bloquean el paso..."},
            {"El mar se extiende al oeste mas alla de lo que alcanza la vista...", "Los árboles de bosque bloquean el paso de los rayos del sol.",       "Los árboles de bosque bloquean el paso de los rayos del sol.",       "La colina comanda la vista de esta zona.",           "Te encuentras ante ruinas muy antiguas.",       "Los árboles de bosque bloquean el paso de los rayos del sol.",       "Las montañas son muy altas y bloquean el paso..."},
            {"El mar se extiende al oeste mas alla de lo que alcanza la vista...", "Hay una casa abandonada con todas las entradas cerradas",         "Los árboles de bosque bloquean el paso de los rayos del sol.",       "Un misterioso arbol se yergue altivo en un claro.", "Estás al noroeste de un lago muy grande.",         "Estás al noreste de un lago muy grande.",         "Las montañas son muy altas y bloquean el paso..."},
            {"El mar se extiende al oeste mas alla de lo que alcanza la vista...", "Una extensa planicie sin nada más que cesped",     "Los árboles de bosque bloquean el paso de los rayos del sol.",       "Un pozo solitario se ubica dentro del bosque",             "Estás al suroeste de un lago muy grande.",         "Estás al sureste de un lago muy grande.",         "Hay una cueva misteriosa que tiene bloqueada la entrada."},
            {"El mar se extiende al oeste mas alla de lo que alcanza la vista...", "Los árboles de bosque bloquean el paso de los rayos del sol.",       "Los árboles de bosque bloquean el paso de los rayos del sol.",       "Los árboles de bosque bloquean el paso de los rayos del sol.",           "Te encuentras ante ruinas muy antiguas.",       "Los árboles de bosque bloquean el paso de los rayos del sol.",       "Las montañas son muy altas y bloquean el paso..."},
            {"El mar se extiende al oeste mas alla de lo que alcanza la vista...", "Un profundo precipicio impide ir más hacia el sur",   "Un profundo precipicio impide ir más hacia el sur",   "Un profundo precipicio impide ir más hacia el sur",       "Un profundo precipicio impide ir más hacia el sur",   "Un profundo precipicio impide ir más hacia el sur",   "Las montañas son muy altas y bloquean el paso..."},
        };

         int posX, posY;
         int minX, minY, maxX, maxY;

        // Inicializaciones
        posX=1;  posY=1;

        // Limites del mundo
        minX=0; minY=0;
        maxY=elMundo.length-1;
        maxX=elMundo[0].length-1;

        boolean caminando = true;
        String accion;
        System.out.println ("Despiertas con la sensación de estar perdido, en medio de un bosque.");
        System.out.println ("Aun mareado, empiezas a caminar...");

        while(caminando==true){
            System.out.println();
            System.out.println("Ubicacion: "+elMundo[posY][posX]);
            System.out.println();
            System.out.println("Los comandos son 'norte', 'sur', 'este', 'oeste', 'mira' y 'fin'");
            System.out.print  ("Ingrese comando: ");

            accion = entrada.nextLine();
            System.out.println();
            
            if (accion.equals("norte")){
 
                if(posY>minY){
                    posY=posY-1;
                    System.out.println (" | Caminas hacia el norte...");
                } else {
                    System.out.println (" | No puedes subir más! ");
                }

            }

            else if (accion.equals("sur")){
                if(posY<maxY){
                    posY=posY+1;
                    System.out.println (" | Caminas hacia el sur...");
                } else {
                    System.out.println (" | No puedes bajar más! ");
                }
            }

            else if (accion.equals("este")){
                if(posX<maxX){
                    posX=posX+1;
                    System.out.println (" | Caminas hacia el este...");
                }else {
                    System.out.println (" | No puedes ir mas al este! ");
                }                
            }

            else if (accion.equals("oeste")){
                if(posX>minX){
                    posX=posX-1;
                    System.out.println (" | Caminas hacia el oeste...");
                }else {
                    System.out.println (" | No puedes ir mas al oeste! ");
                }                
            }

            else if (accion.equals("mira")) {
                System.out.println();
                System.out.println(" | Mirando alrededor:");
                System.out.println(" | "+elMundoDetallado[posY][posX]);
            }

            else if (accion.equals("fin")){
                caminando=false;
            }

            else { 
                System.out.println("No le he entendido!");
            }


            


        }

    }

}
