import java.util.Scanner;

public class luchaRPG{
  public static void main(String[] args){

	int vidaHeman=100, ataqueHeman=20;
	int vidaVampiro=80, ataqueVampiro=20;
	double   probabilidadAtaque=50;
	double   probabilidadExito=0;
	int armaHeman=0;
	boolean vampiroHuyo=false;
	double probabilidadMegaAtaque;
	double probabilidadExitoMegaAtaque;

	Scanner entrada = new Scanner(System.in);

	while ((vidaHeman>0)&&(vidaVampiro>0)&&(vampiroHuyo!=true)) {

		if (vidaHeman>0) {
			System.out.println("Seleccione el arma de Heman: (1) Espada / (2) Matraca / (3) Azada :");
			armaHeman = entrada.nextInt();

			if (armaHeman==1){
				ataqueHeman = 20;
				probabilidadAtaque = 50;
			} else if (armaHeman==2) {
				ataqueHeman = 25;
				probabilidadAtaque = 40;
			} else if (armaHeman==3) {
				ataqueHeman = 30;
				probabilidadAtaque = 30;
			} else {
        System.out.println ("Arma incorrecta. Utilizando el arma anteriormente seleccionada.");
      }

			probabilidadExito = Math.random()*100;
			if (probabilidadExito<=probabilidadAtaque){
				vidaVampiro = vidaVampiro - ataqueHeman;
				System.out.println ("Heman Ataca. Vida del vampiro: "+vidaVampiro);
			} else {
				System.out.println ("Heman falla. Vida del vampiro: "+vidaVampiro);
			}
		}
		System.out.println ("................................................................................");

		if (vidaVampiro>0) {

			if (vidaVampiro>20) {
				probabilidadAtaque=50;
				probabilidadExito = Math.random()*100;
				if (probabilidadExito<=probabilidadAtaque){
					vidaHeman = vidaHeman - ataqueVampiro;
					System.out.println ("Vampiro ataca. Vida del Heman: "+vidaHeman);
				} else {
					System.out.println ("Vampiro falla. Vida del Heman: "+vidaHeman);
				}
			} else {
				probabilidadMegaAtaque = Math.random()*100;
				if(probabilidadMegaAtaque<=30){
					probabilidadExitoMegaAtaque = Math.random()*100;
					if (probabilidadExitoMegaAtaque<99) {
						vidaHeman = vidaHeman - 50;
						vidaVampiro = vidaVampiro - 10;
						System.out.println ("MegaAtaque de Vampiro. Vida del Heman: "+vidaHeman+" / Vida del Vampiro:"+vidaVampiro);

					}
				} else {
					vampiroHuyo=true;
					System.out.println ("El vampiro huye!");

				}
			}

		}

		System.out.println ("--------------------------------------------------------------------------------");
		System.out.println ("RESUMEN DE TURNO: Vida del Heman: "+vidaHeman+" / Vida del Vampiro: "+vidaVampiro);
		System.out.println ("================================================================================");

	}
  System.out.println ("FINAL DEL COMBATE. Vida del Heman: "+vidaHeman+" | Vida del Vampiro: "+vidaVampiro);
  if (vampiroHuyo==true) {
  	System.out.println ("Heman gana porque huye el Vampiro");
  }
  System.out.println ("================================================================================");


  }
}
