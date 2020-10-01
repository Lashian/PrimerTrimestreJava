import java.util.Scanner;

public class ConvertTemperatures {

	public static void main(String[] args) {
	
		Scanner input = new Scanner (System.in);
		
		System.out.println("Introduce una temperatura en Fahrenhei: ");
		
		double EnterTemperature;
		EnterTemperature = input.nextDouble();
		
		double celsius = (5.0/9)*(EnterTemperature - 32);
		
		System.out.println("La temperatura el Celsius es: " + celsius +"ºC");
	}

}
