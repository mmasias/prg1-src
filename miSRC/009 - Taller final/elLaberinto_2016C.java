import java.util.Scanner;

public class elLaberinto_2016C{

    static int[][] elLaberinto= {
{3,3,3,3,3,3,3,3,3,3,3,0,0,0,0,0,0,0,0,0,4,4,4,4,4,4,4,4,4,4,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,5,5,5,5,5,5,5,5,5},
{3,3,3,3,3,3,3,0,0,0,0,0,0,0,0,0,0,0,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,6,0,0,0,0,6,6,6,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,5,0,5,0,5,0,5,5,5,5,5},
{3,3,3,1,1,3,3,0,0,0,0,0,0,0,0,0,0,4,4,4,6,6,6,6,6,6,6,6,6,6,6,4,4,4,4,4,0,0,0,0,6,4,4,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,0,5,0,5},
{3,3,0,1,0,0,3,3,0,0,0,0,0,0,0,0,4,4,4,6,4,0,4,6,1,0,0,0,0,1,0,6,4,4,6,4,0,0,0,0,6,6,6,6,0,0,0,0,0,0,0,0,0,3,3,3,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,5},
{3,0,0,1,1,0,0,3,3,0,0,0,0,0,0,4,4,6,6,6,6,6,4,6,1,0,1,1,0,1,0,6,6,4,4,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,3,3,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5},
{0,0,0,0,0,0,0,0,3,3,0,0,0,0,0,4,4,4,6,6,4,0,6,6,1,0,0,0,0,1,0,6,6,4,6,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,3,3,3,3,0,0,0,0,0,0,0,5,5,0,1,0,1,0,0,1,0,1,0,0,0,0,5,5},
{1,1,1,0,0,0,0,0,0,3,3,0,0,0,0,0,4,4,4,4,6,0,4,6,4,1,1,1,1,4,0,6,4,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,3,3,3,3,3,0,0,0,0,0,0,5,5,5,0,1,0,1,0,0,1,0,1,0,0,0,5,5,5},
{1,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,4,4,6,6,6,6,6,6,6,6,6,4,4,4,4,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,0,0,0,3,3,3,0,0,0,0,0,5,5,0,0,1,1,0,0,0,0,1,1,0,0,0,5,0,5},
{1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,4,0,4,0,4,4,4,4,4,4,4,4,4,4,4,4,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,3,3,0,0,3,3,3,0,0,0,0,0,5,5,0,0,1,1,0,0,0,0,1,1,0,0,0,0,0,5},
{0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,6,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,3,3,3,3,3,3,3,3,0,0,0,0,5,5,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,5},
{1,1,1,0,0,0,0,0,0,3,3,3,0,0,0,0,0,0,0,0,4,4,4,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,0,0,3,3,3,3,3,3,0,0,0,0,0,5,5,5,0,0,0,4,0,4,0,4,0,0,4,0,4,0,5,5},
{1,0,0,0,0,1,0,1,0,0,3,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,5,5,0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,5},
{1,1,1,0,0,1,1,1,0,0,3,3,3,3,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,7,7,0,0,0,0,0,0,0,7,7,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,5,5,0,5,0,0,0,1,0,0,0,0,0,0,0,0,1,0,5,5},
{0,0,0,0,0,0,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0,0,0,0,0,0,0,7,4,6,6,6,6,6,6,6,4,7,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,5,5,0,0,5,5,0,0,1,0,0,1,0,0,1,0,0,1,0,5,5},
{0,0,0,0,0,3,3,3,3,3,3,3,3,3,3,3,3,3,0,3,3,3,3,3,0,0,0,0,7,7,4,6,6,6,6,6,6,6,7,7,0,0,0,5,5,5,5,0,0,5,5,0,0,0,0,0,0,5,5,5,0,0,0,0,5,0,0,1,0,1,0,1,1,0,1,0,1,0,0,5},
{0,1,0,0,3,3,3,3,3,3,3,3,3,3,3,3,0,0,0,0,3,3,3,3,3,0,0,0,7,0,6,0,1,1,0,1,1,0,6,0,0,0,0,0,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,5,5},
{0,1,0,3,3,3,3,3,3,3,3,3,3,3,3,0,0,0,0,3,3,3,3,3,3,3,0,7,0,0,6,0,1,1,0,1,1,0,6,0,0,0,0,0,0,0,0,0,0,0,5,5,5,0,0,0,5,5,1,1,1,0,0,0,0,0,0,1,1,1,1,0,0,1,1,1,1,0,0,5},
{0,1,0,3,3,3,3,3,3,3,3,3,3,3,3,3,0,0,0,3,3,3,3,3,3,3,0,0,0,0,6,0,1,0,0,0,1,0,6,0,0,0,0,0,0,0,0,0,0,0,5,5,0,0,5,0,0,5,1,0,0,0,0,0,0,0,0,1,0,0,1,0,0,1,0,0,1,0,5,5},
{0,1,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0,0,6,0,1,1,0,1,1,0,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,5,5,5,5,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5}
    };

    static int posX, posY;
    static int minX, minY, maxX, maxY;
    static int alcanceAntorcha = 100;

    public static void main(String[] args){
        // Inicializaciones
        Scanner entrada = new Scanner(System.in);
        posX=18;  posY=0;

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
        if((posY<maxY)&&(elLaberinto[posX][posY+1]%2==0)){
            posY=posY+1;
            System.out.print ("Caminas hacia el este...");
        } else {
            System.out.print ("No puedes ir mas alla! ");
        }
    }

    static void oeste(){
        if((posY>minY)&&(elLaberinto[posX][posY-1]%2==0)){
            posY=posY-1;
            System.out.print ("Caminas hacia el oeste...");
        } else {
            System.out.print ("No puedes ir mas alla! ");
        }
    }

    static void sur(){
        if((posX<maxX)&&(elLaberinto[posX+1][posY]%2==0)){
            posX=posX+1;
            System.out.print ("Caminas hacia el sur...");
        }else {
            System.out.print ("No puedes ir mas alla! ");
        }
    }

    static void norte(){
        if((posX>minX)&&(elLaberinto[posX-1][posY]%2==0)){
            posX=posX-1;
            System.out.print ("Caminas hacia el norte...");
        }else {
            System.out.print ("No puedes ir mas alla! ");
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
        //  Código para limpiar pantalla
        System.out.print("\033[H\033[2J");
        System.out.flush();
        //  Inicio de impresión del mapa
        System.out.println("");
        System.out.println("================================================================================");
        for(i=0;i<(elLaberinto.length);i=i+1){
            //System.out.print("|");
            for (j=0;j<(elLaberinto[i].length);j=j+1){

                if((i==posX)&&(j==posY))
                {
                    System.out.print("H");
                }
                else if((posX+alcanceAntorcha>=i)&&(posX-alcanceAntorcha<=i)&&(posY+alcanceAntorcha>=j)&&(posY-alcanceAntorcha<=j))
                {
                             if(elLaberinto[i][j]==0)   { System.out.print("\033[30;42m \033[39;40m"); } //  Camino
                        else if(elLaberinto[i][j]==1)   { System.out.print("\033[37;47m#\033[39;40m"); } //  Pared
                        else if(elLaberinto[i][j]==3)   { System.out.print("\033[36;44m~\033[39;40m"); } //  Agua
                        else if(elLaberinto[i][j]==4)   { System.out.print("\033[30;42m.\033[39;40m"); } //  Arbustos
                        else if(elLaberinto[i][j]==6)   { System.out.print("\033[30;42m:\033[39;40m"); } //  Arboleda
                        else if(elLaberinto[i][j]==5)   { System.out.print("\033[1m^\033[0m"); } //  Montañas
                        else if(elLaberinto[i][j]==7)   { System.out.print("\033[1;30;42m*\033[0;39;40m"); } //  Arboles espesos
                }
                else
                {
                    System.out.print(" ");
                }
            }
            //System.out.print("|");
            System.out.println();
        }
        System.out.println("================================================================================");
        System.out.println(" H ["+posX+","+posY+"]");
    }

}
