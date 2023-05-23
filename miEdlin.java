import java.util.Scanner;
public class miEdlin{
	public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);		
		String[] miTexto = {"","","","","","","","","",""};		//	Array que contiene el fichero
		String[] arrayUndo = {"","","","","","","","","",""};	//	Array que usare para el CTRL+Z
		int lineaActiva=0;										//	Linea activa
		String lineaTemporal;		
		int linea;
		int lineaOrigen, lineaDestino;
		String separador, comando, lineaEditada;
		boolean editando=true;
		
		while(editando){
		//	Interfaz de usuario - Mostrar las 10 lineas incluyendo la indicacion de la linea activa
			System.out.println(":-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:");
			for(linea=0;linea<=(miTexto.length)-1;linea=linea+1){
				if (linea==lineaActiva) {separador=":* ";} else {separador=":  ";}
				System.out.println("| "+(linea+1)+separador+miTexto[linea]);
			}
		//	Interfaz de usuario - Mostrar las barra de menu y esperar entrada del usuario
			System.out.println(":-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:");
			System.out.println(": [L]inea Activa | [E]ditar | [I]ntercambiar | [B]orrar | [D]eshacer | [S]alir");
			System.out.print("Ingrese comando:> ");
			comando=entrada.nextLine().toUpperCase();
			System.out.println(":-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:");

			// 	Inicio del codigo que gestiona el CTRL + Z 
			//	Esto no era obligatorio programarlo, bastaba con plantearlo
			//	No se asume el movimiento (cambio de linea activa) como accion que pueda deshacerse.
				for(linea=0;linea<=(miTexto.length)-1;linea=linea+1){
					if (comando.equals("D")) {miTexto[linea]=arrayUndo[linea];}
					else if (!comando.equals("L")) {arrayUndo[linea]=miTexto[linea];}
				}
			// 	Fin del codigo que gestiona el CTRL + Z

			if (comando.equals("E")){
			// 	Edicion		
				System.out.println("| "+miTexto[lineaActiva]);
				System.out.println(":-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:");
				lineaEditada=entrada.nextLine();
				miTexto[lineaActiva]=lineaEditada;	

			} else if (comando.equals("L")) {
			// 	Definicion de linea activa
				System.out.print("La linea activa es "+(lineaActiva+1)+". Ingrese la nueva linea activa: ");
				lineaActiva = entrada.nextInt()-1;	
				entrada.nextLine();	

			} else if (comando.equals("I")){
			// 	Intercambiar lineas
				System.out.print("Linea 1 a intercambiar: ");	lineaOrigen = entrada.nextInt()-1;
				System.out.print("Linea 2 a intercambiar: ");	lineaDestino = entrada.nextInt()-1;	
				entrada.nextLine();	
				lineaTemporal=miTexto[lineaDestino];
				miTexto[lineaDestino]=miTexto[lineaOrigen];
				miTexto[lineaOrigen]=lineaTemporal;

			} else if (comando.equals("B")) {
			//	Eliminar una linea
				System.out.print("Ingrese la linea a eliminar: ");
				linea = entrada.nextInt()-1;
				miTexto[linea]="";
			
			} else if (comando.equals("S")){
			//	Salir
				editando=false;

			}
		}
	}
}