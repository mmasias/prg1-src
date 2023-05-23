import java.util.Scanner;

public class elCaminante{

    static String[][] elMundo= {
        {"MAR", "MONTAÑAS",     "MONTAÑAS",     "MONTAÑAS",         "MONTAÑAS",     "MONTAÑAS",     "MONTAÑAS"},
        {"MAR", "BOSQUE",       "BOSQUE",       "COLINA",           "RUINAS",       "BOSQUE",       "MONTAÑAS"},
        {"MAR", "CASA",         "BOSQUE",       "ARBOL MISTERIOSO", "LAGO",         "LAGO",         "MONTAÑAS"},
        {"MAR", "PLANICIE",     "BOSQUE",       "POZO",             "LAGO",         "LAGO",         "CUEVA"},
        {"MAR", "BOSQUE",       "BOSQUE",       "BOSQUE",           "RUINAS",       "BOSQUE",       "MONTAÑAS"},
        {"MAR", "PRECIPICIO",   "PRECIPICIO",   "PRECIPICIO",       "PRECIPICIO",   "PRECIPICIO",   "MONTAÑAS"},
    };

    static String[][] elMundoDetallado= {
        {"El mar se extiende al oeste mas alla de lo que alcanza la vista...", "Las montañas son muy altas y bloquean el paso...",     "Las montañas son muy altas y bloquean el paso...",     "Las montañas son muy altas y bloquean el paso...",         "Las montañas son muy altas y bloquean el paso...",     "Las montañas son muy altas y bloquean el paso...",     "Las montañas son muy altas y bloquean el paso..."},
        {"El mar se extiende al oeste mas alla de lo que alcanza la vista...", "Los árboles de bosque bloquean el paso de los rayos del sol.",       "Los árboles de bosque bloquean el paso de los rayos del sol.",       "COLINA",           "RUINAS",       "Los árboles de bosque bloquean el paso de los rayos del sol.",       "Las montañas son muy altas y bloquean el paso..."},
        {"El mar se extiende al oeste mas alla de lo que alcanza la vista...", "Hay una casa abandonada con todas las entradas cerradas",         "Los árboles de bosque bloquean el paso de los rayos del sol.",       "Un misterioso arbol se yergue altivo en un claro.", "LAGO",         "LAGO",         "Las montañas son muy altas y bloquean el paso..."},
        {"El mar se extiende al oeste mas alla de lo que alcanza la vista...", "Una extensa planicie sin nada más que cesped",     "Los árboles de bosque bloquean el paso de los rayos del sol.",       "Un pozo solitario se ubica dentro del bosque",             "LAGO",         "LAGO",         "Hay una cueva misteriosa que tiene bloqueada la entrada."},
        {"El mar se extiende al oeste mas alla de lo que alcanza la vista...", "Los árboles de bosque bloquean el paso de los rayos del sol.",       "Los árboles de bosque bloquean el paso de los rayos del sol.",       "Los árboles de bosque bloquean el paso de los rayos del sol.",           "RUINAS",       "Los árboles de bosque bloquean el paso de los rayos del sol.",       "Las montañas son muy altas y bloquean el paso..."},
        {"El mar se extiende al oeste mas alla de lo que alcanza la vista...", "Un profundo precipicio impide ir más hacia el sur",   "Un profundo precipicio impide ir más hacia el sur",   "Un profundo precipicio impide ir más hacia el sur",       "Un profundo precipicio impide ir más hacia el sur",   "Un profundo precipicio impide ir más hacia el sur",   "Las montañas son muy altas y bloquean el paso..."},
    };

    static int posX, posY;
    static int minX, minY, maxX, maxY;

    public static void main(String[] args){
        // Inicializaciones
        Scanner entrada = new Scanner(System.in);
        posX=1;  posY=1;
        // Limites del mundo
        minX=0; minY=0;
        maxY=elMundo.length-1;
        maxX=elMundo[0].length-1;

        boolean caminando = true;
        String accion;
        laIntro();

        while(caminando==true){
            System.out.print ("Ingrese comando: ");
            accion = entrada.nextLine();

            if (accion.equals("norte")){norte();mira();}
            else if (accion.equals("sur")){sur();mira();}
            else if (accion.equals("este")){este();mira();}
            else if (accion.equals("oeste")){oeste();mira();}
            else if (accion.equals("mira")) {miraDetallada();}
            else if (accion.equals("fin")){caminando=false;}
            else { noLeHeEntendido(); }

        }

    }

    static void sur(){
        if(posY<maxY){
            posY=posY+1;
            System.out.print ("Caminas hacia el sur...");
        } else {
            System.out.print ("No puedes bajar más! ");
        }
    }

    static void norte(){
        if(posY>minY){
            posY=posY-1;
            System.out.print ("Caminas hacia el norte...");
        } else {
            System.out.print ("No puedes subir más! ");
        }
    }

    static void este(){
        if(posX<maxX){
            posX=posX+1;
            System.out.print ("Caminas hacia el este...");
        }else {
            System.out.print ("No puedes ir mas al este! ");
        }
    }

    static void oeste(){
        if(posX>minX){
            posX=posX-1;
            System.out.print ("Caminas hacia el oeste...");
        }else {
            System.out.print ("No puedes ir mas al oeste! ");
        }
    }

    static void mira(){
        System.out.println("Mirando alrededor: "+elMundo[posY][posX]);
    }

    static void miraDetallada(){
        System.out.println("Mirando alrededor: "+elMundoDetallado[posY][posX]);
    }

    static void noLeHeEntendido(){
        System.out.println("No le he entendido!");
        losComandos();
    }

    static void laIntro(){
        System.out.println("Despiertas con la sensación de estar perdido, en medio de un bosque.\nAun mareado, empiezas a caminar...");
        losComandos();
    }

    static void losComandos(){
        System.out.println("Los comandos son 'norte', 'sur', 'este', 'oeste', 'mira' y 'fin'");
    }

}
