import java.util.Scanner;

public class Cards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]deck = newDeck(40);
		int op;
		do {
			op = menu();
			switch (op) {
			case 1: printDeck(deck);
			break;
			case 2: 
			
		}
		
	}while(op != 3);
}
	
	public static void printDeck(int[]deck) {
		for(int i =0; i <deck.length;i++) {
			System.out.println(getCardValue(deck[i]) + "de" +getSuit(deck[i]));
		}
		
	}
	
	public static String getCardValue(int c) {
		String[]cards = {"Rey", "AS", "1","2","3", "4", "5","6","7","Sota", "Caballo"};
		
		return cards [c%10];
	}
	
	public static String getSuit(int n) {
		String [] suits = {"Espada", "Basto", "Oro","Copa"};
		if(n%10 ==0)
			return suits[n/10-1];
		return suits[n/10];
	}
	
	
	public static int [] newDeck(int n) {
		int[]deck = new int[n];
		for (int i = 0; i<n;i++) {
			deck[i] = i+1;
		}return deck;
	}
	
	public static void shuffle (int []deck) {
		for (int i = 0; i< deck.length;i++) {
			int r = (int)(Math.random()*40);
			int aux = deck[i];
			deck[i] = deck[r];
			deck [r] = aux;
		}
		
	}
	//Work in progress
	public static int getCard (int[]deck) {
		int randomCard = (int) (Math.random()*40);
		deck = newDeck (randomCard);
		
		
		return randomCard;
	}
	
	public static int menu () {
		Scanner input = new Scanner (System.in);
		int op = 0;
		System.out.println("Menu");
		System.out.println("\t1.- Print deck.");
		System.out.println("\t2.- Shuffle deck.");
		System.out.println("\t3.- Exit.");
		System.out.println("\t\tOption:");
		op = input.nextInt();
		
		return op;
	}

}
