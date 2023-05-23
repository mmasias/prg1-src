import java.util.Scanner;
public class examenParcial1920 {
    public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int opcionUsuario =0;
		int factor1 = 0, factor2 = 0;
		int operacion = 0, operacionAleatoria=0;
		int dificultad = 0; // 0 Facil - 1 Normal - 2 Avanzado
		int numeroPreguntas;
		int respuestaUsuario=0, respuestaOperacion=0;
		double puntaje;
		String descriptorOperacion="";

		do {
				System.out.println ("(1) Configuracion / (2) Examen / (3) Salir : ");				
				opcionUsuario = entrada.nextInt();
		
				if (opcionUsuario==1) {
					System.out.print("Seleccione el factor a evaluar: ");
					factor1 	= entrada.nextInt();
					System.out.print("Nivel de dificultad (1) Facil / (2) Normal / (3) Avanzado : ");
					dificultad	= entrada.nextInt();
					System.out.print("Operacion (1) Suma / (2) Multiplicacion / (3) Ambas aleatorias : ");
					operacion	= entrada.nextInt();
				}
		
				if (opcionUsuario==2 && factor1!=0 && dificultad !=0) {
					puntaje		= 0; // Reseteamos el puntaje
					operacionAleatoria = 0;
					for(numeroPreguntas=1;numeroPreguntas<=5;numeroPreguntas=numeroPreguntas+1){
						if(dificultad==1){factor2=(int)(Math.random()*5+1);}
						if(dificultad==2){factor2=(int)(Math.random()*10+1);}
						if(dificultad==3){factor2=(int)(Math.random()*6+4);}
						
						if (operacion==3){if (Math.random()<0.5){operacionAleatoria=1;} else {operacionAleatoria=2;}}
						if (operacion==1 || operacionAleatoria==1){respuestaOperacion = factor1 * factor2;descriptorOperacion="*";}
						if (operacion==2 || operacionAleatoria==2){respuestaOperacion = factor1 + factor2;descriptorOperacion="+";}
						
						System.out.print("Cuanto es "+factor1+" "+descriptorOperacion+" "+factor2+" = ");
						respuestaUsuario = entrada.nextInt();
						
						if(respuestaOperacion==respuestaUsuario){
							puntaje=puntaje+2;
						} else {
							puntaje=puntaje-0.5;
						}
					}	
					System.out.println(puntaje);
				}
		} while (opcionUsuario!=3);		
	}
}