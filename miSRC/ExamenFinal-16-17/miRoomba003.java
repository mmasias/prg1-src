import java.util.Scanner;
public class miRoomba003{	

	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
/*		int[][] elMundo= {
			{4,3,2,0,1,0,4,2},
			{3,2,1,0,1,3,2,3},
			{2,1,1,0,1,0,3,2},
			{0,0,0,0,1,0,0,2},
			{0,0,0,0,1,0,0,2},
			{0,0,0,0,1,0,0,2},
			{1,1,3,2,1,0,2,0}
		};
*/
		int[][] elMundo= {
			{0,0,0,0,1,1,1,0,1,0,0,0,1,1,1,0,1,0,0,1,1,1,0,1,0,0},
			{0,1,1,0,0,0,0,0,1,0,1,1,0,0,0,0,1,0,0,0,0,0,0,1,0,1},
			{0,0,1,0,1,1,1,0,1,0,0,0,1,0,1,0,1,0,0,1,1,1,0,1,0,0},
			{0,0,1,0,1,4,4,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1},
			{1,0,0,0,4,4,4,3,1,1,1,0,1,1,1,0,1,0,0,1,0,1,1,1,1,1},
			{1,0,4,4,4,4,4,3,0,0,1,0,0,0,0,0,0,0,1,1,0,3,3,0,0,1},
			{1,1,4,4,4,2,2,3,1,0,4,0,1,1,1,0,1,0,0,1,1,1,0,1,0,0},
			{0,1,4,4,4,0,0,0,1,0,0,1,1,0,0,0,0,0,0,0,0,0,0,1,0,0},
			{0,0,0,0,1,0,1,0,1,4,1,0,0,0,0,0,0,0,0,1,0,1,0,1,0,1},
			{0,1,0,0,0,0,0,0,0,0,0,0,1,1,3,1,1,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,1,1,1,0,1,0,0,0,1,1,4,0,1,0,0,1,1,1,0,1,0,0},
			{0,1,1,0,0,0,0,0,1,0,1,1,0,0,0,0,1,0,0,0,0,0,0,1,0,1},
			{0,0,1,0,1,1,1,0,1,0,0,0,1,0,1,0,1,0,0,1,1,1,0,1,0,0},
			{0,0,1,0,1,2,2,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1},
			{0,0,1,0,1,0,2,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1},
			{1,0,0,0,1,0,1,1,1,1,1,0,1,1,1,0,1,0,0,1,0,1,1,1,1,1},
			{1,0,3,3,3,0,0,0,0,0,1,0,0,0,0,0,0,4,1,1,0,1,2,1,2,1},
			{1,0,3,3,3,0,1,1,1,1,1,0,1,1,1,0,1,4,4,1,0,1,1,1,1,1},
			{0,0,0,0,1,0,1,0,1,0,1,0,0,0,0,0,0,0,0,1,0,1,2,1,2,1},
			{0,1,0,0,0,0,0,0,0,0,0,0,1,1,1,0,1,0,0,0,0,4,1,2,2,0},
			{0,0,0,0,1,1,1,0,1,0,0,0,1,1,1,0,1,0,0,1,1,1,0,1,0,0}
		};

		int[][] losItems;

		int x=0, y=0;               	//  Variables de mapa
		String accion;              	//  Variable para comandos
		boolean caminando = true;  	 	//  Bandera para gestionar el final 

		int minX, minY, maxX, maxY; 	// Variables que controlan los limites
		minX=0; minY=0;             	// Limites X e Y inferiores del mundo
		maxY=elMundo.length-1;      	// Limite Y superior del mundo
		maxX=elMundo[0].length-1;   	// Limite X superior del mundo

		int suciedadMundial = 0;		// Variable que analiza la limpieza del mundo

		int posX=(int) maxX/2, posY=(int) maxY/2;         	//  Punto de partida
		double elMovimiento=0;
		long misPasos=0;

		int xTmp, yTmp, suciedadAlEste, suciedadAlNorte, suciedadAlOeste, suciedadAlSur, suciedadTotal;
		

		while (caminando==true) {
			//  INICIO Impresión del mundo
			suciedadMundial=0;
			System.out.print("+"); for (int b=0;b<=maxX;b=b+1){	System.out.print("---");	} System.out.println("+");
			for (y=0;y<elMundo.length;y=y+1){
				System.out.print("|");
				for (x=0;x<elMundo[y].length;x=x+1){

						suciedadMundial = suciedadMundial + elMundo[y][x];

						if((x==posX)&&(y==posY)) 					{ System.out.print("(O)");} 	
					 	else {
								if (elMundo[y][x]==0) 				{ System.out.print(" . "); }  
								else	if (elMundo[y][x]==1) 		{ System.out.print("ooo"); } 
								else	if (elMundo[y][x]==2) 		{ System.out.print("OOO"); }
								else	if (elMundo[y][x]==3) 		{ System.out.print("000"); }      
								else	if (elMundo[y][x]==4) 		{ System.out.print("***"); }                         
							}
				}
				System.out.println("|");
			}
			System.out.print("+"); for (int b=0;b<=maxX;b=b+1){	System.out.print("---");	} System.out.println("+");
			//  FIN Impresión del mundo

			// Pedir input del usuario
			System.out.print  ("Aspiradora en ("+posX+","+posY+"). Pasos: "+misPasos+". Suciedad: "+suciedadMundial+". Ingrese comando: ");
			//accion = entrada.nextLine();
			accion = "";
			System.out.println("");
			// Analizar el input del usuario
			if 		(accion.equals("w")) 	{ elMovimiento=4; }
			else if (accion.equals("s")) 	{ elMovimiento=3; }
			else if (accion.equals("a")) 	{ elMovimiento=2; }
			else if (accion.equals("d")) 	{ elMovimiento=1; }
			else 							{ 

				// Si el usuario no ha movido, la aspiradora se mueve sola
				suciedadAlEste	= 0;
				suciedadAlNorte	= 0;
				suciedadAlOeste	= 0;
				suciedadAlSur	= 0;
				suciedadTotal 	= 0;
				
				for (yTmp=0;yTmp<posY;yTmp=yTmp+1)						{suciedadAlNorte = suciedadAlNorte 	+ elMundo[yTmp][posX];}
				for (yTmp=posY;yTmp<elMundo.length;yTmp=yTmp+1)			{suciedadAlSur = suciedadAlSur	  	+ elMundo[yTmp][posX];}
				for (xTmp=0;xTmp<posX;xTmp=xTmp+1)						{suciedadAlOeste = suciedadAlOeste 	+ elMundo[posY][xTmp];}
				for (xTmp=posX;xTmp<elMundo[posY].length;xTmp=xTmp+1)	{suciedadAlEste = suciedadAlEste	+ elMundo[posY][xTmp];}
				
				suciedadTotal=suciedadAlNorte+suciedadAlSur+suciedadAlEste+suciedadAlOeste;

				System.out.print  ("MODULO DE LIMPIEZA: Suciedad N:"+suciedadAlNorte+" S:"+suciedadAlSur+" E:"+suciedadAlEste+" O:"+suciedadAlOeste+" / Total:"+suciedadTotal+" / ");
				
				elMovimiento = Math.random()*suciedadTotal;
				if (elMovimiento<=suciedadAlNorte)										{elMovimiento = 4; System.out.print  ("Mov. Norte");} 
				else if (elMovimiento<=(suciedadAlNorte+suciedadAlSur)) 				{elMovimiento = 3; System.out.print  ("Mov. Sur");}
				else if (elMovimiento<=(suciedadAlNorte+suciedadAlSur+suciedadAlEste)) 	{elMovimiento = 1; System.out.print  ("Mov. Este");}
				else 																	{elMovimiento = 2; System.out.print  ("Mov. Oeste");}
				
			}
			
			System.out.println("");
			
			if 		((elMovimiento>3) && (posY>minY) ) 	{ posY = posY-1; }
			else if ((elMovimiento>2) && (posY<maxY) ) 	{ posY = posY+1; }
			else if ((elMovimiento>1) && (posX>minX) ) 	{ posX = posX-1; }
			else if	((elMovimiento>0) && (posX<maxX) ) 	{ posX = posX+1; }

			if (elMundo[posY][posX]!=0) {elMundo[posY][posX]=elMundo[posY][posX]-1;}

			if (accion.equals("f")||(suciedadMundial==0))	{ caminando=false;}

			misPasos = misPasos + 1;
			for(long xyz=0;xyz<=500000000;xyz++){}
		}

		System.out.println("*******************");
		if (suciedadMundial==0) { 
			System.out.println("Se ha terminado de limpiar."); 
		} else { 
			System.out.println("Queda aun algo sucio."); 
		}
		System.out.println("*******************");
	}
}