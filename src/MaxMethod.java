import java.util.Scanner;

public class MaxMethod {

		

public static void main(String[] args) {
	
	Scanner input = new Scanner (System.in);
	System.out.println("Mete dos numeros: ");
	int a = input.nextInt();
	int b = input.nextInt();
	
	int resultado = max (a, b);
	
	System.out.println("El mayor es: " + resultado);
	
}

public static int max(int a, int b) {

	int result = 0;
	
	if (a > b){
		
		result = a;
	} else 
		result = b;
	
	return result;
  }
}