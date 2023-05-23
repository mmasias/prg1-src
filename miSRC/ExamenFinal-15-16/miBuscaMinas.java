import java.util.Scanner;

public class miBuscaMinas{

	static int[][] elTablero = {
		{0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0}
	};

// PROGRAMA PRINCIPAL

	public static void main(String[] args){

		int usuarioX, usuarioY;
		int minX=0, minY=0, maxY=elTablero.length, maxX=elTablero[0].length;
		int aciertos=0,errores=0, aciertosParaGanar, numeroDeMinas;
		Scanner entrada = new Scanner(System.in);

		// Configuración
			numeroDeMinas = 5;
			aciertosParaGanar = (elTablero.length*elTablero[0].length)-numeroDeMinas;
			System.out.println(aciertosParaGanar);
			asignaMinas(5);
			imprimeTablero();
		// El juego
			while((aciertos<aciertosParaGanar)&&(errores<3)){

				usuarioX=pideNumero("Ingrese X",1,7)-1;
				usuarioY=pideNumero("Ingrese Y",1,5)-1;

				if(elTablero[usuarioY][usuarioX]==0){elTablero[usuarioY][usuarioX]=2;aciertos++;System.out.println("Bien!");}
				if(elTablero[usuarioY][usuarioX]==1){elTablero[usuarioY][usuarioX]=3;errores++;System.out.println("Mal!");}

				imprimeTablero();

			}

		// Conclusiones
			if (errores==3){System.out.println("Ha perdido");}else{System.out.println("Ha ganado");}

	}

// ZONA DE FUNCIONES

// asignaMinas: Función que asigna minas aleatoriamente.
	static void asignaMinas(int cantidad){
		int minasAsignadas=0,miX,miY;
		while(minasAsignadas<cantidad){
			miX=(int) (Math.random()*5);
			miY=(int) (Math.random()*7);
			System.out.println("X:"+miX+" / Y:"+miY);
			if(elTablero[miX][miY]!=1){
				elTablero[miX][miY]=1;
				minasAsignadas=minasAsignadas+1;
			}
		}
	}


// Función que imprime el tablero
	static void imprimeTablero(){
		System.out.println("   1 2 3 4 5 6 7");
		System.out.println(" +---------------+");
		for (int k=0; k<5; k++) {
			System.out.print((k+1)+"| ");
			for (int l=0; l<7; l++) {
				if ((elTablero[k][l] == 0)||(elTablero[k][l] == 1)) {
					System.out.print("- ");
				} else if (elTablero[k][l] == 2) {
					System.out.print(". ");
				} else if (elTablero[k][l] == 3) {
					System.out.print("* ");
				}
			}
			System.out.println("|");
		}
		System.out.println(" +---------------+");
	}


// Función que sirve para pedir un número y además valida que esté dentro de un rango.
// Entrada: Texto a preguntar, valor mínimo y valor máximo
	static int pideNumero(String miTexto, int min, int max){
		int numeroPedido;
		Scanner entrada = new Scanner(System.in);
		do{
			System.out.print(miTexto+" (entre "+min+" y "+max+"): ");
			numeroPedido = entrada.nextInt();
		} while (!((numeroPedido>=min)&&(numeroPedido<=max)));
		return numeroPedido;
	}

}
