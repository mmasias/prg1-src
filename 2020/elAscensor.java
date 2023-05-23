import java.util.Scanner;
public class elAscensor{

	public static void main(String[] args){
	
		Scanner entrada = new Scanner(System.in);
		String accion;
		int ascensor[] 				= {0,0,0,0};	// Guarda el piso del ascensor
		int ascensorPisoPedido[]	= {0,0,0,0};	// Guarda el piso al que debe ir el ascensor
		int ascensorPersonas[] 		= {1,1,1,1};	// Guarda el n�mero de personas que hay en el ascensor
		int numeroPlantas = 20;
		boolean pisoSolicitado = false;
		int pisoPulso=0;
		int pisoAlQueVa=0;
		
		for (int minuto=0;minuto<720;minuto=minuto+1){
		
			if (!pisoSolicitado) {
				pisoPulso = (int)(Math.random()*20);
				//pisoAlQueVa = (int)(Math.random()*9);
				pisoSolicitado=true;
			}
		
			// Imprime situaci�n de los ascensores
			System.out.println("     [_________________________________________] ");
			for (int planta=numeroPlantas; planta>=0; planta=planta-1){
				System.out.print(String.format("%02d",planta)+">  ");
					for (int numeroAscensor=0; numeroAscensor<ascensor.length; numeroAscensor=numeroAscensor+1){
					
							if (ascensor[numeroAscensor]==planta) { System.out.print("[P:"+String.format("%02d",ascensorPisoPedido[numeroAscensor])+"|p:"+ascensorPersonas[numeroAscensor]+"] ");								
							} else {
								System.out.print(" | .��. |  ");
							}
					}
				System.out.println();
			}

			// recalcula situaci�n de los ascensores
			for (int numeroAscensor=0; numeroAscensor<ascensor.length; numeroAscensor=numeroAscensor+1){
							if 		(ascensor[numeroAscensor]<ascensorPisoPedido[numeroAscensor]) {ascensor[numeroAscensor]=ascensor[numeroAscensor]+1;}
							else if	(ascensor[numeroAscensor]>ascensorPisoPedido[numeroAscensor]) {ascensor[numeroAscensor]=ascensor[numeroAscensor]-1;} 
							else if	(ascensor[numeroAscensor]==ascensorPisoPedido[numeroAscensor]) {
								ascensorPersonas[numeroAscensor]=0;
								 if (pisoSolicitado) {
										ascensorPisoPedido[numeroAscensor]=pisoPulso;
										pisoSolicitado=false;
									} else {
									//	ascensorPisoPedido[numeroAscensor]=0;
									//	ascensorPersonas[numeroAscensor]=0;
								} 
							}

			}
			System.out.print("["+pisoPulso+"] ");
			accion = entrada.nextLine();
		}
			
	}

}
