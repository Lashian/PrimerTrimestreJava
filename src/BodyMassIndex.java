import java.util.Scanner;

//
public class BodyMassIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		
		System.out.println("Introduce tu altura: ");
		double altura = input.nextDouble();
		
		System.out.println("Introduce tu peso: ");
		double peso = input.nextDouble();
		
		double bmi = peso/Math.pow(altura, 2);
		System.out.println("Su BMI es: " + bmi);
		
		
		
		if(bmi < 18.5) {
			
			System.out.println("Su peso está por debajo de lo recomendado");
		}
		else if(bmi <25) {
			System.out.println("Su BMI es normal");
			
		}
		else if(bmi <30) {
			System.out.println("Su BMI esta por encima de lo normal");
		}
		else if(bmi >= 30){
			System.out.println("Tiene sobrepeso");
		}
		else System.out.println("Introduzca un dato correcto");
	}

}
