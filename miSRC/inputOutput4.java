public class inputOutput4 {

    public static void main(String[] args){

        int i;

        String miCadena = "Prueba";
        System.out.println (miCadena);

        char[] misCaracteres=miCadena.toCharArray();

        for (i=0; i<misCaracteres.length; i=i+1){

            System.out.print(i);
            System.out.print(" -> " + misCaracteres[i]);
            System.out.print(" -> " + (int) misCaracteres[i]);
            System.out.print(" -> " + (int)(misCaracteres[i]+5) );
            //System.out.print(" -> " + (char)(misCaracteres[i]+5) );
            System.out.println();

        }

    }

}
