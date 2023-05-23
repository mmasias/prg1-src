import java.util.Scanner;
public class elLaberinto005{	//	Version que intenta implementar un enemigo que se mueve aleatoriamente
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		int[][] elMundo= {
			{0,0,0,0,1,1,1,0,1,0,0,0,0,1,1,1,0,1,0},
			{0,1,1,0,0,0,0,0,1,0,1,1,0,0,0,0,0,1,0},
			{0,0,1,0,1,1,1,0,1,0,0,0,0,1,0,1,0,1,0},
			{0,0,1,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0},
			{1,0,0,0,1,0,1,1,1,1,1,0,0,1,1,1,0,1,0},
			{1,0,0,1,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0},
			{1,1,0,0,1,1,1,0,1,0,0,0,0,1,1,1,0,1,0},
			{0,1,1,0,0,0,0,0,1,0,0,1,0,1,0,0,0,0,0},
			{0,0,0,0,1,0,1,0,1,0,1,0,0,0,0,0,0,0,0},
			{0,1,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,1,0},
			{0,0,0,0,1,1,1,0,1,0,0,0,0,1,1,1,0,1,0},
			{0,1,1,0,0,0,0,0,1,0,1,1,0,0,0,0,0,1,0},
			{0,0,1,0,1,1,1,0,1,0,0,0,0,1,0,1,0,1,0},
			{0,0,1,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0},
			{0,0,1,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0},
			{1,0,0,0,1,0,1,1,1,1,1,0,0,1,1,1,0,1,0},
			{1,0,0,1,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0},
			{1,0,0,0,1,0,1,1,1,1,1,0,0,1,1,1,0,1,0},
			{0,0,0,0,1,0,1,0,1,0,1,0,0,0,0,0,0,0,0},
			{0,1,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,1,0},
			{0,0,0,0,1,1,1,0,1,0,0,0,0,1,1,1,0,1,0}
		};

		int x=0, y=0;               //  Variables de mapa
		int posX=0, posY=0;         //  Punto de partida
		String accion;              //  Variable para comandos
		boolean caminando = true;   //  Bandera para gestionar el final  

		int minX, minY, maxX, maxY; // Variables que controlan los limites
		minX=0; minY=0;             // Limites X e Y inferiores del mundo
		maxY=elMundo.length-1;      // Limite Y superior del mundo
		maxX=elMundo[0].length-1;   // Limite X superior del mundo

		int ePosX=12, ePosY=14;	// Coordenadas del enemigo
		int eMovimiento=0;		// Movimiento del enemigo (1,2,3,4 = n,s,e,o)

		while (caminando==true) {
		//  INICIO Impresión del mundo
		System.out.print("+"); for (int b=0;b<=maxX;b=b+1){	System.out.print("---");	} System.out.println("+");
		for (y=0;y<elMundo.length;y=y+1){
			System.out.print("|");
			for (x=0;x<elMundo[y].length;x=x+1){
				if((x==posX)&&(y==posY)) {
					System.out.print("\\O/");} 
				else if((x==ePosX)&&(y==ePosY)) {
					System.out.print("^+^");} 
				else {
					if (elMundo[y][x]==0) { System.out.print("   "); }  
					else		if (elMundo[y][x]==1) { System.out.print("[#]"); }                             
				}
			}
			System.out.println("|");
		}
		System.out.print("+"); for (int b=0;b<=maxX;b=b+1){	System.out.print("---");	} System.out.println("+");
		//  FIN Impresión del mundo

			// Pedir input del usuario
			System.out.print  ("Estas en ("+posX+","+posY+"). Ingrese comando: ");
			accion = entrada.nextLine();

			// Analizar el input del usuario
			if (accion.equals("w") && (posY>minY) && (elMundo[posY-1][posX]!=1)) 	{ posY = posY-1; }
			if (accion.equals("s") && (posY<maxY) && (elMundo[posY+1][posX]!=1)) 	{ posY = posY+1; }
			if (accion.equals("a") && (posX>minX) && (elMundo[posY][posX-1]!=1)) 	{ posX = posX-1; }
			if (accion.equals("d") && (posX<maxX) && (elMundo[posY][posX+1]!=1)) 	{ posX = posX+1; }
			
			// Mover al enemigo
			eMovimiento = (int)(Math.random()*4);
			if ((eMovimiento==0) && (ePosY>minY) && (elMundo[ePosY-1][ePosX]!=1)) 	{ ePosY = ePosY-1; }
			if ((eMovimiento==1) && (ePosY<maxY) && (elMundo[ePosY+1][ePosX]!=1)) 	{ ePosY = ePosY+1; }
			if ((eMovimiento==2) && (ePosX>minX) && (elMundo[ePosY][ePosX-1]!=1)) 	{ ePosX = ePosX-1; }
			if ((eMovimiento==3) && (ePosX<maxX) && (elMundo[ePosY][ePosX+1]!=1)) 	{ ePosX = ePosX+1; }

			if (accion.equals("f"))													{ caminando=false;}
		}
		}
}