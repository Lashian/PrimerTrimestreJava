import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		// Crear programa que te identifique un numero primo
		
		Scanner input = new Scanner(System.in);
		System.out.println("Introce un numero");
		int enterPrimo = input.nextInt();
		int i = 0;
		
		for (i = 1; i <= enterPrimo; i++ ) {
			if(((enterPrimo % i) == 0) && ((enterPrimo / i) == 1)) {
				System.out.println(i);
				System.out.println("El numero  es primo.");	
			} 

			else System.out.println("Numero no es primo.");
					
			}
		}

	}


// 		if((((enterPrimo % i) != 0)) && ( (enterPrimo / i) != 1 ) )