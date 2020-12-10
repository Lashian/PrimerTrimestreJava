import java.util.Scanner;

public class Cards {

	// variable global
	static int top = 0;

	public static void main(String[] args) {

		int[] deck = newDeck(40);
		int op;
		top = 0;
		do {
			op = menu();
			switch (op) {
			case 1:
				printDeck(deck);
				break;
			case 2:
				shuffle(deck);
				break;
			case 3:
				int card = dealCard(deck);
				if (card != 0)
					System.out.println(cardToString(card));
				else {
					System.out.println("Shuffling...Choose 3 again");
					top = 0;
					shuffle(deck);
				}
			}

		} while (op != 4);
	}

	public static void printDeck(int[] deck) {
		for (int i = top; i < deck.length; i++) {
			System.out.println(getCardValue(deck[i]) + "de" + getSuit(deck[i]));
		}

	}
	
	public static double cardValue (int[] deck) {
		double cardValue = 0;
		for (int i = top; i < deck.length; i++) {
			cardValue = deck[i];
			System.out.println(cardValue);
			//System.out.println(getCardValue(deck[i]) + "de" + getSuit(deck[i]));
		}
		
		
		return cardValue;
	}
	
	

	public static String getCardValue(int c) {
		String[] cards = { "Rey", "AS", "1", "2", "3", "4", "5", "6", "7", "Sota", "Caballo" };

		return cards[c % 10];
	}

	public static String cardToString(int c) {
		return (getCardValue(c) + " de " + getSuit(c));
	}

	public static String getSuit(int n) {
		String[] suits = { "Espada", "Basto", "Oro", "Copa" };
		if (n % 10 == 0)
			return suits[n / 10 - 1];
		return suits[n / 10];
	}

	public static int[] newDeck(int n) {
		int[] deck = new int[n];
		for (int i = 0; i < n; i++) {
			deck[i] = i + 1;
		}
		return deck;
	}

	public static void shuffle(int[] deck) {
		for (int i = top; i < deck.length; i++) {
			int r = (int) (Math.random() * 40);
			int aux = deck[i];
			deck[i] = deck[r];
			deck[r] = aux;
		}

	}

	public static int dealCard(int[] deck) { //
		if (top == deck.length)
			return 0;
		return deck[top++];
	}

	
	  
	public static int menu() {
		Scanner input = new Scanner(System.in);
		int op = 0;
		System.out.println("Menu");
		System.out.println("\t1.- Print deck.");
		System.out.println("\t2.- Shuffle deck.");
		System.out.println("\t3.- Deal card.");
		System.out.println("\t4.- Exit.");
		System.out.println("\t\tOption:");
		op = input.nextInt();

		return op;
	}

}
