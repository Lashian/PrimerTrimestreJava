import java.util.Scanner;
//Practica bucles anidados
//
public class TablaDeMultiplicarVersionTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		System.out.println("Tabla de multiplicar. Introduce un numero: ");
		int EnterNumber = input.nextInt();
		for (int i = 1; 1<=EnterNumber; i++) {
			System.out.println("Tabla de multiplicardel numero: " + i);
				for (int j = 1; j <=10; j++) {
					System.out.println("\t" +i +"*" + j + "=" + (i*j));
				}
				System.out.println();
		}
	}
}