
public class DisplayPrimeNumbers {

	public static void main(String[] args) {

		boolean isPrimo = true;
		int cuenta = 0;
		for (int number = 1; cuenta <= 50; number++) {
			for (int i = 2; i < number; i++) {
				if ((number % i) == 0) {
					isPrimo = false;
					number++;

				}

			}
			System.out.println(number);
			number++;
			cuenta++;

		}
	}
}