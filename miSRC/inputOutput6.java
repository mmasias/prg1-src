public class inputOutput6 {

    public static void main(String[] args){

        int i;

        String miCadena = "Prueba";


        char[] misCaracteres=miCadena.toCharArray();

        String miCadenaEncriptada;
        char[] misCaracteresEncriptados = new char[miCadena.length()];

        for (i=0; i<misCaracteres.length; i=i+1){
            misCaracteresEncriptados[i] = (char)(misCaracteres[i]+5);

            System.out.print(i);
            System.out.print(" -> " + misCaracteres[i]);
            System.out.print(" -> " + (int) misCaracteres[i]);
            System.out.print(" -> " + (int)(misCaracteresEncriptados[i]) );
            System.out.print(" -> " + (char)(misCaracteresEncriptados[i]) );
            miPrueba();

        }
        System.out.println (miCadena);
        miCadenaEncriptada = String.valueOf(misCaracteresEncriptados);
        System.out.println (miCadenaEncriptada);

    }

    public static void miPrueba(){
        System.out.println (" ----- ");
    }

}
