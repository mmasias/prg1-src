public class sismografo{

	public static void main(String[] args){
		
		int i,j;
		int zona,probabilidad;
		int zonaAnterior;
		int tiempoZona1, tiempoZona2, tiempoZona3;
		
		zona = 1;
		tiempoZona1 = 0;
		tiempoZona2 = 0;
		tiempoZona3 = 0;
		
		for(i=0;i<=12*60*60;i=i+1){
			
			zonaAnterior = zona;
			
			probabilidad = (int)(Math.random()*100);
			
			if(zonaAnterior==1){
				if (probabilidad<5){zona = 3;tiempoZona1=tiempoZona1+1;} else if (probabilidad<20) {zona = 2;tiempoZona2=tiempoZona2+1;} else {zona = 1;tiempoZona3=tiempoZona3+1;}
			}
			else if(zonaAnterior==2){
				if (probabilidad<30){zona = 1;tiempoZona1=tiempoZona1+1;} else if (probabilidad<80) {zona = 2;tiempoZona2=tiempoZona2+1;} else {zona = 3;tiempoZona3=tiempoZona3+1;}
			}
			else {
				if (probabilidad<40){zona = 1;tiempoZona1=tiempoZona1+1;} else if (probabilidad<80) {zona = 2;tiempoZona2=tiempoZona2+1;} else {zona = 3;tiempoZona3=tiempoZona3+1;}
			}

			if(zona>1){System.out.println("Minuto:"+i+"  Zona: "+zona+" luego de "+tiempoZona1+" minutos en calma");}

			if (zona==1){tiempoZona2=0;tiempoZona3=0;}
			if (zona==2){tiempoZona1=0;tiempoZona3=0;}
			if (zona==3){tiempoZona1=0;tiempoZona2=0;}			
			
		}
	
	}

}