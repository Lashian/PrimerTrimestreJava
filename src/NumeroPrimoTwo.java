import java.util.Scanner;

public class NumeroPrimoTwo {

	public static void main(String[] args) {
		
		  Scanner input = new Scanner(System.in);
		  System.out.println("Introduce un numero para saber si es primo."); 
		  int enterPrimo = input.nextInt();
		  
		  for (int i = 2; i <= enterPrimo; i++ ) {
		  
		  if ((enterPrimo % i) != 0) { 
			  
		  } else if((enterPrimo / i)== 1) {
		  System.out.println("Es primo");
		  
		  } else break;
		  
		  }
	 }

}