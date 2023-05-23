import java.util.Scanner;
public class elLaberinto0051{	//	Version que intenta implementar un conjunto de enemigos que se mueven aleatoriamente
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

		int ePosX[]={14,14,9,3}, 
			ePosY[]={7,11,16,17};	// Coordenadas del enemigo
		int eMovimiento=0;			// Movimiento del enemigo (1,2,3,4 = n,s,e,o)

		while (caminando==true) {
		//  INICIO Impresión del mundo
		System.out.print("+"); for (int b=0;b<=maxX;b=b+1){	System.out.print("---"); } System.out.println("+");
		for (y=0;y<elMundo.length;y=y+1){
			System.out.print("|");
			for (x=0;x<elMundo[y].length;x=x+1){
				if((x==posX)&&(y==posY)) 					{System.out.print("\\O/"); }
					else if((x==ePosX[0])&&(y==ePosY[0])) 	{ System.out.print("^+^"); }
					else if((x==ePosX[1])&&(y==ePosY[1])) 	{ System.out.print("^+^"); }
					else if((x==ePosX[2])&&(y==ePosY[2])) 	{ System.out.print("^+^"); }
					else if((x==ePosX[3])&&(y==ePosY[3])) 	{ System.out.print("^+^"); }
					else {
						if (elMundo[y][x]==0) { System.out.print("   "); }  
						else		if (elMundo[y][x]==1) { System.out.print("[#]"); }                             
					}
			}
			System.out.println("|");
		}
		System.out.print("+"); for (int b=0;b<=maxX;b=b+1){	System.out.print("---"); } System.out.println("+");
		//  FIN Impresión del mundo

			// Pedir input del usuario
			System.out.print  ("Estas en ("+posX+","+posY+"). Ingrese comando: ");
			accion = entrada.nextLine();

			// Analizar el input del usuario
			if (accion.equals("w") && (posY>minY) && (elMundo[posY-1][posX]!=1)) 	{ posY = posY-1; }
			if (accion.equals("s") && (posY<maxY) && (elMundo[posY+1][posX]!=1)) 	{ posY = posY+1; }
			if (accion.equals("a") && (posX>minX) && (elMundo[posY][posX-1]!=1)) 	{ posX = posX-1; }
			if (accion.equals("d") && (posX<maxX) && (elMundo[posY][posX+1]!=1)) 	{ posX = posX+1; }
			
			// Mover los enemigos
			for (int eNumero=0;eNumero<4;eNumero=eNumero+1){
				eMovimiento = (int)(Math.random()*4);
				if ((eMovimiento==0) && (ePosY[eNumero]>minY) && (elMundo[ePosY[eNumero]-1][ePosX[eNumero]]!=1)) 	{ ePosY[eNumero] = ePosY[eNumero]-1; }
				if ((eMovimiento==1) && (ePosY[eNumero]<maxY) && (elMundo[ePosY[eNumero]+1][ePosX[eNumero]]!=1)) 	{ ePosY[eNumero] = ePosY[eNumero]+1; }
				if ((eMovimiento==2) && (ePosX[eNumero]>minX) && (elMundo[ePosY[eNumero]][ePosX[eNumero]-1]!=1)) 	{ ePosX[eNumero] = ePosX[eNumero]-1; }
				if ((eMovimiento==3) && (ePosX[eNumero]<maxX) && (elMundo[ePosY[eNumero]][ePosX[eNumero]+1]!=1)) 	{ ePosX[eNumero] = ePosX[eNumero]+1; }				
			}

			if (accion.equals("f"))		{ caminando=false;}
		}
	}
}