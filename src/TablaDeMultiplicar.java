import java.util.Scanner;

public class TablaDeMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		System.out.println("Tabla de multiplicar. Introduce un numero: ");
		int EnterNumber = input.nextInt();
		System.out.println("La tabla del " + EnterNumber + " es: ");
		int Result = 0;
		for (int i = 1; i <= 10; i++) {
			Result = EnterNumber * i;
			System.out.println(Result);
		}
		
	}

}
