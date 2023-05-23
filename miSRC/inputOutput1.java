public class inputOutput1 {

    public static void main(String[] args){

        int i;

        String miCadena = "Prueba";
        System.out.println (miCadena);

        char[] misCaracteres=miCadena.toCharArray();

        for (i=0; i<misCaracteres.length; i=i+1){

            System.out.println(i + " -> " + misCaracteres[i]);

        }

    }

}
