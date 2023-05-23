import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {

        double radio;
        double area;
        double perimetro;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Teclee el radio del círculo: ");
        radio = entrada.nextDouble();

        area = 3.1415 * radio * radio;
        perimetro = 2 * 3.1415 * radio;

        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);

    }

}
