import java.util.Scanner;

public class Palindromos {
//FALTA CORREGIR. NO FUNCIONA
	public static void main(String[] args) {
	
		System.out.println("Comprobar si la siguiente palabra es un palindromo");
		Scanner input = new Scanner(System.in);
		String enterString = input.nextLine();
		
		
	//	for (int i = 0; i<= (enterString.length() -1); i++) {
			
	//Desde aqui copiado de la pizarra	
			int low = 0;
			int high = enterString.length()-1;
			
			while(enterString.charAt(low) == enterString.charAt(high) && (low <= high)){
				low++;
				high--;
				
			if(low>high) {
				System.out.println("Yes");
				
				} else System.out.println("No");
				
			}
		/*	Avanzado. Falta completar para completar espacios en blanco
			do {
				while(enterString.charAt(low) == ' ')
					++low;
				while(enterString.charAt(high) == ' ')
					++high;
				if(enterString.charAt(low)== enterString.charAt(high)) {
					low++;
					high--;
					
				} else
			}
			*/
			
		}
		
		
	}


