import java.util.Scanner;

public class elLaberintoZX{

    public final static void clearConsole()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static int[][] elLaberinto= {
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0}
    };

    static String[][] losValores = new String[elLaberinto.length][elLaberinto[0].length];

    static int posX, posY;
    static int minX, minY, maxX, maxY;

    public static void main(String[] args){
        // Inicializaciones
        Scanner entrada = new Scanner(System.in);
        posX=0;  posY=0;

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
            else {
                losValores[posX][posY]=accion;
                sur();
                mira();
            }

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
        clearConsole();
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
        String temporal;
        //System.out.println("");
        System.out.println("+------------------------------------------------------------------------+");
        System.out.println("|  |   A  |   B  |   C  |   D  |   E  |   F  |   G  |   H  |   I  |   J  |");
        System.out.println("|--+------+------+------+------+------+------+------+------+------+------|");
        for(i=0;i<(elLaberinto.length);i=i+1){
            if (i<9){temporal=" ";}else{temporal="";}
            System.out.print("|"+temporal+(i+1)+"|");
            for (j=0;j<(elLaberinto[i].length);j=j+1){

                if((i==posX)&&(j==posY))
                {
                    System.out.print("[____]|");
                }
                else
                {
                    if(elLaberinto[i][j]==1)
                    {
                        System.out.print("[]");
                    } else
                    {
                        if (losValores[i][j]!=null) {
                            System.out.printf("%6s|", losValores[i][j]);

                        }
                        else {
                            System.out.print("      |");
                        }
                    };
                }
            }
            //System.out.print("|");
            System.out.println();
        }
        System.out.println("|--+------+------+------+------+------+------+------+------+------+------|");
        System.out.println("|HM|X:"+(posY+1)+"| Y:"+(posX+1)+"|"+losValores[posX][posY]);
        System.out.println("|------------------------------------------------------------------------|");
    }

}
