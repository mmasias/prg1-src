import java.util.Scanner;
public class ventaFactura2{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		String clienteNombre;
		String clienteDNI;
		int precioUnitarioProducto1, cantidadProducto1, precioTotalProducto1;
		int precioUnitarioProducto2, cantidadProducto2, precioTotalProducto2;
		int precioUnitarioProducto3, cantidadProducto3, precioTotalProducto3;
		int precioUnitarioProducto4, cantidadProducto4, precioTotalProducto4;
		int precioTotal;
		
		precioUnitarioProducto1=35;
		precioUnitarioProducto2=20;
		precioUnitarioProducto3=75;
		precioUnitarioProducto4=15;

		System.out.print("Nombre del cliente   : "); clienteNombre = entrada.nextLine();
		System.out.print("DNI del cliente      : "); clienteDNI = entrada.nextLine();
		
		System.out.print("Cantidad de Producto1: "); cantidadProducto1 = entrada.nextInt();
		System.out.print("Cantidad de Producto2: "); cantidadProducto2 = entrada.nextInt();
		System.out.print("Cantidad de Producto3: "); cantidadProducto3 = entrada.nextInt();
		System.out.print("Cantidad de Producto4: "); cantidadProducto4 = entrada.nextInt();
		
		precioTotalProducto1 = cantidadProducto1 * precioUnitarioProducto1;
		precioTotalProducto2 = cantidadProducto2 * precioUnitarioProducto2;
		precioTotalProducto3 = cantidadProducto3 * precioUnitarioProducto3;
		precioTotalProducto4 = cantidadProducto4 * precioUnitarioProducto4;
		
		precioTotal = precioTotalProducto1+precioTotalProducto2+precioTotalProducto3+precioTotalProducto4;
		
		System.out.println(" ___________________________________________________________________________ ");
		System.out.println("");
		System.out.println("  Cliente : "+clienteNombre);
		System.out.println("");
		System.out.println("  DNI     : "+clienteDNI);
		System.out.println("");
		System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
		System.out.println("  Producto                        Precio Unitario   Cantidad   Precio Total  ");
		System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");  System.out.println("");
		System.out.println("  Nombre del Producto 001                      "+precioUnitarioProducto1+"          "+cantidadProducto1+"	       "+precioTotalProducto1); System.out.println("");
		System.out.println("  Nombre del Producto 002                      "+precioUnitarioProducto2+"          "+cantidadProducto2+"	       "+precioTotalProducto2); System.out.println("");
		System.out.println("  Nombre del Producto 003                      "+precioUnitarioProducto3+"          "+cantidadProducto3+"	       "+precioTotalProducto3); System.out.println("");
		System.out.println("  Nombre del Producto 004                      "+precioUnitarioProducto4+"          "+cantidadProducto4+"	       "+precioTotalProducto4); System.out.println("");
		System.out.println("                                                                    -------- ");
		System.out.println("                                                                      "+precioTotal);
		System.out.println("                                                                    ======== ");
		System.out.println(" ___________________________________________________________________________ ");		
		
	}
}