import java.util.Scanner;

public class ProcessingArrays {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Bienvenido al programa.");
		System.out.println("Selecciona una opcion: ");

		int op = 0;
		do {
			op = menu();
			switch (op) {
			case 1:
				System.out.println("Escribe los valores: ");
				escribeArrays();
			System.out.println(escribeArrays());
				break;
			case 2: randomArrays();
			System.out.println(randomArrays());
				break;
			case 3:
				break;
			case 4:
				break;
			case 5: //hexadecimal to decimal
			}

		} while (op != 8);
		System.out.println("Thank you for using this program!");

	}
	
	public static int menu() {
		Scanner input = new Scanner(System.in);
		int op;
		System.out.println("\t\tMenu");
		System.out.println("\t\t" + "____");
		System.out.println("\t\t1.- Inicia un array introduciendo valores");
		System.out.println("\t\t2.- Inicia un array con valores aleatorios");
		System.out.println("\t\t3.- Imprime arrays");
		System.out.println("\t\t4.- Suma todos los elementos de los arrays");
		System.out.println("\t\t5.- Encuentra el elemento más grande");
		System.out.println("\t\t6.- Encuentra el elemento mas pequeño");
		System.out.println("\t\t7.- Mezcla los elementos dentro de los arrays");
		System.out.println("\t\t8.- Salir");
		
		System.out.println("\t\t\t Selecciona una opción: ");
		op = input.nextInt();
		return op;
	}
	
	public static int[] escribeArrays (){
		int[] miarray = new int[5];
		for (int i = 0; i <= (miarray.length); i++) {
			Scanner input = new Scanner (System.in);
			miarray [i] = input.nextInt();
			//test
			System.out.println(":TEST: Has entroducido el " + miarray[i]);
		} return miarray;
		
	}
	
	public static int[] randomArrays (){
		int[] randomArray = new int[5];
		for (int i = 0; i <= randomArray.length; i++) {
			Scanner input = new Scanner (System.in);
			randomArray [i] = (int)(Math.random()*4);
			//test
			System.out.println("Has entroducido el " + randomArray[i]);
		} return randomArray;
		
	}

}
