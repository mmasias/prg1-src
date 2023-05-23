public class inputOutput2 {

    public static void main(String[] args){

        int i;

        char[] misCaracteres={'p','r','u','e','b','a'};

        for (i=0; i<misCaracteres.length; i=i+1){

            System.out.println(i + " -> " + misCaracteres[i]);

        }

        String miCadena = String.valueOf(misCaracteres);
        System.out.println (miCadena);

    }

}
