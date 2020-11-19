import java.util.Scanner;
import java.util.Arrays;

public class ProcessingArrays {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Bienvenido al programa.");
		System.out.println("Selecciona una opcion: ");
		//Vamos a generar numeros aleatorios en primer lugar
		//Para perfeccionar el programa deberiamos de
		//preguntar al usuario que array quiere
		//si el escrito por el (caso 1) o el random (caso 2)
		int array_base [] = randomArrays();
		int op = 0;
		do {
			op = menu();
			switch (op) {
			//Revisar orden de los case
			case 1:
				System.out.println("Escribe los valores: ");
				System.out.println(Arrays.toString(escribeArrays()));
				break;
			case 2:
				System.out.println(Arrays.toString(randomArrays()));
				break;
			case 3:
				System.out.println("Suma arrays.");
				System.out.println( Suma_Valores_Array(array_base));
				break;
			case 4:		
				System.out.println(Valor_Max(array_base));
				break;
			case 5: 
				Valor_Min(array_base);
				System.out.println(Valor_Min(array_base));
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

	public static int[] escribeArrays() {
		int[] miarray = new int[5];
		for (int i = 0; i < (miarray.length); i++) {
			Scanner input = new Scanner(System.in);
			miarray[i] = input.nextInt();
		}
		return miarray;
	}

	public static int[] randomArrays() {
		int[] randomArray = new int[5];
		for (int i = 0; i <= (randomArray.length -1); i++) {
			randomArray[i] = (int) (Math.random() * 4);
			System.out.println("Has entroducido el " + randomArray[i]);
		}
		return randomArray;
	}
	
	public static int Suma_Valores_Array(int array_base []) {

		int suma = 0;
		for (int i = array_base[0]; i < array_base.length; i++) {
			suma += array_base[i];
		}
		return suma;

	}
	
	public static int Valor_Max (int array_base []) {
		int valor = array_base[0];
		for (int i = 1; i < array_base.length; i++) {
			if(array_base[i]<valor) 
				valor = array_base[i];
				System.out.println(valor);
					
		}return valor;
	}
	
	public static int Valor_Min (int array_base []) {
		int valor_min = 0;
		int valor = array_base[0];
		for (int i = 1; i < array_base.length; i++) {
			if(valor < array_base[i])
				valor_min = array_base[i];		
		}return valor_min;
	}
	
	public static void shufflingArray(int[] array_base){
		 
	     for (int i = 0; i < array_base.length; i++){
				int r = (int)(Math.random()*array_base.length);
				int aux = array_base[i];
				array_base[i] = array_base[r];
				array_base[r] = aux;
			}
	   
	 }  

}
