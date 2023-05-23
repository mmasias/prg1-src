import java.util.Scanner;
public class ventaFactura{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		String nombreCliente;
		String DNI;
		int precioUnitarioProducto1, cantidadProducto1, precioTotalProducto1;
		int precioUnitarioProducto2, cantidadProducto2, precioTotalProducto2;
		int precioUnitarioProducto3, cantidadProducto3, precioTotalProducto3;
		int precioUnitarioProducto4, cantidadProducto4, precioTotalProducto4;
		
		System.out.println(" ___________________________________________________________________________ ");
		System.out.println("");
		System.out.println("  Cliente : Johan Sebastian Mastropiero");
		System.out.println("");
		System.out.println("  DNI     : 5793425L");
		System.out.println("");
		System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
		System.out.println(" Producto                         Precio Unitario   Cantidad   Precio Total  ");
		System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");  System.out.println("");
		System.out.println("  Nombre del Producto 001                      35          5	       "+(35*5)); System.out.println("");
		System.out.println("  Nombre del Producto 002                      20          6	       "+(20*6)); System.out.println("");
		System.out.println("  Nombre del Producto 003                      75          4	       "+(75*4)); System.out.println("");
		System.out.println("  Nombre del Producto 004                      15          9	       "+(15*9)); System.out.println("");
		System.out.println("                                                                    -------- ");
		System.out.println("                                                                       "+((35*5)+(20*6)+(75*4)+(15*9)));
		System.out.println("                                                                    ======== ");
		System.out.println(" ___________________________________________________________________________ ");		
		
	}
}