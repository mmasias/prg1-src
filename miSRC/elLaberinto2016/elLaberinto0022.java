import java.util.Scanner;
public class elLaberinto0022{		// Versión que implementa antorcha y 5 gemas
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
			{0,0,1,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0},
			{0,0,1,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0},
			{1,0,0,0,1,0,1,1,1,1,1,0,0,1,1,1,0,1,0},
			{1,0,0,1,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0},
			{1,0,0,0,1,0,1,1,1,1,1,0,0,1,1,1,0,1,0},
			{0,0,0,0,1,0,1,0,1,0,1,0,0,0,0,0,0,0,0},
			{0,1,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,1,0},
			{0,0,0,0,1,1,1,0,1,0,0,0,0,1,1,1,0,1,0}
		};

		int x=0, y=0;								//  Variables de mapa
		int posX=0, posY=0;					//  Punto de partida
		String accion;								//  Variable para comandos
		boolean caminando = true;		//  Bandera para gestionar el final  

		int minX, minY, maxX, maxY;	// Variables que controlan los limites
		minX=0; minY=0;							// Limites X e Y inferiores del mundo
		maxY=elMundo.length-1;				// Limite Y superior del mundo
		maxX=elMundo[0].length-1;		// Limite X superior del mundo
		int alcanceAntorcha = 3;			// Alcance de la antorcha
		int gemasDisponibles = 5;		// 5 antorchas al inicio

		while (caminando==true) {
		// Limpiar pantalla 
		System.out.println("\033[H\033[2J");		// (Solo funciona en pantallas ANSI)
		System.out.flush();
		//  INICIO Impresión del mundo
		System.out.print("+"); for (int b=0;b<=maxX;b=b+1){	System.out.print("---");	} System.out.println("+");
		for (y=0;y<elMundo.length;y=y+1){
			System.out.print("|");
			for (x=0;x<elMundo[y].length;x=x+1){
				if ((x>posX-alcanceAntorcha)&&(x<posX+alcanceAntorcha)&&(y>posY-alcanceAntorcha)&&(y<posY+alcanceAntorcha)) {
					if((posX==x)&&(posY==y)) {
						System.out.print("\\O/");} 
					else {
						if (elMundo[y][x]==0) { System.out.print(" . "); }  
						else		if (elMundo[y][x]==1) { System.out.print("[#]"); }                             
					}
				} else {
					System.out.print(":::");
				}
			}
			System.out.println("|");
		}
		System.out.print("+"); for (int b=0;b<=maxX;b=b+1){	System.out.print("---");	} System.out.println("+");
		//  FIN Impresión del mundo

			// Pedir input del usuario
			System.out.print  ("Estas en ("+posX+","+posY+"). Gemas: "+gemasDisponibles+". Ingrese comando: ");
			accion = entrada.nextLine();

			// Analizar el input del usuario
			if (accion.equals("w") && (posY>minY) && (elMundo[posY-1][posX]!=1)) 	{ posY = posY-1; }
			if (accion.equals("s") && (posY<maxY) && (elMundo[posY+1][posX]!=1)) 	{ posY = posY+1; }
			if (accion.equals("a") && (posX>minX) && (elMundo[posY][posX-1]!=1)) 	{ posX = posX-1; }
			if (accion.equals("d") && (posX<maxX) && (elMundo[posY][posX+1]!=1)) 	{ posX = posX+1; }
			
			if (accion.equals("g") && (gemasDisponibles>0))	{ 
				alcanceAntorcha = 100; 
				gemasDisponibles = gemasDisponibles - 1;
			} else		{ 
				alcanceAntorcha = 3;
			}
				
			if (accion.equals("f"))	{ caminando=false;}
		}
		}
}