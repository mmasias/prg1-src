import java.util.Scanner;
public class elAscensor002{

	public static void main(String[] args){
	
		Scanner entrada = new Scanner(System.in);
		String accion;
		int ascensor[] 				= {0,0,0,0};	// Guarda el piso del ascensor
		int ascensorPisoPedido[]	= {0,0,0,0};	// Guarda el piso al que debe ir el ascensor
		int ascensorPersonas[] 		= {0,1,1,1};	// Guarda el número de personas que hay en el ascensor
		int numeroPlantas = 20;
		boolean pisoSolicitado = false;
		int pisoPulso=0;
		int pisoAlQueVa=0;
		int pisoAlQueVan[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};	// Adonde van en cada planta
		
		for (int minuto=0;minuto<720;minuto=minuto+1){
		
			if (Math.random()<0.3) {
				pisoPulso = (int)(Math.random()*20);
				pisoAlQueVan[pisoPulso]=(int)(Math.random()*20);
				pisoSolicitado = true;
			}
			
			
		
			// Imprime situación de los ascensores
			System.out.println("     [_________________________________________] ");
			for (int planta=numeroPlantas; planta>=0; planta=planta-1){
				System.out.print(String.format("%02d",planta)+">  ");
					for (int numeroAscensor=0; numeroAscensor<ascensor.length; numeroAscensor=numeroAscensor+1){
					
							if (ascensor[numeroAscensor]==planta) { System.out.print("[P:"+String.format("%02d",ascensorPisoPedido[numeroAscensor])+"|p:"+ascensorPersonas[numeroAscensor]+"] ");								
							} else {
								System.out.print(" | .¨¨. |  ");
							}
					}
					
				System.out.print(" ["+pisoAlQueVan[planta]+"]");
				if (planta==pisoPulso && pisoSolicitado) {System.out.print(" Click!"); pisoSolicitado=false;}
				System.out.println();
			}

			// recalcula situación de los ascensores
			for (int numeroAscensor=0; numeroAscensor<ascensor.length; numeroAscensor=numeroAscensor+1){
				if (ascensor[numeroAscensor]==0 && pisoSolicitado) {ascensorPisoPedido[numeroAscensor]=pisoPulso; pisoSolicitado=false;} 
				if 		(ascensor[numeroAscensor]<ascensorPisoPedido[numeroAscensor]) {ascensor[numeroAscensor]=ascensor[numeroAscensor]+1;}
				else if	(ascensor[numeroAscensor]>ascensorPisoPedido[numeroAscensor]) {ascensor[numeroAscensor]=ascensor[numeroAscensor]-1;} 
				else if	(ascensor[numeroAscensor]==ascensorPisoPedido[numeroAscensor]) {
					//ascensorPersonas[numeroAscensor]=0;
					ascensorPisoPedido[numeroAscensor]=pisoAlQueVan[ascensor[numeroAscensor]];
					pisoAlQueVan[ascensor[numeroAscensor]]=0;
				}

			}
			System.out.print("Van ["+minuto+"] min.");
			accion = entrada.nextLine();
		}
			
	}

}
