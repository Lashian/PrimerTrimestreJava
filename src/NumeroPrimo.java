import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		// Crear programa que te identifique un numero primo
		
		Scanner input = new Scanner(System.in);
		System.out.println("Introce un numero");
		int enterPrimo = input.nextInt();
		boolean isPrimo = true;
		
		for (int i = 2; i < enterPrimo; i++ ) {		
			if ((enterPrimo % i) == 0) {
				isPrimo = false;
				break; 
			}
		}
	
		System.out.println(isPrimo ? "Es primo" : "No es Primo");
		}

	}