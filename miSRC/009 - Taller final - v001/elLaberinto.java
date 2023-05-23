import java.util.Scanner;

public class elLaberinto{

    static int[][] elLaberinto= {
        {0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0},
        {0,1,1,1,0,1,1,1,0,1,1,1,0,1,1,1,0,1,1,1,1,1,1,1,1,1,0,1,0},
        {0,1,0,0,0,1,0,1,0,0,0,1,0,1,0,0,0,1,0,0,0,0,0,1,0,0,0,1,0},
        {0,1,0,1,1,1,0,1,1,1,0,1,0,1,0,1,1,1,1,1,1,1,0,1,0,1,1,1,0},
        {0,0,0,1,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0},
        {1,1,1,1,0,1,1,1,1,1,1,1,0,1,0,1,1,1,1,1,1,1,0,1,0,1,1,1,0},
        {0,0,0,1,0,1,0,0,0,1,0,1,0,0,0,1,0,0,0,0,0,1,0,1,0,0,0,1,0},
        {1,1,0,1,0,1,0,1,0,1,0,1,0,1,1,1,0,1,1,1,0,1,0,1,1,1,0,1,1},
        {0,0,0,1,0,1,0,1,0,1,0,0,0,0,0,1,0,0,0,1,0,1,0,0,0,1,0,0,0},
        {0,1,0,1,0,1,0,1,0,1,1,1,1,1,0,1,1,1,0,1,0,1,0,1,1,1,1,1,0},
        {0,1,0,1,0,1,0,1,0,0,0,0,0,1,0,1,0,0,0,1,0,1,0,1,0,0,0,1,0},
        {0,1,1,1,0,1,0,1,1,1,1,1,0,1,0,1,0,1,1,1,0,1,1,1,0,1,0,1,0},
        {0,0,0,1,0,1,0,0,0,1,0,0,0,1,0,1,0,0,0,1,0,1,0,0,0,1,0,0,0},
        {0,1,0,1,0,1,1,1,0,1,0,1,1,1,1,1,1,1,0,1,0,1,0,1,1,1,1,1,0},
        {0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0}
    };

    static int posX, posY;
    static int minX, minY, maxX, maxY;

    public static void main(String[] args){
        // Inicializaciones
        Scanner entrada = new Scanner(System.in);
        posX=2;  posY=0;

        // Limites del mundo
        minX=0; minY=0;
        maxX=elLaberinto.length-1;
        maxY=elLaberinto[0].length-1;

        boolean caminando = true;
        String accion;

        laIntro();
        mira();

        while(caminando==true){
            losComandos();
            System.out.print ("Ingrese comando: ");
            accion = entrada.nextLine();

            if (accion.equals("w")){norte();mira();}
            else if (accion.equals("s")){sur();mira();}
            else if (accion.equals("d")){este();mira();}
            else if (accion.equals("a")){oeste();mira();}
            else if (accion.equals("f")){caminando=false;}
            else { noLeHeEntendido(); mira(); }

        }

    }

    static void este(){
        if((posY<maxY)&&(elLaberinto[posX][posY+1]!=1)){
            posY=posY+1;
            System.out.print ("Caminas hacia el este...");
        } else {
            System.out.print ("No puedes ir más allá! ");
        }
    }

    static void oeste(){
        if((posY>minY)&&(elLaberinto[posX][posY-1]!=1)){
            posY=posY-1;
            System.out.print ("Caminas hacia el oeste...");
        } else {
            System.out.print ("No puedes ir más allá! ");
        }
    }

    static void sur(){
        if((posX<maxX)&&(elLaberinto[posX+1][posY]!=1)){
            posX=posX+1;
            System.out.print ("Caminas hacia el sur...");
        }else {
            System.out.print ("No puedes ir más allá! ");
        }
    }

    static void norte(){
        if((posX>minX)&&(elLaberinto[posX-1][posY]!=1)){
            posX=posX-1;
            System.out.print ("Caminas hacia el norte...");
        }else {
            System.out.print ("No puedes ir más allá! ");
        }
    }

    static void mira(){

        imprimeLaberinto();
    }

    static void noLeHeEntendido(){
        System.out.print("No le he entendido!");

    }

    static void laIntro(){
        System.out.print("Despiertas en medio de un laberinto. Empiezas a caminar...");
    }

    static void losComandos(){
        System.out.println("CMDs: [W]Norte,[S]Sur,[A]Oeste,[D]Este,[F]Fin");
    }

    static void imprimeLaberinto(){
        int i, j;
        System.out.println("");
        System.out.println("+----------------------------------------------------------+");
        for(i=0;i<(elLaberinto.length);i=i+1){
            System.out.print("|");
            for (j=0;j<(elLaberinto[i].length);j=j+1){

                if((i==posX)&&(j==posY))
                {
                    System.out.print("HM");
                }
                else
                {
                    if(elLaberinto[i][j]==1)
                    {
                        System.out.print("[]");
                    }
                    else
                    {
                        System.out.print("  ");
                    };
                }
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("|----------------------------------------------------------|");
        System.out.println("| HM |                                                     |");
        System.out.println("+----------------------------------------------------------+");
    }

}
