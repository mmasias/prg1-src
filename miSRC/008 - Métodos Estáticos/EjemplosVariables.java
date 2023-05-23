public class EjemplosVariables {

    static int miEntero=3;

  public static void main(String[] args) {

    int primerEntero;
    int segundoEntero;
    int miSuma;

    primerEntero = 12;
    segundoEntero = 24;
    miSuma = sumaDosEnteros(primerEntero, segundoEntero);

    System.out.print ("La suma de " + primerEntero);
    System.out.print (" más " + segundoEntero);
    System.out.println (" es " + miSuma);

    System.out.println (" La global es " + miEntero);

  }

  public static int sumaDosEnteros(int entero1, int entero2){

    int suma;
    suma = entero1 + entero2;
    return suma;

  }

}
