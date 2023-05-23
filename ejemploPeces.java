import java.util.Scanner;
public class ejemploPeces{
	public static void main(String[] args){
		
		Scanner entrada = new Scanner(System.in);
		int pesoMaximo 	= 0;
		int pesoActual 	= 0;
		int pescaActual 	= 0;
		
		System.out.println("Ingrese usted el peso máximo: ");
		pesoMaximo = entrada.nextInt();
		
		while (pesoActual<pesoMaximo){
			// Simular la pesca
			//System.out.println("Ingrese usted cuanto ha pescado: ");
			//pescaActual = entrada.nextInt();
			pescaActual = (int) (Math.random() * 5 + 4); 
			System.out.print ("Pesca de " + pescaActual + " Kg / ");
			
			// Calcular el pesoActual
			pesoActual = pesoActual + pescaActual;
			System.out.println ("Peso actual de " + pesoActual + " Kg");
		}
	}
}