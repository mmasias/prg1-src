public class miJavaDiscurso {
    public static void main(String[] args){

    	String[][] miDiscurso = new String[15][4];

    	miDiscurso[0][0]="Queridos compañeros: ";
    	miDiscurso[0][1]="la realización de las premisas del programa ";
    	miDiscurso[0][2]="nos obliga a un exhaustivo análisis ";
    	miDiscurso[0][3]="de las condiciones financieras y administrativas existentes. ";
    	miDiscurso[1][0]="Por otra parte,y dados los condicionamientos actuales ";
    	miDiscurso[1][1]="la complejidad de los estudios de los dirigentes ";
    	miDiscurso[1][2]="cumple un rol escencial en la formación ";
    	miDiscurso[1][3]="de las directivas de desarrollo para el futuro. ";
    	miDiscurso[2][0]="Asimismo, ";
    	miDiscurso[2][1]="el aumento constante, en cantidad y en extensión, de nuestra actividad ";
    	miDiscurso[2][2]="exige la precisión y la determinación ";
    	miDiscurso[2][3]="del sistema de participación general. ";
    	miDiscurso[3][0]="Sin embargo no hemos de olvidar que ";
    	miDiscurso[3][1]="la estructura actual de la organización ";
    	miDiscurso[3][2]="ayuda a la preparación y a la realización ";
    	miDiscurso[3][3]="de las actitudes de los miembros hacia sus deberes ineludibles. ";
    	miDiscurso[4][0]="De igual manera, ";
    	miDiscurso[4][1]="el nuevo modelo de actividad de la organización, ";
    	miDiscurso[4][2]="garantiza la participación de un grupo importante en la formación ";
    	miDiscurso[4][3]="de las nuevas proposiciones. ";
    	miDiscurso[5][0]="La práctica de la vida cotidiana prueba que, ";
    	miDiscurso[5][1]="el desarrollo continuo de distintas formas de actividad ";
    	miDiscurso[5][2]="cumple deberes importantes en la determinación ";
    	miDiscurso[5][3]="de las direcciones educativas en el sentido del progreso. ";
    	miDiscurso[6][0]="No es indispensable argumentar el peso y la significación de estos problemas ya que, ";
    	miDiscurso[6][1]="nuestra actividad de información y propaganda ";
    	miDiscurso[6][2]="facilita la creación ";
    	miDiscurso[6][3]="del sistema de formación de cuadros que corresponda a las necesidades. ";
    	miDiscurso[7][0]="Las experiencias ricas y diversas muestran que, ";
    	miDiscurso[7][1]="el reforzamiento y desarrollo de las estructuras ";
    	miDiscurso[7][2]="obstaculiza la apreciación de la importancia ";
    	miDiscurso[7][3]="de las condiciones de las actividades apropiadas. ";
    	miDiscurso[8][0]="El afán de organización, pero sobre todo ";
    	miDiscurso[8][1]="la consulta con los numerosos militantes ";
    	miDiscurso[8][2]="ofrece un ensayo interesante de verificación ";
    	miDiscurso[8][3]="del modelo de desarrollo. ";
    	miDiscurso[9][0]="Los superiores principios ideológicos, condicionan que ";
    	miDiscurso[9][1]="el inicio de la acción general de formación de las actitudes ";
    	miDiscurso[9][2]="implica el proceso de reestructuración y modernización ";
    	miDiscurso[9][3]="de las formas de acción. ";
    	miDiscurso[10][0]="Incluso, bien pudiéramos atrevernos a sugerir que ";
    	miDiscurso[10][1]="un relanzamiento específico de todos los sectores implicados ";
    	miDiscurso[10][2]="habrá de significar un auténtico y eficaz punto de partida ";
    	miDiscurso[10][3]="de las básicas premisas adoptadas. ";
    	miDiscurso[11][0]="Es obvio señalar que, ";
    	miDiscurso[11][1]="la superación de experiencias periclitadas ";
    	miDiscurso[11][2]="permite en todo caso explicitar las razones fundamentales ";
    	miDiscurso[11][3]="de toda una casuística de amplio espectro. ";
    	miDiscurso[12][0]="Pero pecaríamos de insinceros si soslayásemos que, ";
    	miDiscurso[12][1]="una aplicación indiscriminada de los factores confluyentes ";
    	miDiscurso[12][2]="asegura, en todo caso, un proceso muy sensible de inversión ";
    	miDiscurso[12][3]="de los elementos generadores. ";
    	miDiscurso[13][0]="Y además, quedaríamos inmersos en la más abyecta de las estulticias si no fueramos consacientes de que, ";
    	miDiscurso[13][1]="la condición sine qua non rectora del proceso ";
    	miDiscurso[13][2]="radica en una elaboración cuidadosa y sistemática de las estrategias adecuadas ";
    	miDiscurso[13][3]="para configurar una interface amigable y coadyuvante a la reingeniería del sistema. ";
    	miDiscurso[14][0]="Por último, y como definitivo elemento esclarecedor, cabe añadir que, ";
    	miDiscurso[14][1]="el proceso consensuado de unas y otras aplicaciones concurrentes ";
    	miDiscurso[14][2]="deriva de una indirecta incidencia superadora ";
    	miDiscurso[14][3]="de toda una serie de criterios ideológicamente sistematizados en un frente común de actuación regeneradora. ";

    	int i, fila, columna, extension;

        extension = (int) ((Math.random()*10)+5);

    	for (i=0; i<extension; i=i+1) {
            for (columna=0; columna<4; columna=columna+1){
                fila = (int) (Math.random()*miDiscurso.length);
                System.out.print(miDiscurso[fila][columna]);
            }
            System.out.println();
	   }
    }
}
