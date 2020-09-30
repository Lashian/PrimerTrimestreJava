import java.util.Scanner;

public class CalculateArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);
		System.out.println("Introduce el radio de un círculo: ");
		
		double area;
		double radius = input.nextDouble();
		
//area = radius * radius * 3.14;
		area = radius * radius * Math.PI ;
	
		
		System.out.println("El area del radio dado es: " + area);
		
	}

}
