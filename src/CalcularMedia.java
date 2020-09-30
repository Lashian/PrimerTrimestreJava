import java.util.Scanner;

public class CalcularMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double Media;
		Scanner input = new Scanner (System.in);
		
		System.out.println("Introduce 3 números: ");
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		Media = (a + b + c) /3;
		
		System.out.println("La media de los números introducidos es: " + Media);
		

	}

}
