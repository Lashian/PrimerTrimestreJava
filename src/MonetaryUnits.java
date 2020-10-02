import java.util.Scanner;

public class MonetaryUnits {

	//Descomponer el numero de monedas que tenemos
	//Porejemplo si damos 725 MONEDAS DE UN CENTIMO
	//Obtendremos 3 monedas de 2 euros, una de 1 euros, una de 20 centimos
	//y una de 5 centimos
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner (System.in);
		System.out.println("Introduzca el número de monedas de un céntimo: ");
		
		int centimos = input.nextInt();
		
		int dosEuros = (centimos / 200);
		int unEuros = (centimos / 100);
		int cincuentaCentimos = (centimos / 50);
		int veinteCentimos = (centimos / 20);
		int diezCentimos = (centimos / 10);
		
		System.out.println("Usted posee: " + dosEuros + "monedas de dos euros");
	
		System.out.println( + dosEuros + " monedas de dos euros");
		System.out.println( + unEuros + " monedas de dos euros");
		System.out.println( + cincuentaCentimos + " monedas de dos euros");
	
	}
}
