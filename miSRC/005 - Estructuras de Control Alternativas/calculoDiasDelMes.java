import java.util.Scanner;
public class calculoDiasDelMes {

    public static void main(String[] args) {

        int numeroMes;
        int diasDelMes=0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Nro. de mes: ");
        numeroMes = entrada.nextInt();

        if (numeroMes == 1) {
    			diasDelMes = 31;
    		}

        if (numeroMes == 3) {
    			diasDelMes = 31;
    		}

        if (numeroMes == 5) {
    			diasDelMes = 31;
    		}

        if (numeroMes == 7) {
    			diasDelMes = 31;
    		}

        System.out.println("Los dias del " + numeroMes + "º mes son: " + diasDelMes);
    }
}
