import java.util.Scanner;

public class BiYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduzca un año: ");
		int year = input.nextInt();
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("Es bisiesto");
		}
		else if (year < 0) {
				System.out.println("Por favor introduzca un año valido");
			}
		 else System.out.println("No es bisiesto");
	}

	}
