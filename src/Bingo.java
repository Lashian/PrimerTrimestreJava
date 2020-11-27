
public class Bingo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int[] carton() {

		int[] carton = new int[15];

		for (int i = 0; i < carton.length; i++) {
			carton[i] = (int) (Math.random() * 99+1);
		}
		return carton;
	}
	//Quitar el void y terminar este metodo
	//Lo veremos en los arrays bidimensionales
	public static void randomNumbers (int[]carton) {
		
		int randomNumber = (int) (Math.random()*99+1);
		
		for(int i = 0; i<carton.length;i++) {
			if (carton[i] == randomNumber) {
				
			}
			return;
		}
		
		
	}
}
