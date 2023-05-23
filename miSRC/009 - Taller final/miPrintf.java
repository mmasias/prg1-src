public class miPrintf {
    public static void main(String[] args) {

        double precio = 155.23;
        double impuesto = 0.18;
        double precioFinal = precio * (1+impuesto);

        System.out.println ("Precio       : " + precio);
        System.out.println ("Impuesto     : " + impuesto);
        System.out.println ("Precio Total : " + precioFinal);
        System.out.println ();
        System.out.printf  ("Precio       : [%10.2f] \n",precio);
        System.out.printf  ("Impuesto     : [%10.2f] \n",impuesto);
        System.out.printf  ("Precio Total : [%10.2f] \n",precioFinal);

    }
}
