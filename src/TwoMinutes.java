import java.util.Scanner;

public class TwoMinutes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int minutes;
		int resto;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Introduce una cantidad de segundos para calcular: ");
		
		int seconds = input.nextInt();
		
		minutes = seconds / 60;
		resto = minutes % 60;
		
		System.out.println("La cantidad de minutos es: " + minutes + "con un " + resto + "segundos.");
		
		
	}

}
