import java.util.Scanner;

public class TwoMinutes {

	public static void main(String[] args) {
		int minutes;
		int resto;
		int hours;
		int rSeconds;
		Scanner input = new Scanner (System.in);
		
		System.out.println("Introduce una cantidad de segundos para calcular: ");
		
		int seconds = input.nextInt();
		
		hours = seconds / 3600;
		rSeconds = seconds % 3600;
		minutes = rSeconds /60;
		resto = rSeconds % 60;	
		
		System.out.println("La cantidad de horas es: " + hours + "La cantidad de minutos es: " + minutes + "con un " + resto + "segundos.");
		
		
	}

}
