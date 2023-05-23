import java.util.Scanner;
public class evaluaIMC {

    public static void main(String[] args) {

        double miPeso;
        double miTalla;
        double miIMC;
        String miEstado="";

        Scanner entrada = new Scanner(System.in);

        System.out.println("Peso: ");
        miPeso = entrada.nextDouble();

        System.out.println("Talla: ");
        miTalla = entrada.nextDouble();

        miIMC = miPeso / (Math.pow(miTalla,2));
        System.out.println ("El IMC es:"+miIMC);

        if (miIMC < 18.5) { miEstado = "Peso insuficiente"; }
        if (miIMC >= 50) { miEstado = "Obesidad de tipo IV (extrema)"; }
        if ((miIMC >= 18.5) && (miIMC<25)) { miEstado = "Normopeso"; }
        if ((miIMC >= 25) && (miIMC<27)) { miEstado = "Sobrepeso grado I"; }
        if ((miIMC >= 27) && (miIMC<30)) { miEstado = "Sobrepeso grado II (preobesidad)"; }
        if ((miIMC >= 30) && (miIMC<35)) { miEstado = "Obesidad de tipo I"; }
        if ((miIMC >= 35) && (miIMC<40)) { miEstado = "Obesidad de tipo II"; }
        if ((miIMC >= 40) && (miIMC<50)) miEstado = "Obesidad de tipo III (mórbida)"

        System.out.println ("El estado es: "+miEstado);

    }
}
