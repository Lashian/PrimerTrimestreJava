
public class DivisibleByTwoOrThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = (int) (Math.random()*100);
		int b = (int) (Math.random()*100);
		
		System.out.println("El primer numero es: " + a + " y el segundo: " + 3);
		
		if ((a %2 == 0) && (b %3 == 0) ) {
			System.out.println("Es divisible por 2 y por 3");
		}
		else if((a %2 == 0) || (b %3 == 0) ) {
			System.out.println("Es divisible por 2 o por 3");
		}
		
		else System.out.println("No es divisble");
		}
	} 
