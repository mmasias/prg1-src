public class diarioDeMarco{

    public static void main(String[] args){

        double distanciaMarcoMadre=350;

        double velocidadMarco, horasMarco, avanceMarco;
        double velocidadMadre, horasMadre, avanceMadre;
        double probabilidadLluviaMarco, probabilidadLluviaMadre;
        double probabilidadMonoCansado;
        double probabilidadMonoEscapa;
        double probabilidadHaberVistoMadre;

        String descripcionClimaMarco, descripcionClimaMadre;
        String avanceDeMarco, avanceDeMadre;
        String cosasDelMono;
        String resumenDelDia;

        int diasDeViaje=1;
        System.out.println ("DIARIO DEL VIAJE DE MARCO");
        System.out.println ("=========================");

        while(distanciaMarcoMadre>0){


            // Recorrido de Marco
            velocidadMarco  = 10 + Math.random()*5;
            horasMarco      = 8 + Math.random()*2;

            probabilidadLluviaMarco = Math.random();
            if (probabilidadLluviaMarco<=0.1){
                velocidadMarco = velocidadMarco * 0.25;
                descripcionClimaMarco = "¡Ha llovido muchisimo!";
            } else if (probabilidadLluviaMarco<=0.3) {
                velocidadMarco = velocidadMarco * 0.75;
                descripcionClimaMarco = "Ha llovido un poco.";
            } else {
                descripcionClimaMarco = "Ha hecho un buen día.";
            }

            // El mono Amedio
            cosasDelMono = "";

            probabilidadMonoEscapa = Math.random();
            if (probabilidadMonoEscapa<=0.15){
                horasMarco = horasMarco-2;
                cosasDelMono = "Amedio se escapó. ";
            }

            probabilidadMonoCansado = Math.random();
            if (probabilidadMonoCansado<=0.2){
                velocidadMarco = velocidadMarco * 0.9;
                cosasDelMono = cosasDelMono + "Amedio ha estado cansado y he tenido que llevarlo en brazos. ";
            }

            // Calculo y descripción de Marco
            avanceMarco = velocidadMarco * horasMarco;
            avanceDeMarco = "Avance "+horasMarco+" horas a "+velocidadMarco+" Km/h recorriendo "+avanceMarco+" Km. ";


            // Recorrido de la Madre
            velocidadMadre = 6 + Math.random()*3;
            horasMadre = 6 + Math.random()*3;

            probabilidadLluviaMadre = Math.random();
            if (probabilidadLluviaMadre<=0.1){
                velocidadMadre = velocidadMadre * 0.25;
                descripcionClimaMadre = "A mamá le ha llovido muchisimo!";
            } else if (probabilidadLluviaMadre<=0.3) {
                velocidadMadre = velocidadMadre * 0.75;
                descripcionClimaMadre = "A mamá le ha llovido un poco";
            } else {
                descripcionClimaMadre = "A mamá le ha hecho un buen día";
            }

            avanceMadre = velocidadMadre*horasMadre;
            avanceDeMadre = "Mama pudo avanzar "+horasMadre+" horas a "+velocidadMadre+" Km/h recorriendo "+avanceMadre+" Km";

            // Distancia al final del día
            distanciaMarcoMadre = distanciaMarcoMadre - avanceMarco + avanceMadre;

            // Al final del día, Marco podría escuchar noticias de su madre
            if (distanciaMarcoMadre<50) {
                probabilidadHaberVistoMadre = Math.random();
                if (probabilidadHaberVistoMadre<0.5){
                    distanciaMarcoMadre = distanciaMarcoMadre - 25;
                    avanceDeMarco = avanceDeMarco + "¡De pronto a Marco le dicen que han visto a su mamá, y rompe a correr!";
                }
            }

            // Resumen del día
            if (distanciaMarcoMadre>0){
                resumenDelDia = "Al final del dia "+diasDeViaje+" la distancia entre Marco y su Madre es de "+distanciaMarcoMadre+" Km.";
            } else {
                resumenDelDia = "Al final del dia "+diasDeViaje+" Marco encuentra a su madre!";
            }


            System.out.println (" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
            System.out.println ("BITACORA DEL DIA "+diasDeViaje);
            System.out.println (descripcionClimaMarco);
            System.out.println (cosasDelMono);
            System.out.println (avanceDeMarco);
            System.out.println (descripcionClimaMadre);
            System.out.println (avanceDeMadre);
            System.out.println (resumenDelDia);
            System.out.println ("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

            diasDeViaje = diasDeViaje + 1;


        }

    }

}
