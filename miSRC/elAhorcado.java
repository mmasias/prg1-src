import java.util.Scanner;
public class elAhorcado {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int i,j;
        String palabraPorAdivinar = "anacardo";
        String palabraAdivinada = "";
        String letrasAdivinadas = "";
        char letraPropuesta;
        char letraComparada;
        char letraPorAgregar;
        boolean haAdivinado;
        boolean elFin=false;
        String elVeredicto = "";
        int errores = 0;

        while(!elFin){
            System.out.print ("Ingrese letra: ");
            letraPropuesta=entrada.next().charAt(0);
            haAdivinado = false;
            for (i=0;i<palabraPorAdivinar.length();i=i+1){
                    letraComparada=palabraPorAdivinar.charAt(i);
                    if (letraPropuesta==letraComparada){
                        letrasAdivinadas = letrasAdivinadas+letraPropuesta;
                        haAdivinado = true;
                    }
            }

            if (haAdivinado) {
                System.out.println("La letra propuesta está!");
            } else {
                errores = errores+1;
                if (errores>=6) {
                    elVeredicto = "Perdió";
                    elFin=true;
                }
                System.out.println("No ha adivinado y lleva "+errores+" errores");
            }

            palabraAdivinada = "";
            for (i=0;i<palabraPorAdivinar.length();i=i+1){
                letraPorAgregar = '\0';
                for (j=0;j<letrasAdivinadas.length();j=j+1){
                    if (letrasAdivinadas.charAt(j)==palabraPorAdivinar.charAt(i)){
                        letraPorAgregar = palabraPorAdivinar.charAt(i);
                    }
                }

                if (letraPorAgregar!='\0'){
                    palabraAdivinada = palabraAdivinada+letraPorAgregar;
                }else{
                    palabraAdivinada = palabraAdivinada+"*";
                }
            }
            System.out.println ("Va adivinando: "+palabraAdivinada);
            if (palabraAdivinada.equals(palabraPorAdivinar)){
                elVeredicto = "Ganó";
                elFin=true;
            }
        }
        System.out.println(elVeredicto);

    }

}
