import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); 
		System.out.println("Introduce dos numeros positivos para calcular el mayor comun divisor");
		int a = input.nextInt();
		int b = input.nextInt();
		int menor = a > b ?   a : b ;
		
		while (a % menor !=0 || b % menor != 0) {
			menor--;
		}
		System.out.println("Greatest common divisor for " + a + " and " + b + " is: " + menor);
	}
}
