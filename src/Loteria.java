import java.util.Scanner;

public class Loteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Bienvenido a la loteria.");
		int WinnerNumber = (int) ((Math.random() *100)+1);
		int DecenaWinnerNumber = (WinnerNumber /10);
		int UnidadesWinnerNumber = (WinnerNumber % 10);
		int ReverseWinnerNumber = (UnidadesWinnerNumber *10) + (DecenaWinnerNumber);
	
		System.out.println("Introduzca su numero de loteria entre 1 y 100: ");
		Scanner input = new Scanner (System.in);
		//
		
		System.out.println("----TEST El numero correcto es:" + WinnerNumber);
		System.out.println("----TEST El numero reverso es" + ReverseWinnerNumber);
		int boleto = input.nextInt();
		//Test decena/unidad
		int Decena = boleto / 10;
		int Unidades = boleto % 10;
		if(boleto <= 100 && boleto >(-1)) {
			System.out.println("Procesando...");
			
		} else System.out.println("Introduzca un numero valido");
		
		if (WinnerNumber == boleto) {
			System.out.println("ENHORABUENA, Has ganado el primer premio de 3000 euros");
		}
		else if (ReverseWinnerNumber == boleto) {
			System.out.println("Enhorabuena campeon, has acertado el numero reverso, te llevas 3000 pavos y una palmadita en la espalda");
		}
		else if((WinnerNumber /10) == (boleto /10)) {
			System.out.println("Has acertado una decena! Premio de 1000 euros");
		}
		else if((WinnerNumber %10) == (boleto % 10)) {
			System.out.println("Has acertado una unidad, premio de 500 euros");
			
		}
//		else if() {
			
	//	}
		else System.out.println("No has acertado ningun numero");
	}

}
