import java.util.Scanner;
public class dashboard{
  public static void main(String[] args){

	int fila, columna;
	int numeroDeAlumnos=0, alumnosSentados=0;
	boolean hayClase = true;
	int alumnosLlegan=0;
	Scanner entrada = new Scanner(System.in);
	String iconoAlumno="";

	while(hayClase){

		System.out.print("Numero de alumnos que entran o salen. (Utilice 9999 para terminar): ");
		alumnosLlegan = entrada.nextInt();
		
		if (alumnosLlegan==9999){
			hayClase=false;
		} else {
			numeroDeAlumnos = numeroDeAlumnos + alumnosLlegan;
			if (numeroDeAlumnos>56){numeroDeAlumnos=56;}
			if (numeroDeAlumnos<0){numeroDeAlumnos=0;}
		} 

	//	Dibujo del aula
		System.out.println("+======================================+");
		System.out.println(" Alumnos:"+numeroDeAlumnos);
		System.out.println("+======================================+");
		alumnosSentados=0;
		for (fila=1;fila<=7;fila=fila+1){
			System.out.print("| ");
			for (columna=1;columna<=8;columna=columna+1){
				if (alumnosSentados<numeroDeAlumnos){iconoAlumno=" _0_";alumnosSentados=alumnosSentados+1;}else{iconoAlumno=" _'_";}
				System.out.print(iconoAlumno);
				if (columna==4){System.out.print("    ");}
			
			}
			System.out.println(" |");
		}
		System.out.println("+======================================+");

	}
  }
}