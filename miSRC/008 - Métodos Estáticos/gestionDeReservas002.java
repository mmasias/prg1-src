import java.util.Scanner;

public class gestionDeReservas002{

  public static void main(String[] args){

    Scanner entrada = new Scanner(System.in);
    int i;
    int opcionElegida, aulaElegida;
    boolean salirSistema        = false;
    boolean[] estadoAulas       = new boolean[6]; // true: libre, false: ocupada
    String[] alumnoResponsable  = new String[6];
    String[] alumnosAsistentes  = new String[6];
    String miEstadoAula;

    for(i=0;i<6;i=i+1){
      estadoAulas[i]=true;
      alumnoResponsable[i]="";
      alumnosAsistentes[i]="";
    }

    while(salirSistema!=true){
        imprimeMenu();
        opcionElegida = entrada.nextInt();

        if (opcionElegida==1){
            listaAulas(estadoAulas, alumnoResponsable);
        }

        if (opcionElegida==2){
          System.out.println("Aula a reservar (0 para salir de reserva):");
          aulaElegida=entrada.nextInt();
          entrada.nextLine();
          if (aulaElegida!=0){
            if(estadoAulas[aulaElegida-1]==true){
              estadoAulas[aulaElegida-1]=false;
              System.out.println("Alumno responsable de la solicitud:");
              alumnoResponsable[aulaElegida-1]=entrada.nextLine();
              System.out.println("Alumnos asistentes:");
              alumnosAsistentes[aulaElegida-1]=entrada.nextLine();
              System.out.println("Aula "+aulaElegida+" reservada correctamente.");
            } else {
              System.out.println("El aula está ocupada");
            }
          }

        }

        if (opcionElegida==3){
          System.out.println("Aula a liberar (0 para salir de reserva):");
          aulaElegida=entrada.nextInt();
          if (aulaElegida!=0){
            if(estadoAulas[aulaElegida-1]==false){
              estadoAulas[aulaElegida-1]=true;
              alumnoResponsable[aulaElegida-1]="";
              alumnosAsistentes[aulaElegida-1]="";
              System.out.println("Aula "+aulaElegida+" liberada correctamente.");
            } else {
              System.out.println("El aula no estaba ocupada");
            }
          }
        }

        if (opcionElegida==4){
            System.out.println("Gracias por usar el Sistema de reservas de aulas");
            salirSistema=true;
        }

    }

  }


  public static void imprimeMenu(){
      System.out.println("-------------------------------------------------");
      System.out.println("1 - Listar aulas");
      System.out.println("2 - Reservar un aula");
      System.out.println("3 - Liberar un aula");
      System.out.println("4 - Salir del sistema");
      System.out.println("-------------------------------------------------");
      System.out.println("Ingrese una opción");
  }

  public static void listaAulas(boolean[] estado, String[] Responsable){
      int i;
      String miEstadoAula;
      for(i=0;i<estado.length;i=i+1){
        if (estado[i]==true) {miEstadoAula="Libre";} else {miEstadoAula="Ocupada";}
        System.out.println("Aula " + (i+1) + ": " + miEstadoAula + " - " + Responsable[i]);
      }
  }


}
