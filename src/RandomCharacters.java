import java.util.Scanner;

public class RandomCharacters {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Bienvenido al programa.");
		System.out.println("Selecciona una opcion: ");

		int op = 0;
		do {
			op = menu();
			switch (op) {
			case 1:
				System.out.println("Generate a random number from  0 to 9");
				System.out.println(randomNumber());
				break;
			case 2:
				System.out.println("Generate random lower case chat");
				System.out.println(randomLowerCaseChar());
				break;
			case 3:
				System.out.println("Generate random upper case chat");
				System.out.println(randomUpperCaseChar());
				break;
			case 4:
				System.out.println("Generate key");
				System.out.println("How long you wanna make your key?");
				int larga = input.nextInt();
				generateKey(larga);
				break;
			}
		} while (op != 5);
		System.out.println("Thank you for using this program!");

	}

	public static int menu() {
		Scanner input = new Scanner(System.in);
		int op;
		System.out.println("\t\tMenu");
		System.out.println("\t\t" + "____");
		System.out.println("\t\t1.- Random number from 0 to 9 ");
		System.out.println("\t\t2.- Random lower case character");
		System.out.println("\t\t3.- Random lower upper character");
		System.out.println("\t\t4.- Generate key");
		System.out.println("\t\t5.- Exit");
		System.out.println("\t\t\t Your choice");
		op = input.nextInt();
		return op;
	}

	public static int randomNumber() {

		int number = (int) (Math.random() * 10);
		
		return number;
	}

	public static char randomLowerCaseChar() {
		// ASCII values from 97 - 122 where, 97 and 122 are inclusive.
		char lower = (char) ((char) (Math.random() * 26) + 97);
	
		return lower;
	}

	public static char randomUpperCaseChar() {
		// I values from 65 - 90 where, 65 and 90 are inclusive.
		char upper = (char) ((char) (Math.random() * 26) + 65);
	
		return upper;
	}

	public static String generateKey(int larga) {
		String key = "";
		for (int i = 1; i <= larga; i++) {		
			
			int randomMethod = (int) ((int) (Math.random() * 3) + 1);
			if (randomMethod == 1) {
				key +=	randomNumber();
			} else if (randomMethod == 2) {
				key +=	randomLowerCaseChar();	
			} else
				key += 	randomUpperCaseChar();	
		}
		System.out.println("Your key is: " + key);
		return key;
	}

}