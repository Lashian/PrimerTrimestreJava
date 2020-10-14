import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int CorrectNumber = (int) (Math.random()* 100);
		System.out.println("TEST" + CorrectNumber);
		System.out.println("Introduce un numero: ");
		int EnterNumber = 0;
		EnterNumber = input.nextInt();
		
		while (EnterNumber < CorrectNumber) {
			System.out.println("Muy bajo");
			EnterNumber = input.nextInt();
			while(EnterNumber > CorrectNumber) {
				System.out.println("Muy alto");
				EnterNumber = input.nextInt();
			}
			
			
		}
		System.out.println("Has acertado");
	}

}
