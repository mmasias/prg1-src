/*
sistema de reserva de aulas de sala de estudio. 6 salas(2 grandes y 4 pequeñas). Maria.
1-opc: listar aulas, 2-opc: reservar aula(1-Aula a reservar,2-responsables,3-asistentes),3-opc: liberar aula,4-opc salir
*/
import java.util.Scanner;
public class SalaDeEstudio{
	public static void main(String[] args){

		boolean[] aula=new boolean[]{false,false,false,false,false,false};
		int opcMenu,opcAula;
		String[] responsable=new String[6];
		String[] asistentes=new String[6];
		boolean libre=true;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Sistema de reserva - Aulas de estudio");

		do{
			System.out.print("\n1-Listar aulas\n2-Reservar un aula\n3-Liberar un aula\n4-Salir del sistema");
			System.out.print("\nIngrese opcion: ");
			opcMenu=entrada.nextInt();
			if(opcMenu==1){
				for(int i=0;i<6;i++)
					if(aula[i]==false)
						System.out.printf("\nAula %d - Libre",i+1);
					else
						System.out.printf("\nAula %d - Ocupada - %s",i+1,responsable[i]);
				System.out.println("\n");
			}else if(opcMenu==2){
					do{
						System.out.print("\nIngrese el aula a reservar:(0 para cancelar)\t");
						opcAula=entrada.nextInt();
						while(opcAula<0||opcAula>6){
							System.out.print("\nIngrese el aula a reservar:(0 para cancelar)\t");
							opcAula=entrada.nextInt();
						}
						if(opcAula!=0){
							if(aula[opcAula-1]==true){
								System.out.printf("\nEl aula %d esta ocupada!",opcAula);
								libre=false;
							}else{
								libre=true;
								aula[opcAula-1]=true;
							}
						}else
							libre=true;
					}while(libre==false);
					if(opcAula!=0){
						System.out.print("\nNombre del responsable:\t");
						entrada.nextLine();
						responsable[opcAula-1]=entrada.nextLine();
						System.out.print("\nAsistentes:\t");
						asistentes[opcAula-1]=entrada.nextLine();
						System.out.print("\nAula reservada correctamente!\n");
					}
				}else if(opcMenu==3){
						System.out.print("\nLiberar un aula\nIngrese el aula a liberar (0 para salir):\t");
						opcAula=entrada.nextInt();
						while(opcAula<0||opcAula>6){
							System.out.print("\nLiberar un aula\nIngrese el aula a liberar (0 para salir):\t");
							opcAula=entrada.nextInt();
						}
						if(aula[opcAula-1]==true)
							aula[opcAula-1]=false;
						System.out.printf("\nEl aula %d ha sido liberada!\n",opcAula);
				}
		}while(opcMenu!=4);
		System.out.print("\nEl programa ha terminado satisfactoriamente");
	}
}
