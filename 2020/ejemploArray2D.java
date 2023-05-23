import java.util.Scanner;

// https://stackoverflow.com/questions/56679782/how-to-use-ansi-escape-sequence-color-codes-for-psreadlineoption-v2-in-powershel
// https://i.stack.imgur.com/KTSQa.png
/*
		Ansi Esc[ sequence (CSI)
						  Foreground     Background
		No Color     normal bright  normal bright
		0  black       30     90      40    100
		1  red         31     91      41    101
		2  green       32     92      42    102
		3  yellow      33     93      43    103
		4  blue        34     94      44    104
		5  violet      35     95      45    105
		6  turqoise    36     96      46    106
		7  grey        37     97      47    107	
*/

public class ejemploArray2D{

	public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
		String opcionDelUsuario;
		boolean salirDelJuego=false;
		int miFila=0, 			miColumna=0;
		int posicionFila=10, posicionColumna=14;
		int alcanceAntorcha = 5;
		int hora=4, minutos=0;
		int[][] unArray2D = {
			{4,4,1,1,1,4,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1,1,7,4,7,1,1,2,2,2,2,2,2,4,4,4,4,4,4,9,9,9,9,9,9},{4,1,0,1,0,1,2,2,2,1,1,1,2,2,4,4,2,2,2,2,2,2,4,4,2,1,2,2,2,1,2,2,2,2,2,2,2,2,1,1,1,0,1,1,1,2,2,2,2,2,2,4,1,1,1,1,1,4,4,4,9,9,9},{4,1,0,0,0,1,2,2,1,0,0,0,1,2,4,4,1,1,1,1,1,2,4,4,2,1,1,1,1,1,2,2,2,2,2,2,2,2,2,1,0,0,0,1,2,2,2,2,2,2,2,2,1,0,0,0,1,2,4,4,4,9,9},{4,1,1,0,1,1,2,0,2,0,1,0,1,2,2,2,1,0,0,0,1,2,2,2,2,7,2,7,2,7,2,2,2,2,2,2,2,2,2,1,0,0,0,1,2,2,2,2,2,2,2,2,0,0,1,0,0,2,4,4,4,4,9},{2,1,0,0,0,1,2,0,1,0,1,0,1,2,2,2,1,0,0,0,1,2,2,2,7,6,3,3,3,6,7,2,2,2,2,2,2,2,2,1,0,0,0,1,2,2,2,2,2,2,2,2,1,0,1,0,1,2,4,4,4,4,9},{2,1,1,0,1,1,2,0,1,0,1,3,1,2,2,4,1,0,0,0,1,4,2,2,4,3,3,5,3,3,4,2,2,2,2,2,2,2,2,1,0,0,0,1,2,2,2,2,2,2,2,2,1,3,1,3,1,2,4,4,4,4,4},{2,2,2,0,2,2,2,0,2,1,1,1,2,2,2,2,1,0,1,0,1,2,2,4,4,3,3,5,3,3,4,2,2,2,2,2,2,2,1,1,1,0,1,1,1,2,2,2,2,2,2,4,1,1,1,1,1,4,4,4,4,4,4},{2,2,2,0,2,2,2,0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,4,7,6,3,3,3,6,7,2,2,2,2,2,2,2,1,1,2,2,2,1,1,2,2,2,2,2,2,2,4,4,4,4,4,2,4,4,4,4,4},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4,2,7,4,7,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,4,4,4,4,4,4,4,4,4,4,4},{4,2,4,4,2,2,4,2,4,4,2,2,4,4,2,2,4,4,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,4,4,4,4,4,4,4,4,4,4,4},{1,1,1,1,1,1,1,1,1,1,1,1,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4},{0,0,0,0,0,0,0,0,0,0,0,6,1,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4},{0,1,0,1,0,1,1,1,0,0,0,0,0,1,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4},{0,1,0,1,0,1,0,0,0,1,1,0,0,0,1,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4},{0,1,0,1,0,1,0,1,0,0,1,0,1,0,1,1,1,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4},{0,1,0,1,0,0,0,1,0,0,1,0,1,0,1,0,1,1,1,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4},{0,0,0,1,0,1,1,1,1,0,1,0,0,0,0,0,6,0,1,1,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,7,2,2,2,7,4,4,4,4,7,2,7,4,4,4,4,4,7,2,7,4,4,4,4,4,7},{0,0,0,0,0,0,0,0,0,0,1,0,1,1,1,0,1,0,0,1,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,7,2,2,2,2,2,7,4,4,7,2,2,2,7,4,4,4,7,2,2,2,7,4,4,4,7,2},{1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,1,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,7,2,2,2,2,2,2,2,7,4,7,2,2,2,7,4,4,4,7,2,2,2,7,4,4,7,2,2},{0,0,1,0,0,1,0,1,0,0,0,0,0,0,1,0,0,0,0,0,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,7,2,2,2,2,2,2,2,7,4,7,2,2,2,7,4,7,7,7,2,2,2,7,7,7,2,2,2},{1,0,1,0,0,0,0,0,1,0,1,0,0,0,1,0,1,0,1,1,4,4,4,4,4,4,4,4,4,4,4,4,4,4,7,2,2,2,2,3,2,2,2,2,7,2,2,2,2,2,7,2,2,2,2,2,2,2,2,2,2,2,2},{0,1,0,1,1,1,0,1,0,1,0,1,0,1,0,0,0,0,0,1,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,2,2,2,3,3,3,2,2,2,2,2,2,3,2,2,2,2,2,2,2,3,2,2,2,2,2,2,3},{0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1,1,1,1,4,4,4,4,4,4,4,4,4,4,4,4,4,4,7,2,2,2,2,3,2,2,2,2,7,2,2,2,2,2,7,2,2,2,2,2,2,2,2,2,2,2,2},{0,1,0,1,1,1,1,0,1,0,0,1,0,1,1,0,0,0,0,1,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,7,2,2,2,2,2,2,2,7,4,7,2,2,2,7,4,7,7,7,2,2,2,7,7,7,2,2,2},{0,0,0,0,0,0,1,0,1,0,0,1,0,1,0,0,0,6,1,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,7,2,2,2,2,2,2,2,7,4,7,2,2,2,7,4,4,4,7,2,2,2,7,4,4,7,2,2},{0,0,7,7,0,0,1,0,1,0,1,1,0,0,0,6,1,1,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,7,2,2,2,2,2,7,4,4,7,2,2,2,7,4,4,4,7,2,2,2,7,4,4,4,7,2},{0,7,3,3,7,0,1,0,1,0,1,0,0,0,6,1,1,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,7,2,2,2,7,4,4,4,4,7,2,7,4,4,4,4,4,7,2,7,4,4,4,4,4,7},{0,7,3,3,7,0,0,0,1,0,0,0,6,1,1,1,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4},{0,0,7,7,0,1,1,0,1,0,6,0,1,1,4,4,4,4,4,4,4,4,4,4,4,2,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4},{0,0,0,0,0,0,0,0,0,0,0,0,1,4,4,4,4,2,4,4,2,4,4,2,2,2,2,2,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4},{1,1,1,1,1,1,1,1,1,1,1,1,2,4,2,4,2,2,4,2,2,2,4,2,2,2,2,2,2,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,3,3},{2,2,2,2,4,2,2,2,2,2,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,3,3,3,3,3,4},{2,4,6,5,6,6,5,6,5,6,2,2,2,2,2,2,5,6,5,6,2,2,2,2,2,2,2,2,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,3,3,3,3,4,4,3,4,4},{6,5,5,3,3,3,3,3,3,3,5,2,5,2,2,2,3,3,3,3,1,1,2,2,2,2,2,4,0,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,3,3,3,3,3,3,3,4,4},{3,3,3,3,3,3,2,3,3,3,3,5,3,5,5,3,2,3,3,3,3,1,2,2,2,2,4,0,0,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,3,3,4,4,4,4,4,4,4},{3,3,3,3,2,3,5,5,3,3,3,3,3,3,3,3,5,5,3,3,3,1,2,1,1,2,4,0,0,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,3,3,3,3,3,4,4,4,4,4,4,4},{3,5,5,4,4,4,4,5,5,3,3,3,5,3,3,3,4,5,5,3,3,1,2,1,5,2,2,4,0,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,3,3,3,3,3,4,4,3,3,4,4,4,4,4,4,9},{3,5,4,4,4,4,4,4,5,4,5,3,4,5,3,3,4,4,5,4,5,1,2,1,3,3,4,4,0,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,3,3,3,3,3,3,3,3,3,3,3,4,4,4,4,4,4,9,9},{1,1,1,1,1,4,2,4,4,5,4,4,4,4,5,5,5,4,4,4,1,1,2,1,3,3,3,4,4,4,4,4,4,4,4,4,4,4,4,4,3,3,4,4,3,3,3,3,3,4,4,4,4,4,4,4,4,4,4,4,9,9,9},{1,0,0,0,1,2,4,4,5,5,2,4,4,4,4,4,4,4,4,2,2,2,2,1,3,3,3,3,3,4,4,4,4,4,4,3,3,3,3,3,3,3,4,4,3,3,4,4,4,4,4,4,4,4,4,4,4,9,9,9,9,9,4},{1,0,0,0,0,4,2,4,4,2,4,4,4,2,4,4,2,4,4,2,2,2,2,1,1,5,5,3,3,3,3,3,3,3,3,3,4,3,3,3,3,3,4,4,4,4,4,4,4,4,4,4,4,4,4,4,9,9,9,9,9,1,1},{1,0,0,0,1,4,4,4,4,4,4,4,2,4,4,2,4,4,4,4,4,4,4,4,4,4,4,5,3,3,3,3,3,3,3,3,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,9,9,4,4,4,4,1},
		};
		
		System.out.print("\033[H\033[2J");System.out.flush();
		do{
			// MAPA DE COLORES // https://i.stack.imgur.com/KTSQa.png
			System.out.print("\033[0;0H");System.out.flush();
			// INICIO IMPRESION DEL MAPA 
			for(int i=0;i<unArray2D[0].length;i=i+1){System.out.print("---");}System.out.println();
			
			for (miFila=0; miFila<unArray2D.length; miFila = miFila+1) {
				// unArray2D[miFila]
				for (miColumna=0; miColumna<unArray2D[miFila].length; miColumna = miColumna+1) {
					
					if (miFila==posicionFila && miColumna==posicionColumna) {
						// IMPRIMO AL PERSONAJE
						System.out.print("_O_");
					} else {
						// IMPRIMO EL MAPA (si puedo...)
						if ((Math.pow(posicionFila-miFila,2)+Math.pow(posicionColumna-miColumna,2))<=(Math.pow(alcanceAntorcha,2))) {
							// INICIO DEL PARSEO
							if      (unArray2D[miFila][miColumna]==mW.ID_CAMINO)	{System.out.print(mW.CAMINO);}	
							else if (unArray2D[miFila][miColumna]==mW.ID_PARED)	{System.out.print(mW.PARED);}	
							else if (unArray2D[miFila][miColumna]==mW.ID_CESPED)	{System.out.print(mW.CESPED);}	
							else if (unArray2D[miFila][miColumna]==mW.ID_AGUA)		{System.out.print(mW.AGUA);}	
							else if (unArray2D[miFila][miColumna]==mW.ID_ARBUSTOS){System.out.print(mW.ARBUSTOS);}	
							else if (unArray2D[miFila][miColumna]==5)	{System.out.print("\033[48;5;71m" + "*O*" + mFC.RESET);}	// Arbustos gruesos
							else if (unArray2D[miFila][miColumna]==6)	{System.out.print("\033[48;5;22m" + ":::" + mFC.RESET);}	// Cesped alto
							else if (unArray2D[miFila][miColumna]==mW.ID_ARBOL)	{System.out.print(mW.ARBOL);}
							else if (unArray2D[miFila][miColumna]==mW.ID_PICO)		{System.out.print(mW.PICO);}
							// FIN DEL PARSEO
						} else {
							System.out.print(mW.TINIEBLAS);
						}
					}
				}
				System.out.println();				
			}
			for(int i=0;i<unArray2D[0].length;i=i+1){System.out.print("---");}System.out.println();
			//System.out.println("F["+miFila+"] / C["+miColumna+"]");	
			// FIN IMPRESION DEL MAPA

			// Intento mugre de hora & antorcha
				minutos=minutos+5;
				if (minutos==60){hora=hora+1;minutos=0;}
				if (hora==25){hora=0;}
				if (hora<4){alcanceAntorcha=5;} 
					else if (hora <5){alcanceAntorcha=7;}
					else if (hora <6){alcanceAntorcha=9;}
					else if (hora <7){alcanceAntorcha=11;}
					else {alcanceAntorcha=70;}
			// Fin de intento mugre

			System.out.println("Son las ["+hora+"]:["+minutos+"] / El personaje esta en fila ["+posicionFila+"] y columna ["+posicionColumna+"]");
			
			System.out.println("Ingrese opcion: w/a/s/d (f:Salir)");
			opcionDelUsuario=entrada.nextLine();		
			
			if(opcionDelUsuario.equals("f")){salirDelJuego=true;}
			else if (opcionDelUsuario.equals("w")){posicionFila=posicionFila-1;}
			else if (opcionDelUsuario.equals("a")){posicionColumna=posicionColumna-1;}
			else if (opcionDelUsuario.equals("s")){posicionFila=posicionFila+1;}
			else if (opcionDelUsuario.equals("d")){posicionColumna=posicionColumna+1;}
			
		}while (!salirDelJuego);


	}
}

class mW {
	
	public static final String TINIEBLAS 	= 	mFC.INICIO + mFC.BLUE + mFC.BLUE_BACKGROUND + " . " + mFC.RESET;
	
	public static final int ID_CAMINO		= 	0;
	public static final String CAMINO 		= 	mFC.INICIO + mFC.RED + mFC.YELLOW_BACKGROUND_BRIGHT + " . " + mFC.RESET;
	
	public static final int ID_PARED			= 	1;
	public static final String PARED 		= 	mFC.INICIO + mFC.WHITE_BOLD + mFC.WHITE_BACKGROUND + "|||" + mFC.RESET;
	
	public static final int ID_CESPED 		= 	2;
	public static final String CESPED 		= 	mFC.INICIO + mFC.BLUE + mFC.GREEN_BACKGROUND_BRIGHT + ".:'" + mFC.RESET;
	
	public static final int ID_AGUA 			= 	3;
	public static final String AGUA 			= 	mFC.INICIO + mFC.WHITE + mFC.BLUE_BACKGROUND_BRIGHT + " ~ " + mFC.RESET;

	public static final int ID_ARBUSTOS		= 	4;
	public static final String ARBUSTOS 	= 	mFC.INICIO + mFC.GREEN_BOLD + mFC.GREEN_BACKGROUND + ". '" + mFC.RESET;

	public static final int ID_ARBOL 		= 	7;
	public static final String ARBOL 		= 	mFC.INICIO + mFC.RED 					+ mFC.GREEN_BACKGROUND + "*" + mFC.RESET + 
															mFC.INICIO + mFC.BLACK_BOLD 			+ mFC.GREEN_BACKGROUND + "Y" + mFC.RESET + 
															mFC.INICIO + mFC.RED 					+ mFC.GREEN_BACKGROUND + "*" + mFC.RESET;
													
	public static final int ID_PICO	 		= 	9;
	public static final String PICO 			= 	mFC.INICIO + mFC.WHITE 			+ mFC.BLACK_BACKGROUND + "/" + mFC.RESET + 
															mFC.INICIO + mFC.WHITE 			+ mFC.BLACK_BACKGROUND + "\\" + mFC.RESET + 
															mFC.INICIO + mFC.WHITE_BOLD	+ mFC.BLACK_BACKGROUND + "^" + mFC.RESET;	
	
	
	
}

class mFC {

	 public static final String RESET = "\033[0m";  // Text Reset
	 public static final String INICIO = "\033[";	// Inicio de la cadena de color

    // LETRA
	 
	 // Regular 
    public static final String BLACK = "0;30";   // BLACK
    public static final String RED = "0;31";     // RED
    public static final String GREEN = "0;32";   // GREEN
    public static final String YELLOW = "0;33";  // YELLOW
    public static final String BLUE = "0;34";    // BLUE
    public static final String PURPLE = "0;35";  // PURPLE
    public static final String CYAN = "0;36";    // CYAN
    public static final String WHITE = "0;37";   // WHITE

    // Bold
    public static final String BLACK_BOLD = "1;30";  // BLACK
    public static final String RED_BOLD = "1;31";    // RED
    public static final String GREEN_BOLD = "1;32";  // GREEN
    public static final String YELLOW_BOLD = "1;33"; // YELLOW
    public static final String BLUE_BOLD = "1;34";   // BLUE
    public static final String PURPLE_BOLD = "1;35"; // PURPLE
    public static final String CYAN_BOLD = "1;36";   // CYAN
    public static final String WHITE_BOLD = "1;37";  // WHITE

    // Underline
    public static final String BLACK_UNDERLINED = "4;30";  // BLACK
    public static final String RED_UNDERLINED = "4;31";    // RED
    public static final String GREEN_UNDERLINED = "4;32";  // GREEN
    public static final String YELLOW_UNDERLINED = "4;33"; // YELLOW
    public static final String BLUE_UNDERLINED = "4;34";   // BLUE
    public static final String PURPLE_UNDERLINED = "4;35"; // PURPLE
    public static final String CYAN_UNDERLINED = "4;36";   // CYAN
    public static final String WHITE_UNDERLINED = "4;37";  // WHITE

    // FONDOS
	 
	 // Normales
    public static final String BLACK_BACKGROUND 			= ";40m";  // BLACK
    public static final String RED_BACKGROUND 				= ";41m";    // RED
    public static final String GREEN_BACKGROUND 			= ";42m";  // GREEN
    public static final String YELLOW_BACKGROUND			= ";43m"; // YELLOW
    public static final String BLUE_BACKGROUND 				= ";44m";   // BLUE
    public static final String PURPLE_BACKGROUND			= ";45m"; // PURPLE
    public static final String CYAN_BACKGROUND 				= ";46m";   // CYAN
    public static final String WHITE_BACKGROUND 			= ";47m";  // WHITE

    // High Intensity
    public static final String BLACK_BRIGHT 					= ";0;90m";  // BLACK
    public static final String RED_BRIGHT 					= ";0;91m";    // RED
    public static final String GREEN_BRIGHT 					= ";0;92m";  // GREEN
    public static final String YELLOW_BRIGHT 				= ";0;93m"; // YELLOW
    public static final String BLUE_BRIGHT 					= ";0;94m";   // BLUE
    public static final String PURPLE_BRIGHT 				= ";0;95m"; // PURPLE
    public static final String CYAN_BRIGHT 					= ";0;96m";   // CYAN
    public static final String WHITE_BRIGHT 					= ";0;97m";  // WHITE

    // Bold High Intensity
    public static final String BLACK_BOLD_BRIGHT 			= ";1;90m"; // BLACK
    public static final String RED_BOLD_BRIGHT 				= ";1;91m";   // RED
    public static final String GREEN_BOLD_BRIGHT			= ";1;92m"; // GREEN
    public static final String YELLOW_BOLD_BRIGHT 			= ";1;93m";// YELLOW
    public static final String BLUE_BOLD_BRIGHT 			= ";1;94m";  // BLUE
    public static final String PURPLE_BOLD_BRIGHT 			= ";1;95m";// PURPLE
    public static final String CYAN_BOLD_BRIGHT 			= ";1;96m";  // CYAN
    public static final String WHITE_BOLD_BRIGHT 			= ";1;97m"; // WHITE

    // High Intensity backgrounds
    public static final String BLACK_BACKGROUND_BRIGHT 	= ";0;100m";// BLACK
    public static final String RED_BACKGROUND_BRIGHT 		= ";0;101m";// RED
    public static final String GREEN_BACKGROUND_BRIGHT 	= ";0;102m";// GREEN
    public static final String YELLOW_BACKGROUND_BRIGHT 	= ";0;103m";// YELLOW
    public static final String BLUE_BACKGROUND_BRIGHT 	= ";0;104m";// BLUE
    public static final String PURPLE_BACKGROUND_BRIGHT 	= ";0;105m"; // PURPLE
    public static final String CYAN_BACKGROUND_BRIGHT 	= ";0;106m";  // CYAN
    public static final String WHITE_BACKGROUND_BRIGHT 	= ";0;107m";   // WHITE

}