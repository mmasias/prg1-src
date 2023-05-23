import java.util.Scanner;
public class juegoDeLaOca001 {
    public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int jugador1, jugador2, jugador3;
		boolean alguienGano;
		String elGanador="";
		String variableTemporal="";
		int elDado;
		
		
		jugador1=0;
		jugador2=0;
		jugador3=0;
		
		alguienGano = false;
		
		do {
			System.out.println("Pulse una tecla para jugar...");
			variableTemporal = entrada.nextLine();
			System.out.println("=========================================================================================");
			System.out.println("0-0-0-0-0-0-0-0-0-1-1-1-1-1-1-1-1-1-1-2-2-2-2-2-2-2-2-2-2-3-3-3-3-3-3-3-3-3-3-4-4-4-4-4-4");
			System.out.println("1-2-3-4-5-6-7-8-9-0-1-2-3-4-5-6-7-8-9-0-1-2-3-4-5-6-7-8-9-0-1-2-3-4-5-6-7-8-9-0-1-2-3-4-5");
			System.out.println("-----------------------------------------------------------------------------------------");
			elDado = (int)(Math.random()*6+1);
			jugador1=jugador1+elDado;
			
			for (int i=1;i<jugador1;i=i+1){System.out.print("|o");}System.out.println("[1");
			
			elDado = (int)(Math.random()*6+1);
			jugador2=jugador2+elDado;
			for (int i=1;i<jugador2;i=i+1){System.out.print("|o");}System.out.println("[2");
			
			elDado = (int)(Math.random()*6+1);
			jugador3=jugador3+elDado;
			for (int i=1;i<jugador3;i=i+1){System.out.print("|o");}System.out.println("[3");
			
			if (jugador1>=45){alguienGano=true;elGanador="Jugador1";}
			else if (jugador2>=45){alguienGano=true;elGanador="Jugador2";}
			else if (jugador3>=45){alguienGano=true;elGanador="Jugador3";}


			
			
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println("Jugador1:["+jugador1+"] / Jugador2:["+jugador2+"] / Jugador3:["+jugador3+"]");
			System.out.println("=========================================================================================");			
		} while (alguienGano==false);
		
		System.out.println("Gano el "+elGanador);
	
	}
}