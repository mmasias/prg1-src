import java.util.Scanner;

public class elLaberintoVs{

    public final static void clearConsole()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static int[][] elLaberinto= {
        {0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0},
        {0,1,1,1,0,1,1,1,0,1,1,1,0,1,1,1,0,1,1,1,1,1,1,1,1,1,0,1,0},
        {0,1,0,0,0,1,0,1,0,0,0,1,0,1,0,0,0,1,0,0,0,0,0,1,0,0,0,1,0},
        {0,1,0,1,1,1,0,1,1,1,0,1,0,1,0,1,1,1,1,1,1,1,0,1,0,1,1,1,0},
        {0,0,0,1,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0},
        {0,1,1,1,0,1,1,1,1,1,1,1,0,1,0,1,1,1,1,1,1,1,0,1,0,1,1,1,0},
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
    static int alcanceAntorcha = 3;
    static int[] vampiroPosX={10,6,4}, vampiroPosY={22,4,14};

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
            //System.out.print ("(MaxX:"+maxX+"|MaxY:"+maxY+")[Y:"+posY+"][X:"+posX+"] ");
            losComandos();
            System.out.print ("Ingrese comando: ");
            accion = entrada.nextLine();

            // Se mueven los vampiro
            for (int v=0;v<3;v=v+1){
                vampiroPosX[v] = nuevaPosX(vampiroPosX[v], vampiroPosY[v]);
                vampiroPosY[v] = nuevaPosY(vampiroPosX[v], vampiroPosY[v]);
            }

            clearConsole();
            if (accion.equals("w")){norte();mira();}
            else if (accion.equals("s")){sur();mira();}
            else if (accion.equals("d")){este();mira();}
            else if (accion.equals("a")){oeste();mira();}
            else if (accion.equals("mira")) {/*miraDetallada();*/}
            else if (accion.equals("f")){caminando=false;}
            else { noLeHeEntendido();mira(); }



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
        System.out.print ("No le he entendido!");
    }

    static void laIntro(){
        System.out.print("Despiertas en medio de un laberinto. Empiezas a caminar...");
    }

    static void losComandos(){
        System.out.println("CMDs: [w]Norte,[s]Sur,[a]Oeste,[d]Este,[f]Fin");
    }

    static void imprimeLaberinto(){
        int i, j;
        String miElemento="";
        System.out.println("");
        System.out.println("+----------------------------------------------------------+");
        for(i=0;i<(elLaberinto.length);i=i+1){
            System.out.print("|");
            for (j=0;j<(elLaberinto[i].length);j=j+1){
                miElemento="  ";
                if((i==posX)&&(j==posY))
                {
                    miElemento="HM";
                }
                else
                {

                          if((posX+alcanceAntorcha>=i)&&(posX-alcanceAntorcha<=i)&&(posY+alcanceAntorcha>=j)&&(posY-alcanceAntorcha<=j))
                          {
                              if(elLaberinto[i][j]==1)        {miElemento="[]";}
                              else if(elLaberinto[i][j]==2)   {miElemento="/|";}
                              else if(elLaberinto[i][j]==5)   {miElemento="/\\";}
                              else if(elLaberinto[i][j]==9)   {miElemento="O-";}
                              else {miElemento="··";};
                              for (int v=0;v<3;v=v+1){
                                  if((i==vampiroPosX[v])&&(j==vampiroPosY[v])) {miElemento="^^";}
                                }
                          }
                          else
                          {
                              miElemento="  ";
                          }

                }
                System.out.print(miElemento);
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("|----------------------------------------------------------|");
        System.out.println("| HM |                                                     |");
        System.out.println("+----------------------------------------------------------+");
    }


// GESTION DEL MOVIMIENTO DE NPCs

    static int movimiento(){
        double probabilidadMovimiento=Math.random();
        if (probabilidadMovimiento<0.40) {return 1;}
            else if(probabilidadMovimiento<0.80) {return -1;}
                else {return 0;}
    }

    static int nuevaPosX(int oldPosX, int oldPosY){
        int variacion = movimiento();
        int newPosX = oldPosX;
        if((oldPosX!=minX&&oldPosX!=maxX)){
            if (elLaberinto[oldPosX+variacion][oldPosY]!=1){
                newPosX = oldPosX + variacion;
            }
        }
        return newPosX;
    }

    static int nuevaPosY(int oldPosX, int oldPosY){
        int variacion = movimiento();
        int newPosY = oldPosY;
        if((oldPosY!=minY&&oldPosY!=maxY)){
            if (elLaberinto[oldPosX][oldPosY+variacion]!=1){
                newPosY = oldPosY + variacion;
            }
        }
        return newPosY;
    }



}
