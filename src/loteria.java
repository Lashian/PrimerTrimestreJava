import java.util.Scanner;

public class loteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Bienvenido a la loteria.");
		int WinnerNumber = (int) ((Math.random() *100)+1);
		
		System.out.println("Introduzca su numero de loteria entre 1 y 100: ");
		Scanner input = new Scanner (System.in);
		
		//Prueba
		System.out.println(WinnerNumber);
		int boleto = input.nextInt();
		
		if(boleto <= 100 && boleto >0) {
			System.out.println("Procesando...");
			
		} else System.out.println("Introduzca un numero valido");
		
		if (WinnerNumber == boleto) {
			System.out.println("ENHORABUENA, Has ganado el primer premio de 3000 euros");
		}
		else if((WinnerNumber /10) == (boleto /10)) {
			System.out.println("Has acertado una decena! Premio de 1000 euros");
		}
		else if((WinnerNumber %10) == (boleto % 10)) {
			System.out.println("Has acertado una unidad, premio de 500 euros");
			
		} else System.out.println("No has acertado ningun numero");
	}

}
