import java.util.Scanner;

public class PlantillaMenu {

	public static void main(String[] args) {
		int op = 0;
		do {
			op = menu();
			switch (op) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:		
				break;
			case 5: 
			}
		} while (op != 6);
		System.out.println("Thank you for using this program!");

	}

	public static int menu() {
		Scanner input = new Scanner(System.in);
		int op;
		System.out.println("\t\tMenu");
		System.out.println("\t\t" + "____");
		System.out.println("\t\t1.-");
		System.out.println("\t\t2.- ");
		System.out.println("\t\t3.- ");
		System.out.println("\t\t4.- ");
		System.out.println("\t\t5.- ");
		System.out.println("\t\t6.- Exit");

		System.out.println("\t\t\t Enter an optionn: ");
		op = input.nextInt();
		return op;
	}

}


