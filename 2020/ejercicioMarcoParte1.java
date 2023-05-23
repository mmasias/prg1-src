public class ejercicioMarcoParte1{
	public static void main(String[] args){

		double velocidadMarco, tiempoMarco, espacioMarco;
		
		double probabilidadClimatica;
		double monoEscapa, monoCansa;
		
		velocidadMarco = ((Math.random()*5)+10);
		tiempoMarco = ((Math.random()*2)+8);

		System.out.println("ANALISIS DE MARCO");

	// Analisis del clima
		probabilidadClimatica = Math.random();
		System.out.println(" > Probabilidad Climatica: "+probabilidadClimatica);
		if (probabilidadClimatica<0.1) {
			System.out.println(" > Lluvia fuerte");
			velocidadMarco = velocidadMarco * 0.25;
		} else if (probabilidadClimatica<0.4) {
			System.out.println(" > Lluvia normal");
			velocidadMarco = velocidadMarco * 0.75;
		} else {
			System.out.println(" > Buen tiempo");
		}
	// FIN DEL analisis del clima

	// Analisis del mono
		monoCansa = Math.random();
		monoEscapa = Math.random();
		if (monoCansa<0.25) {
			System.out.println(" > El mono se ha cansado");
			velocidadMarco = velocidadMarco * 0.9;
		}
		if (monoEscapa<0.15){
			System.out.println(" > El mono se ha escapado");
			tiempoMarco = tiempoMarco - 2;
		}
	// FIN DEL analisis del mono

		
		espacioMarco = velocidadMarco * tiempoMarco;
		
		System.out.println("La velocidad de Marco es: "+velocidadMarco);
		System.out.println("El tiempo de Marco es: "+tiempoMarco);
		
		System.out.println("El avance de Marco es: "+espacioMarco);
		
	
	}
}