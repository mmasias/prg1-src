import java.util.Scanner;
public class ejemploArray2D{

	public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
		String opcionDelUsuario;
		boolean salirDelJuego=false;
		int miFila=0, 			miColumna=0;
		int posicionFila=3, posicionColumna=3;
		int[][] unArray2D = {
			{0,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,4,4,5,5},
			{0,1,2,1,1,1,1,2,0,0,2,2,0,0,2,2,2,2,2,2,2,4,4,4,5,5},
			{0,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,4,4,5,5},
			{0,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
			{0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2},
			{0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,0,0,0,0,2},
			{0,1,0,0,0,0,2,2,2,2,2,0,3,3,3,0,0,0,2,6,2,2,6,2,2,2},
			{0,0,0,0,0,1,1,4,2,2,2,3,3,2,2,4,0,0,2,6,2,2,6,1,0,1},
			{1,2,1,0,0,0,2,2,3,3,3,3,2,2,2,2,0,0,2,6,2,2,6,1,0,2},
			{1,0,1,0,0,0,2,2,3,3,2,2,2,2,2,2,0,0,0,6,2,2,6,1,0,2},
			{1,0,1,0,0,0,2,4,3,2,2,2,2,2,2,4,0,0,0,6,2,2,6,1,0,2},
			{1,1,3,3,3,3,3,3,3,2,2,2,2,2,2,0,0,0,0,6,2,2,6,1,0,2},
			{3,3,3,0,0,0,1,4,3,3,3,2,2,2,2,4,0,0,0,6,2,2,6,1,1,1},
			{1,0,1,0,0,0,0,3,3,3,3,3,2,2,2,2,0,0,0,6,2,2,6,2,2,2},
			{1,0,1,0,0,0,0,3,3,3,3,3,2,2,2,2,0,0,0,6,2,2,6,2,2,2},
			{1,3,1,0,0,0,0,4,3,3,3,2,2,2,2,4,0,0,0,6,2,2,6,2,2,2},
			{1,1,1,0,0,0,0,0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,6,1,1,1},
			{1,0,0,0,0,0,1,4,2,2,2,2,2,2,2,4,0,0,4,6,2,2,6,0,0,1},
			{1,0,1,0,0,0,2,2,2,2,2,2,2,2,2,2,4,2,4,6,2,2,6,1,0,1},
			{1,1,1,0,0,2,2,2,2,2,2,2,2,2,2,2,4,4,4,6,2,2,6,1,0,1}
		};
		
		do{
			System.out.print("\033[H\033[2J");System.out.flush();
			// INICIO IMPRESION DEL MAPA 
			for(int i=0;i<unArray2D[0].length;i=i+1){System.out.print("---");}System.out.println();
			
			for (miFila=0; miFila<unArray2D.length; miFila = miFila+1) {
				// unArray2D[miFila]
				for (miColumna=0; miColumna<unArray2D[miFila].length; miColumna = miColumna+1) {
					
					if (miFila==posicionFila && miColumna==posicionColumna) {
						// IMPRIMO AL PERSONAJE
						System.out.print("_O_");
					} else {
						// IMPRIMO EL MAPA
						// INICIO DEL PARSEO
						if      (unArray2D[miFila][miColumna]==0)	{System.out.print(" . ");}	// Camino
						else if (unArray2D[miFila][miColumna]==1)	{System.out.print("[ ]");}	// Pared
						else if (unArray2D[miFila][miColumna]==2)	{System.out.print(".:.");}	// Cesped ("\033[1;32;42m.:.\u001b[0m");}	// Cesped
						else if (unArray2D[miFila][miColumna]==3)	{System.out.print("~~~");}	// Agua
						else if (unArray2D[miFila][miColumna]==4)	{System.out.print("*.*");}	// Arbustos
						else if (unArray2D[miFila][miColumna]==5)	{System.out.print("*O*");}	// Arbustos gruesos
						else if (unArray2D[miFila][miColumna]==6)	{System.out.print(":::");}	// Cesped alto
						// FIN DEL PARSEO
					}
				}
				System.out.println();
			}
			for(int i=0;i<unArray2D[0].length;i=i+1){System.out.print("---");}System.out.println();
			//System.out.println("F["+miFila+"] / C["+miColumna+"]");	
			// FIN IMPRESION DEL MAPA

			System.out.println("El personaje esta en fila ["+posicionFila+"] y columna ["+posicionColumna+"]");
			
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