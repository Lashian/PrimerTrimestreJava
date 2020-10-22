import java.util.Scanner;

public class NumeroPrimoTwo {

	public static void main(String[] args) {

		
		
		  Scanner input = new Scanner(System.in);
		  System.out.println("Introce un numero"); int enterPrimo = input.nextInt();
		  int i = 0;
		  
		  for (i = 2; i < enterPrimo; i++ ) {
		  
		  if ((enterPrimo % i) != 0) { } else if((enterPrimo / i)== 1) {
		  System.out.println("primo");
		  
		  } else break;
		  
		  }
		 }

}
		
		/*
		Scanner input = new Scanner(System.in);
		System.out.println("Introce un numero");
		int enterPrimo = input.nextInt();
		boolean isPrimo = true;
		
		for (int i = 2; i < enterPrimo; i++ ) {		
			if ((enterPrimo % i) == 0) {
				isPrimo = false;
				break; 
			}
		}
	
		System.out.println(isPrimo ? "Es primo" : "No es Primo");
		*/
		
	
