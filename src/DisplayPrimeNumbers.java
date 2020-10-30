public class DisplayPrimeNumbers {

	public static void main(String[] args) {

		boolean isPrimo = true;
		int cuenta = 0;
		//Este bucle incrementa la variable "number" hasta que la variable "cuenta" es 50 
		for (int number = 1; cuenta <= 50; number++) {
			//Este bucle comprueba si la variable "number" NO es un numero primo.
			//Este es mi ejercicio que hicimos anteriormente de comprobar primos
			for (int i = 2; i < number; i++) {
				if ((number % i) == 0) {
					isPrimo = false;
					number++;
					//En el caso de que sea false, se incrementa  "number" y vuelve a comprobar hasta que da un primo y se sale
				}
			}
			//Si ha llegado aqui significa que la variable "number" es primo y lo imprime
			System.out.println(number);
			cuenta++;
			//Aumentamos "cuenta" ya que es primo 

			
			//Basicamente lo que he hecho es añadirle un bucle al programa anterior del primo que hicimos
			//Para que en lugar de introducir un numero por Scanner vaya...
			//...un bucle vaya añadiendo numeros automaticamente
		}
	}
} 