import java.util.Scanner;

//while EnterNumber != 0

// crear programa que sume numeros hasta que entre un 0
public class NumerosPorTeclado {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Introce un numero");
		int enterNumber = input.nextInt();
		int result = 0;
		enterNumber = 1;
		while (enterNumber != 0) {
			enterNumber = input.nextInt();
			result += enterNumber;
			System.out.println("resultado " + (result));
		}
		
	}

}
