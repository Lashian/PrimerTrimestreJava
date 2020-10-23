import java.util.Scanner;

//while EnterNumber != 0
// crear programa que sume numeros hasta que entre un 0

public class NumerosPorTeclado {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Introduce un numero que se ira sumando.");
		int result = 0;
		int enterNumber = 1;
//		String report = "";
		while (enterNumber != 0) {
			enterNumber = input.nextInt();
			result += enterNumber;
			System.out.println("Resultado parcial de la suma: " + result);
		} 
		System.out.println("El resultado total es: " + result);
		
	}

}
