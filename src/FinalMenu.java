import java.util.Scanner;

public class FinalMenu {
//crear un menu que te llame los siguientes metodos
	// determinar si un numero es primo boolean
	// determinar si es par o impar int
	// write common divisor int
	// pasar de decimal a hexadecimal String
	// salir

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Bienvenido al programa.");
		System.out.println("Selecciona una opcion: ");

		int op = 0;
		do {
			op = menu();
			switch (op) {
			case 1:
				System.out.println("Enter a Number to check if it's or not prime");
				int n = input.nextInt();
				if (NumeroPrimo(n)) {
					System.out.println("El numero " + n + "es primo");
				} else
					System.out.println("El numero " + n + "no es primo");
				break;
			case 2:
				System.out.println("Enter a Fº temperature: ");
				double enterTemperature = input.nextDouble();
				CoverTemperatures(enterTemperature);
				System.out.println("Los grados Cº son: ");
				break;
			case 3:
				System.out.println("Input two numbers: ");
				int n1 = input.nextInt();
				int n2 = input.nextInt();
				GreatestCommonDivisor(n1, n2);
				break;
			case 4:
				System.out.println("Input a decimal number: ");
				int enterDecimal = input.nextInt();
				System.out.println("The Hexadecimal number is: ");
				ConvertirDecimalesToHexadecimales(enterDecimal);
				break;
			case 5: //hexadecimal to decimal
			}

		} while (op != 6);
		System.out.println("Thank you for using this program!");
	}

	public static int menu() {
		Scanner input = new Scanner(System.in);
		int op;
		System.out.println("\t\tMenu");
		System.out.println("\t\t" + "____");
		System.out.println("\t\t1.- Is prime");
		System.out.println("\t\t2.- Convert temperatures");
		System.out.println("\t\t3.- Greatest Common Divisor");
		System.out.println("\t\t4.- Decimal number to hexadecimal");
		System.out.println("\t\t5.- Hexadecimal number to decimal");
		System.out.println("\t\t6.- Exit");
		System.out.println("\t\t\t Your choice");
		op = input.nextInt();
		return op;
	}

	public static boolean NumeroPrimo(int n) {
		boolean isPrimo = true;
		for (int i = 2; i < n; i++) {
			if ((n % i) == 0) {
				isPrimo = false;
			}
		}
		System.out.println(isPrimo ? "Es primo" : "No es Primo");
		return isPrimo;
	}

	public static int CoverTemperatures(double enterTemperature) {

		double celsius = (5.0 / 9) * (enterTemperature - 32);
		System.out.println("La temperatura el Celsius es: " + celsius + "ºC");
		return (int) celsius;
	}

	public static int GreatestCommonDivisor(int n1, int n2) {

		int menor = n1 > n2 ? n1 : n2;
		while (n1 % menor != 0 || n2 % menor != 0) {
			menor--;
		}
		System.out.println("Greatest common divisor for " + n1 + " and " + n2 + " is: " + menor);
		return menor;
	}

	public static String ConvertirDecimalesToHexadecimales(int enterDecimal) {

		int resto = 1;
		int dividendo = 0;
		String resultado = "";

		while (resto != 0) {
			dividendo = (enterDecimal / 16);
			resto = (enterDecimal % 16);
			enterDecimal = dividendo;

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
		// Usando el String Builder para darle la vuelta a un String
		String input2 = resultado;

		StringBuilder input1 = new StringBuilder();

		// append a string into StringBuilder input1
		input1.append(input2);

		// reverse StringBuilder input1
		input1 = input1.reverse();

		// print reversed String
		System.out.println(input1);
		return input2;

	}
	
	public static int HexadecimalToDecimal (String hexadecimal) {
		int decimal = 0;
		hexadecimal = hexadecimal.toUpperCase();
		int high = hexadecimal.length() -1;
		for (int i = 1; i <= high; i++) {
			char character = hexadecimal.charAt(i);
			int digit;
			if(character >= '0' && character <= '9') 
				// el '0' representa al numero ASCII del 0
				digit = character - '0';
				else if(character >= 'A' && character <= 'F') 
					digit = character - 'A' +10;
				  else return 0;		
			decimal += digit*Math.pow(16, high-i);
			}return decimal;
		} 
	}
