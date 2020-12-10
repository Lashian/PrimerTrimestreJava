import java.util.Scanner;

public class Autoevaluacion {

	// variable global
	static int top = 0;

	
	//Mi forma de hacer el ejercicio ha sido copiar los metodos cardToString y getCardValue
	//para que me devuelvan el numero de la carta sin el palo
	//luego a los valores 8, 9 y 10 les he dado un valor de 0.5
	
	//La mejor forma que se me ha ocurrido de hacerlo es asignarle un valor a toda la baraja
	//es decir en el array deck[21], la carta seria el 1 de bastos y su valor seria el 1.
	//pero no consigo hacer que lo imprima todo a la vez
	//es decir cuando llamas a drawCard para que te de una carta, no se como hacer que te de por ejemplo el Rey de espadas y te asigne 0.5
	//dejo el metodo empleado abajo
	
	
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
			case 4:
				play(deck);
				break;
			}

		} while (op != 5);
	}

	public static void printDeck(int[] deck) {
		for (int i = top; i < deck.length; i++) {
			System.out.println(getCardValue(deck[i]) + "de" + getSuit(deck[i]));
		}

	}

	public static String getCardValue(int c) {
		String[] cards = { "Rey", "AS", "1", "2", "3", "4", "5", "6", "7", "Sota", "Caballo" };

		return cards[c % 10];
	}

	public static String cardToString(int c) {
		return (getCardValue(c) + " de " + getSuit(c));
	}

	// AAAAAAAAAAAAAAAAA
	public static double cardToStringTwo(int c) {
		return (getCardValueTwo(c));
	}

	// AAAAAAAAAAAAA
	public static double getCardValueTwo(int c) {
		double[] cards = { 0.5, 1, 2, 3, 4, 5, 6, 7, 0.5, 0.5 };

		return cards[c % 10];
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

	public static int dealCard(int[] deck) { 
		if (top == deck.length)
			return 0;
		return deck[top++];
	}

	public static void play(int[] deck) {
		shuffle(deck);
		System.out.println("Player 1’s turn:");

		double player1 = myTurn(deck);// método que devuelve el total de puntos conseguidos

		System.out.println("Player 2's turn:");

		double player2 = myTurn(deck);
		
		

		report(player1, player2);

	}

	public static double myTurn(int[] deck) {

		double totalPoints = 0;
		if (totalPoints < 8.0) {

			Scanner input = new Scanner(System.in);
	
			totalPoints += (cardToStringTwo(dealCard(deck)));
			System.out.println("Your points for now: " + totalPoints);

			System.out.println("Do you wish to draw more cards? (y/n)");
			String option = input.next();

			while (option.equals("y")) {
				System.out.println("You draw a card: ");
				totalPoints += (cardToStringTwo(dealCard(deck)));
				System.out.println("Your points for now: " + totalPoints);
				System.out.println("Do you wish to draw more cards? (y/n)");
				option = input.next();
			}
		} else
			System.out.println("Sorry, you lost....");

		return totalPoints;
	}

	public static void report(double player1, double player2) {
		
		System.out.println("Player 1 got" + player1 + " points!");
		
		
		System.out.println("Player 2 got" + player2 + " points!");
	}

	public static double cardValue(int[] deck) {
		double cardValue = 0;
		for (int i = 0; i < deck.length; i++) {
			cardValue = deck[i%40];
			if (cardValue == (i % 10 + 8) || cardValue == (i % 10 + 9) || cardValue == (i % 10 + 10))
				cardValue = 0.5;

		}

		System.out.println(cardValue);
		return cardValue;
	}

	public static int menu() {
		Scanner input = new Scanner(System.in);
		int op = 0;
		System.out.println("Menu");
		System.out.println("\t1.- Print deck.");
		System.out.println("\t2.- Shuffle deck.");
		System.out.println("\t3.- Deal card.");
		System.out.println("\t4.- Play 7 and a half");
		System.out.println("\t5.- Exit.");
		System.out.println("\t\tOption:");
		op = input.nextInt();

		return op;
	}
	
	//Este es el metodo mencionado en el comentario de arriba
	public static double[] cardValueTest (int[] deck) {
		//Imprime todos los valores de la baraja en orden
		double[]deckTwo = new double[40];
		double cardValue = 0;
		for (int i = top; i < deck.length; i++) {
			cardValue = deck[i%10];
			deckTwo[i] = cardValue;
			
			if (cardValue == (i % 10 + 8) || cardValue == (i % 10 + 9) || cardValue == (i % 10 + 10)) {
				cardValue = 0.5;
				deckTwo[i] = cardValue;
				System.out.println(cardValue);
				
			} else System.out.println(cardValue);
			 
		} return deckTwo;
			
	}

}
