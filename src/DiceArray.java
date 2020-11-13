import java.util.Scanner;

public class DiceArray {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int[] counter = new int [6]; //creo counter y 6 espacios en memoria.Los valores empiezan en 0
		
		counter = rollTheDice();
		
		System.out.println("Result: How many times....?");
		printArray(counter);
		
	}
	
	public static int[] rollTheDice() {
		int[] miarray = new int[6];
		for(int i = 0; i<100; i++) {
			int dice = (int) (Math.random()*6)+1;
			miarray[dice-1] = miarray[dice -1]+1;
		} return miarray;
		
	}
	
	public static void printArray(int[]miarray) {
		for (int i = 0; i <miarray.length; i++) {
			System.out.println((i+1) + "\t" + miarray[i] + " times.");
		}
	}

}
