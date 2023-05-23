public class tablaDeMultiplicar {

  public static void main(String[] args) {

    int miNumero;
    miNumero = Integer.parseInt(args[0]);

    int miFactor;

    for (miFactor=0; miFactor<13; miFactor=miFactor+1){
      System.out.println(miNumero + " x " + miFactor + " = " + miNumero*miFactor);
    }

  }

}
