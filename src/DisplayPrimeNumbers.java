public class DisplayPrimeNumbers {

	public static void main(String[] args) {

		boolean isPrimo = true;
		int cuenta = 0;
	
		for (int number = 1; cuenta <= 50; number++) {
			isPrimo = true;
			for (int i = 2; i < number; i++) {
				if ((number % i) == 0) {
					isPrimo = false;
				
				}
			}
	
			if (isPrimo) {
				System.out.println(number);
				cuenta++;
			}
			

		}
	}
} 