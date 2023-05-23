import java.util.Scanner;
public class elLaberinto0072{	//	Version que intenta implementar punto de llegada y deteccion de colisiones
								//	Agregamos la obscuridad
								//	Y ya de paso, una antorcha
								// 	Y una gema psiquica
								//	El heroe puede dejar obstaculos
								//	Diferenciamos los obstaculos y le permitimos al heroe atravesar sus obstaculos
								//  Retomamos la obscuridad
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		int[][] elMundo= {
			{0,0,0,0,1,1,1,0,1,0,0,0,1,1,1,0,1,0,0,1,1,1,0,1,0,0},
			{0,0,0,0,0,0,0,0,1,0,1,1,0,0,0,0,1,0,0,0,0,0,0,1,0,1},
			{0,0,1,0,1,1,1,0,1,0,0,0,1,0,1,0,1,0,0,1,1,1,0,1,0,0},
			{0,0,1,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1},
			{1,0,0,0,1,0,1,1,1,1,1,0,1,1,1,0,1,0,0,1,0,1,1,1,1,1},
			{1,0,0,1,1,0,0,0,0,0,1,0,0,0,0,0,0,0,1,1,0,0,0,0,0,1},
			{1,1,0,0,1,1,1,0,1,0,0,0,1,1,1,0,1,0,0,1,1,1,0,1,0,0},
			{0,1,1,0,0,0,0,0,1,0,0,1,1,0,0,0,0,0,0,0,0,0,0,1,0,0},
			{0,0,0,0,1,0,1,0,1,0,1,0,0,0,0,0,0,0,0,1,0,1,0,1,0,1},
			{0,1,0,0,0,0,0,0,0,0,0,0,1,1,1,0,1,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,1,1,1,0,1,0,0,0,1,1,1,0,1,0,0,1,1,1,0,1,0,0},
			{0,1,1,0,0,0,0,0,1,0,1,1,0,0,0,0,1,0,0,0,0,0,0,1,0,1},
			{0,0,1,0,1,1,1,0,1,0,0,0,1,0,1,0,1,0,0,1,1,1,0,1,0,0},
			{0,0,1,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1},
			{0,0,1,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1},
			{1,0,0,0,1,0,1,1,1,1,1,0,1,1,1,0,1,0,0,1,0,1,1,1,1,1},
			{1,0,0,1,1,0,0,0,0,0,1,0,0,0,0,0,0,0,1,1,0,0,0,0,0,1},
			{1,0,0,0,1,0,1,1,1,1,1,0,1,1,1,0,1,0,0,1,0,1,1,1,1,1},
			{0,0,0,0,1,0,1,0,1,0,1,0,0,0,0,0,0,0,0,1,0,1,0,1,0,1},
			{0,1,0,0,0,0,0,0,0,0,0,0,1,1,1,0,1,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,1,1,1,0,1,0,0,0,1,1,1,0,1,0,0,1,1,1,0,1,0,0}
		};

		int[][] losItems;


		int x=0, y=0;               //  Variables de mapa
		int posX=0, posY=0;         //  Punto de partida
		int llX=25, llY=20;			//	Punto de llegada
		String accion;              //  Variable para comandos
		boolean caminando = true;   //  Bandera para gestionar el final 
		boolean haLlegado = false;	//	Bandera para ver si ha llegado a la meta 
		boolean haChocado = false;	// 	Bandera para ver si se chocó con algún vampiro
		boolean gemaPsiquica = false;	// Bandera de la gema psiquica

		int minX, minY, maxX, maxY; // Variables que controlan los limites
		minX=0; minY=0;             // Limites X e Y inferiores del mundo
		maxY=elMundo.length-1;      // Limite Y superior del mundo
		maxX=elMundo[0].length-1;   // Limite X superior del mundo
		int alcanceAntorcha = 5;			// Alcance de la antorcha

		int ePosX[]={14,14,9,3}, 
			ePosY[]={7,11,16,17};	// Coordenadas del enemigo
		int eMovimiento=0;			// Movimiento del enemigo (1,2,3,4 = n,s,e,o)

		while (caminando==true) {
		//  INICIO Impresión del mundo
		System.out.print("+"); for (int b=0;b<=maxX;b=b+1){	System.out.print("---");	} System.out.println("+");
		for (y=0;y<elMundo.length;y=y+1){
			System.out.print("|");
			for (x=0;x<elMundo[y].length;x=x+1){

				if ((x>posX-alcanceAntorcha)&&(x<posX+alcanceAntorcha)&&(y>posY-alcanceAntorcha)&&(y<posY+alcanceAntorcha)) {
					if((x==posX)&&(y==posY)) 					{ System.out.print("\\#/");} 	
						else if((x==ePosX[0])&&(y==ePosY[0])) 	{ System.out.print("^+^"); }
					 	else if((x==ePosX[1])&&(y==ePosY[1])) 	{ System.out.print("^+^"); }
					 	else if((x==ePosX[2])&&(y==ePosY[2])) 	{ System.out.print("^+^"); }
					 	else if((x==ePosX[3])&&(y==ePosY[3])) 	{ System.out.print("^+^"); }
					 	else {
							if (elMundo[y][x]==0) 				{ System.out.print("   "); }  
							else	if (elMundo[y][x]==1) 		{ System.out.print("[#]"); } 
							else	if (elMundo[y][x]==2) 		{ System.out.print("***"); }                             
						}
				} 	else if ((gemaPsiquica==true)&&(x==ePosX[0])&&(y==ePosY[0])) 	{ System.out.print("^+^"); }
					else if ((gemaPsiquica==true)&&(x==ePosX[1])&&(y==ePosY[1])) 	{ System.out.print("^+^"); }
					else if ((gemaPsiquica==true)&&(x==ePosX[2])&&(y==ePosY[2])) 	{ System.out.print("^+^"); }
					else if ((gemaPsiquica==true)&&(x==ePosX[3])&&(y==ePosY[3])) 	{ System.out.print("^+^"); }

				 else {
					System.out.print("   ");
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
			
			// Mover los enemigos
			for (int eNumero=0;eNumero<4;eNumero=eNumero+1){
				eMovimiento = (int)(Math.random()*4);
				if ((eMovimiento==0) && (ePosY[eNumero]>minY) && (elMundo[ePosY[eNumero]-1][ePosX[eNumero]]==0)) 	{ ePosY[eNumero] = ePosY[eNumero]-1; }
				if ((eMovimiento==1) && (ePosY[eNumero]<maxY) && (elMundo[ePosY[eNumero]+1][ePosX[eNumero]]==0)) 	{ ePosY[eNumero] = ePosY[eNumero]+1; }
				if ((eMovimiento==2) && (ePosX[eNumero]>minX) && (elMundo[ePosY[eNumero]][ePosX[eNumero]-1]==0)) 	{ ePosX[eNumero] = ePosX[eNumero]-1; }
				if ((eMovimiento==3) && (ePosX[eNumero]<maxX) && (elMundo[ePosY[eNumero]][ePosX[eNumero]+1]==0)) 	{ ePosX[eNumero] = ePosX[eNumero]+1; }	
				if ((posX==ePosX[eNumero])&&(posY==ePosY[eNumero])) {haChocado=true;}			
			}

			if (accion.equals("f") || haChocado)	{ caminando=false;}

			if (accion.equals("g"))					{ alcanceAntorcha = 100;}	else 	{ alcanceAntorcha = 3;}
			if (accion.equals("p"))					{ gemaPsiquica = true;}		else 	{ gemaPsiquica = false;}

			if (accion.equals("1"))	{ elMundo[posY][posX]=2;}

			if (posX==llX && posY==llY) {caminando = false; haLlegado = true;}		//	Detección de la llegada
		}
						System.out.println("*******************");
		if (haLlegado) {System.out.println("***  VICTORIA  ***");}
		if (haChocado) {System.out.println("*** HAS MUERTO ***");}
						System.out.println("*******************");
	}
}