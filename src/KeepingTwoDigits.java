import java.util.Scanner;

public class KeepingTwoDigits {

	public static void main(String[] args) {
	
		Scanner input = new Scanner (System.in);
		System.out.println("Introduzca el precio de su compra para calcular los impuestos a pagar: " );
		
		double Compra = input.nextDouble();
		double Tax = (Compra /100)*20;
		double TotalCompra = (int)((Compra + Tax)*100)/100.0;
			
		System.out.println("Está pagando de impuestos: " + Tax +"€");
		System.out.println("Su precio final es " + TotalCompra + "€");
		
		
	}

}