public class ejemploRepetitiva{

	public static void main(String[] args){

		int modoDepuracion; // 1 si estoy depurando.
		modoDepuracion=0;
		
		int x,y;
		x=0;
		y=0;

		while(x<10){
			y=0;
			while (y<4) {
				System.out.print("[ ][*]");
				y=y+1;
			}
			System.out.println("");
			x=x+1;
		}




	}
}