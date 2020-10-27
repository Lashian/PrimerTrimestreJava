import java.util.Scanner;

public class ConvertirDecimalesToHexadecimales {

	public static void main(String[] args) {

// decimal: 256 se divide por 16
// el resto es un numero hexadecimal
// el cociente se vuelve a sividir por 16
// todos los resto se colocarian al reves, es decir, si tras el bucle salen AB82, deberia de ser 28BA
// bucle termina cuando el cociente sea 0

		Scanner input = new Scanner(System.in);

		System.out.println("Introduce un numero decimal: ");
		int enterNumber = input.nextInt();
		int resto = 1;
		int dividendo = 0;
		String resultado = "";

		while (resto != 0) {
			dividendo = (enterNumber / 16);
			resto = (enterNumber % 16);
			enterNumber = dividendo;

			if (resto != 0) {
				switch (resto) {
				case 10:
					resultado += "A";
					break;
				case 11:
					resultado += "B";
					break;
				case 12:
					resultado += "C";
					break;
				case 13:
					resultado += "D";
					break;
				case 14:
					resultado += "E";
					break;
				case 15:
					resultado += "F";
					break;
				default:
					resultado += Integer.toString(resto);
					break;
				}
	
			}

		}
		//Usando el String Builder para darle la vuelta a un String
		 String input2 = resultado;
		 
	        StringBuilder input1 = new StringBuilder();
	 
	        // append a string into StringBuilder input1
	        input1.append(input2);
	 
	        // reverse StringBuilder input1
	        input1 = input1.reverse();
	 
	        // print reversed String
	        System.out.println(input1);
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Introduce un numero decimal: ");
//		int enterNumber = input.nextInt();
//		String resultado = "";
//		
//		while(enterNumber % 16 != 0 ) {
//			int resto = enterNumber % 16;
//			enterNumber /= 16;
//		
//			switch (resto) {
//			case 10:
//				resultado += "A";
//				break;
//			case 11:
//				resultado += "B";
//				break;
//			case 12:
//				resultado += "C";
//				break;
//			case 13:
//				resultado += "D";
//				break;
//			case 14:
//				resultado += "E";
//				break;
//			case 15:
//				resultado += "F";
//				break;
//			default:
//				resultado += Integer.toString(resto);
//				break;
//			}
//			
//		}
//		
//		System.out.println(resultado);

	}

}
